package collection;

public class AvgArrayIndex {
	public double averageArray(int[] array) {
		double sum = 0, avg = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		avg = sum / array.length;
		return avg;
	}

	public int indexOfArray(int[] array, int num) {
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if (num == array[i]) {
				break;
				}
		}
		return i;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvgArrayIndex ar = new AvgArrayIndex();
		int[] array = { 4, 12, 15, 45, 52 };
		System.out.println("Average of this array series is= " + ar.averageArray(array));
		System.out.println("the index of 15 is= "+ar.indexOfArray(array, 15));
	}

}
