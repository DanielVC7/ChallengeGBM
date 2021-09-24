package first.point;

import java.util.Arrays;

public class ClauseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClauseB validacion = new ClauseB();
		validacion.validationArray();
	}

	public void validationArray() {
		String array[] = { "a", "b", "c", "d" };
		String firstValue = "a", secondValue = "b", thirdValue = "f";
		boolean validation = true;

		System.out.println("El arreglo que se validara es ['a''b''c''d']");
		validation = Arrays.asList(array).contains(firstValue);
		System.out.println("El arreglo contiene el caracter " + firstValue + "\n" + validation);

		validation = Arrays.asList(array).contains(secondValue);
		System.out.println("El arreglo contiene el caracter " + secondValue + "\n" + validation);

		validation = Arrays.asList(array).contains(thirdValue);
		System.out.println("El arreglo contiene el caracter " + thirdValue + "\n" + validation);
	}
}
