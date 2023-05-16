package collection;

public class FindElement {
	public void numberExists(int[] array, int num) {
		int i = 0;
		boolean result=false;
		for (i = 0; i < array.length; i++) {
			if (num == array[i]) {
				//System.out.println("Number is present");
         result =true;
         break;
			}
		}
       if(result) {
    	   System.out.println("Number is present");
       }else {
    	   System.out.println("Number is not present");
       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElement fe = new FindElement();
		int[] array = { 12, 15, 17, 54, 55 };
		fe.numberExists(array, 54);
	}

}
