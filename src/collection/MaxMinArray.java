package collection;

public class MaxMinArray {
	public int maxarray(int[] array) {
		int a = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > a) {
				a = array[i];
			}
		}
		return a;
	}

	public int minarray(int[] array) {
		int b = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < b) {
				b = array[i];
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinArray ma = new MaxMinArray();
		int[] array = { 45, 85, 65, 72, 96 };
		System.out.println("Maximum value in this array is= " + ma.maxarray(array));
		System.out.println("Minimum value in this array is= " + ma.minarray(array));

	}

}
