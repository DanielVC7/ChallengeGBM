package first.point;

import java.util.Scanner;

public class ClauseA {

	public static void main(String[] args) {
		ClauseA calculateFactorial = new ClauseA();
		calculateFactorial.factorial();
	}

	public void factorial() {
		@SuppressWarnings("resource")
		Scanner entradaNumero = new Scanner(System.in);
		int resultFactorial = 1, iFactorial = 0;
		String inputNumber = "";
		
		System.out.print("Ingrese un numero: ");
		inputNumber = entradaNumero.nextLine();
		iFactorial = Integer.valueOf(inputNumber);
		for (int i = 2; i <= iFactorial; i++) {
			resultFactorial = resultFactorial * i;
		}
		
		System.out.print("El factorial del numero " + inputNumber + " es " + resultFactorial+".");
	}
}
