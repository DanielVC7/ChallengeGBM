package first.point;

public class ClauseC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClauseC sumArray = new ClauseC();
		sumArray.sumElementsArray();
	}

	public void sumElementsArray() {
		int array[] = { 1, 34, 56, 72, 123 };
		int sumArray = 0;

		for (int i = 0; i < array.length; i++) {
			sumArray = sumArray + array[i];
		}

		System.out.println("La suma total del arreglo [1,34,56,72,123] es " + sumArray + ".");
	}
}
