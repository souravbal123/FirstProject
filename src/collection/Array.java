package collection;

public class Array {
	public void sumArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			System.out.println(sum);
		}
		// return sum;
	}

	public void evenOdd(int[] array1) {
		int a = 0, b = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				a++;
			} else {
				b++;

			}
		}
		System.out.println("Even numbers in this array are " + a);
		System.out.println("odd numbers in this array are " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] marks = { 50, 60, 70, 80, 90 }; for (int index = 0; index <
		 * marks.length; index++) { System.out.println(marks[index]); }
		 * System.out.println(marks.length);
		 */
		Array ar = new Array();
		int[] array = { 14, 12, 15, 45, 85 };
		// ar.sumArray(array);
		ar.evenOdd(array);
	}

}
