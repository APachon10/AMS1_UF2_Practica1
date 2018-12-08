package Pruebas;

import java.util.Scanner;

public class Contar_As {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena = "";
		boolean salir = false;
		
		do {
			System.out.println("Introduce una cadena ");
			cadena = sc.nextLine();
			if(cadena.equalsIgnoreCase("fi")) {
				salir = true;
				System.out.println("Programa Terminado ");
			}else {
				contar_As(cadena);
			}
			
		}while(!salir);
	}
	public static void contar_As(String cadena){
		String cadena_auxiliar = "" ;
		cadena_auxiliar = cadena_auxiliar;
		int cont1=0,cont_auxiliar = 0;
		
		System.out.println("cadena anterior --> "+cadena_auxiliar);
		System.out.println("================================");
		System.out.println("cadena actual --> "+cadena);
		
		cadena = cadena_auxiliar;
		
	}
}
