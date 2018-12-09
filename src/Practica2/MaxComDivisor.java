package Practica2;

import java.util.Scanner;

public class MaxComDivisor {
	public static void main(String[] args) {
		MaxComDivisor programa = new MaxComDivisor();
		programa.inici();
	}
	public void inici() {
		System.out.print("Escriu el valor a: ");
		int a = llegirEnterTeclat();
		System.out.print("Escriu el valor b: ");
		int b = llegirEnterTeclat();
		// Recordar que un m�tode s'avalua com una expressi�
		System.out.println("L'MCD de " + a + " i " + b + " �s " + mcd(a, b));
	}
	public int llegirEnterTeclat() {
		Scanner lector = new Scanner(System.in);
		int enterLlegit = 0;
		boolean llegit = false;
		while (!llegit) {
			llegit = lector.hasNextInt();
			if (llegit) {
				enterLlegit = lector.nextInt();
			} else {
				System.out.println("Aix� no �s un enter.");
				lector.next();
			}
		}
		lector.nextLine();
		return enterLlegit;
	}
	public int mcd(int a, int b) {
		int total  = 0;
		int Dividendo = 0;
		int Divisor=0;

		if(a>b){
			Dividendo = a;
			Divisor = b;
		}
		else{
			Dividendo = b;
			Divisor = a;
		}
		total = Dividendo  %  Divisor;
		do{            
			total = a % b;
			a = b;
			if (total != 0)
				b = total;            
		}while (total != 0);
		return b;
	}


}
