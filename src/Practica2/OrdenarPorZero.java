package Practica2;

import java.util.Arrays;

public class OrdenarPorZero {
	public static void main(String[] args) {
		OrdenarPorZero  programa  = new OrdenarPorZero();
		String numeros[] = {"100","2014","12","30","302","40020","7009","500000"};
		System.out.println("Hay un total de "+ programa.contarZeros(numeros));
	}
	public int  contarZeros(String numeros[]) {
		mostrarVector(numeros);
		int contadorZeros = 0; 
		int contador =0;
		for (int i = 0; i < numeros.length ; i++) {
			
			if (numeros[i].charAt(i) == '0') {
				contadorZeros++;
			} 
		}
		return contadorZeros; 
		
	}
	public void mostrarVector(String numeros[]) {
		System.out.println("Vector Numeros --> " + Arrays.toString(numeros));
	}
}
