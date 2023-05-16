package collection;

public class HighestLowestElement {
public int highest(int array[]) {
	int max=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]>max) {
			max=array[i];
		}
	}
	return max;
}
public int lowest(int array[]) {
	int min=array[0];
	for(int i=0;i<array.length;i++) {
		if(array[i]<min) {
			min=array[i];
		}
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighestLowestElement hle=new HighestLowestElement();
		int array[]= {45,56,88,25,54};
		System.out.println("Highest element in this array is: "+hle.highest(array));
		System.out.println("Lowest element in this array is: "+hle.lowest(array));
	}

}
