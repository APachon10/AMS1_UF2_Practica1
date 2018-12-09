package Practica2;

import java.util.Arrays;

public class MitjanaTresMaxim {
	public static void main(String[] args) {
		MitjanaTresMaxim m = new MitjanaTresMaxim();
		int valores []= {1,3,5,4,3,6,9,8,7,10};
		System.out.println("La media de los 3 numeros mas grandes és "+m.calcularMedia(valores));

	}
	public double calcularMedia(int valores []) {
		double media_3numeros=0;
		int valor_aux=valores[0];
		int valor1=0,valor2=0,valor3=0;
		int contador =0;
		
		metodoBurbuja(valores);
		
		for (int i = 0; i <valores.length; i++) {
			if(i<3) {
				contador++;// Esta es la variables 
				System.out.println("Los 3 Numeros mas Grandes són --> "+valores[i]);
				media_3numeros = media_3numeros+valores[i];
			}
		}
		media_3numeros = media_3numeros/contador;
		System.out.println("======================================");
		return media_3numeros;
	}
	public void metodoBurbuja(int valores []) {
		/*Aplico el Metodo burbuja a la inversa Para ordenar el Array de Mayor a menos 
		 * asi evitamos tener que comparar numero a numero y directamente los 3 primeros numeros del Array seran los mas grandes*/
		for(int i = 0; i < valores.length - 1; i++){
			for(int j = 0; j < valores.length - 1; j++){
				if (valores[j] < valores[j + 1]){
					int valor_aux = valores[j+1];
					valores[j+1] = valores[j];
					valores[j] = valor_aux;
				}
			}
		}
	}

}
