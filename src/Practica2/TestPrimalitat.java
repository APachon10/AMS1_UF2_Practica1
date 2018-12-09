package Practica2;

import java.util.Scanner;

public class TestPrimalitat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero=0;
		do {
			System.out.print("Introduce un Numero:");
			numero  =scan.nextInt();
		}while(numero<0);
		TestPrimalitat p = new TestPrimalitat();
		System.out.println("El "+ numero +" és primer? "+p.esPrimer(numero));
	}
	public boolean esPrimer(int num) {
		boolean es_primo = true;
		
		for(int i = 2; i<num; i++) {
			if (num % i == 0) {
				es_primo = false;
				break;
			}
		}
		return es_primo;
	}
}
