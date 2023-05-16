package collection;

public class Reverse {
	public static void reverseArray(int[] array) {
		int i = 0;
		for (i = array.length -1; i >= 0; i--) {
			 System.out.println(array[i]);
		}
		//return array[i]; printing the array in reverse order..
	}
	public int[] reverseArray1(int[] array) {
		
		
		return array;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse rev = new Reverse();
		int[] array = { 15, 45, 12, 20, 22 };
		//System.out.println(rev.reverseArray(array));
		// rev.reverseArray(array);
		 Reverse.reverseArray(array);
	}

}
