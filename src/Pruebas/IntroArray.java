package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class IntroArray {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		IntroArray r = new IntroArray();
		int array_prueba []=  new int[10];
		String notas = "";
		String [] notas2 = null;
		boolean salir = false;
		int i=0;
		do {
			System.out.println("Introduce las notas hasta que pongas -1");
			notas = scan.nextLine();
			notas2= notas.split(" ");
			for(i=0;i<notas2.length;i++) {
				System.out.println("Cadena --> " + notas2[i]);
				if(notas2[i].equals("-1")) {
					salir=true;
				}else {
					r.leerNotas(array_prueba, notas);
				}
			}
		}while(!salir);
		System.out.println("=========================");
		//Mostramos el Array
		System.out.println("Vector Notas --> "+Arrays.toString(array_prueba));
	}
	public void leerNotas(int array_prueba [],String notas) {
		System.out.println("Leyendo y insertando notas ");
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
	/*public void Menu() {
		Scanner scan = new Scanner(System.in);
		int op=0;

		do {
			System.out.println("Bienvenido que operacion desea realizar ? "
					+ "\n1- Añadir Notas"
					+ "\n2- Salir ");
			op = scan.nextInt();

			switch (op) {
			case 1:
				leerNotas(array_prueba, notas);
				break;

			default:
				break;
			}
		}while(op!=2);*/
}
