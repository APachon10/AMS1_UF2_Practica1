package Practica2;

public class DiaSemana {
	public static void main(String[] args) {
		DiaSemana programa = new DiaSemana();
		programa.inici();
	}
	public void inici() {
		String nom = diaDeLaSetmana(3);
		System.out.println("El tercer dia de la setmana és " + nom);
		nom = diaDeLaSetmana(5);
		System.out.println("El cinquè dia de la setmana és " + nom);
		nom = diaDeLaSetmana(15);
		System.out.println("El quinzè dia de la setmana és " + nom);
	}
	// Param. entrada: número del dia
	// Param. sortida: el nom del dia
	public String diaDeLaSetmana(int numDia) {
		String diaSemana = "";
		boolean salir =false;
		do{
			switch (numDia) {
			case 1:
				diaSemana = "Lunes";
				salir=true;
			case 2:
				diaSemana = "Martes";
				salir=true;
			case 3:
				salir=true;
				diaSemana = "Miercoles";
				break;
			case 4:
				diaSemana = "Jueves";
				salir=true;
			case 5:
				diaSemana = "Viernes";
				salir=true;
			case 6:
				diaSemana = "Sabado";
				salir=true;
			case 7:
				diaSemana = "Domingo ";
				salir=true;
			}
		}while(!salir);
		System.out.println();
		return diaSemana;
	}
}
