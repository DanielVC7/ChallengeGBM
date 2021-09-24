package first.point;

import java.util.Scanner;

public class ClauseE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClauseE calculate = new ClauseE();
		calculate.calculateDaysInAMonth();
	}

	public void calculateDaysInAMonth() {
		@SuppressWarnings("resource")
		Scanner entradaNumero = new Scanner(System.in);
		int month = 0, year = 0, numDays = 0;
		System.out.print("Ingresa el numero del mes: ");
		month = entradaNumero.nextInt();
		System.out.print("\n");
		System.out.print("Ingresa el numero del año: ");
		year = entradaNumero.nextInt();
		System.out.print("\n");

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					numDays = 29;
				} else {
					numDays = 28;
				}
				break;
			default:
				System.out.println("El mes " + month + " no existe.");
				break;
		}

		if (numDays != 0) {
			System.out.println("El mes " + month + " tiene el numero de dias " + numDays + ".");
		}
	}

}
