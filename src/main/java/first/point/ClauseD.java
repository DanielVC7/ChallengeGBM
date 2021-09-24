package first.point;

import java.util.Scanner;

public class ClauseD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClauseD module = new ClauseD();
		module.residue();
	}

	public void residue() {
		@SuppressWarnings("resource")
		Scanner entradaNumero = new Scanner(System.in);
		int quotient = 0, residue = 0;
		String divisor = "", dividend = "";
		
		System.out.println(
				"Programa para calcular los módulos de dos números sin utilizar ningún operador de módulo incorporado %");
		System.out.print("Ingresar el dividendo: ");
		dividend = entradaNumero.nextLine();
		System.out.print("\n");
		System.out.print("Ingresar el divisor: ");
		divisor = entradaNumero.nextLine();
		System.out.print("\n");
		
		quotient = Integer.valueOf(dividend) / Integer.valueOf(divisor);
		residue = Integer.valueOf(dividend) - (quotient * Integer.valueOf(divisor));
		
		System.out.println("El número del residuo es " + residue);
		System.out.println("El calculo del modulo residuo(%) se realizo sin el operador incorporado.");
	};

}
