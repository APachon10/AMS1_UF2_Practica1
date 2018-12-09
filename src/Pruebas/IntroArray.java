package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class IntroArray {
	public static void main(String[] args) {
		IntroArray r = new IntroArray();
		int array_prueba []=  new int[10];
		String notas = "";
		r.Menu(array_prueba,notas);
		
	}
	public void IntrNotas(int array_prueba [],String notas) {
		System.out.println("Leyendo y insertando notas ");
		System.out.println("==============================");
		String notas2 []= notas.split(" "); 
		for (int j = 0; j < notas2.length; j++) {
			if(!notas2[j].equals("-1")) {
				if(array_prueba[j] != 0) {
					j++;
				}else {
					int conver = Integer.parseInt(notas2[j]);
					array_prueba[j] = conver;
				}
			}
			System.out.println("Array_Prueba--> "+ array_prueba[j]);
		}
	}
	public void Menu(int array_prueba [],String notas) {
		Scanner scan = new Scanner(System.in);
		int op=0;
		do {
			System.out.println("Bienvenido que operacion desea realizar ? "
					+ "\n1- Añadir Notas"
					+ "\n2- Salir ");
			op = scan.nextInt();
			switch (op) {
			case 1:
				leerNotas2(array_prueba);
				System.out.println("Vector Notas --> "+Arrays.toString(array_prueba));
				break;

			default:
				break;
			}
		}while(op!=2);
	}
	public void leerNotas2(int array_prueba []) {
		Scanner scan = new Scanner(System.in);
		String [] notas2 = null;
		boolean salir = false;
		int i=0;
		String notas = "";
		do {
			System.out.println("Introduce las notas hasta que pongas -1");
			notas = scan.nextLine();
			notas2= notas.split(" ");
			//Recorremos la cadena 
			for(i=0;i<notas2.length;i++) {
				if(notas2[i].equals("-1")) {
					salir=true;
				}else {
					IntrNotas(array_prueba, notas);
				}
			}
		}while(!salir);
	}
}
