package collection;

public class CompareArray {
	public boolean compareOfTwo(int[] array, int[] array1) {
		// boolean result = true;
		if (array.length != array1.length) {
			return false;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != array1[i]) {
					return false;
				}
			}
			return true;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareArray ca = new CompareArray();
		int[] array = { 12, 14, 16, 18, 20 };
		int[] array1 = { 12, 14, 16, 18, 25 };
		System.out.println(ca.compareOfTwo(array, array1));
	}
}
