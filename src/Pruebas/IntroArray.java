package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class IntroArray {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		IntroArray r = new IntroArray();
		int array_prueba []=  new int[10];
		String notas = "";
		String confirmacion = "";
		String [] notas2 = null;
		boolean salir = false;
		int i=0;
		do {
			System.out.println("Introduce las notas hasta que pongas -1");
			notas = scan.nextLine();
			for(i=0;i<notas.length();i++) {
				System.out.print("Cadena --> " + notas);
				notas2[i]= notas.split(" ");
				if(notas2[i].equals("-1")) {
					
				}
			}
		}while(!salir);
		//Mostramos el Array
		System.out.println("Vector Notas --> "+Arrays.toString(array_prueba));
	}
	public void leerNotas(int array_prueba [],String notas) {
		String notas2 []= notas.split(" "); 
		for (int j = 0; j < notas2.length; j++) {
			System.out.println("Notas 2 --> "  + notas2[j]);
			if(!notas2[j].equals("-1")) {
				int conver = Integer.parseInt(notas2[j]);
				System.out.println("Cadena convertida --> " +conver );
				// Metemos los numeros dentro del Array 
				if(array_prueba[j] == 0) {
					array_prueba[j] = conver;
				}else {
					System.out.println("Posicion Actual " + array_prueba[j]);
				}
			}else {
				System.out.println("Numero -1 detectado ");
			}	
		}
	}

}
