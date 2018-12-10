package Practica2;

import java.util.Scanner;

public class ContarVocales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		ContarVocales c = new ContarVocales();

		String cad = "";
		System.out.println("Introduce una cadena ");
		cad = scan.nextLine();
		System.out.println("La cadena con mas vocales és "+c.contarVocales2(cad));

	}
	public String  contarVocales2(String cadena ) {
		int contador_vocales = 0;
		int contador_auxiliar =contador_vocales;

		String palabras [] = cadena.split(" "); 
		String cadena_mas_vocales = palabras[0];

		for (int i = 0; i < palabras.length; i++) {
			contador_auxiliar = contador_vocales; 
			System.out.println("Examinando --> " + palabras[i]);
			if( (palabras[i].contains("a")) || (palabras[i].contains("e")) || (palabras[i].contains("i")) || (palabras[i].contains("o")) || (palabras[i].contains("u"))) {
				System.out.println("Contador Auxiliar --> " +contador_auxiliar);
				contador_vocales++;
				System.out.println("Contador Vocales --> " +contador_vocales);
				if(contador_vocales > contador_auxiliar) {
					contador_auxiliar = contador_vocales;
					cadena_mas_vocales = palabras[i];
				}else {
					cadena_mas_vocales= cadena_mas_vocales;
				} 	
			}else {
				System.out.println("La palabra " + palabras[i]+ "no contiene vocales ");
			}
		}
		return cadena_mas_vocales;	
	}
}
