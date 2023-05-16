package collection;

public class SortArrayInteger {
public int sortInteger(int[] array) {
 int num=0,i;
	for(i=0;i<array.length;i++) {
		for(int j=1;j<array.length;j++) {
			if(array[i]>array[j]) {
				num=array[i];
				array[i]=array[j];
				array[j]=num;
			}
		}
	}
	return array[i];  //this is not done.
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {12,78,54,10,5,11,98};
SortArrayInteger sit=new SortArrayInteger();
System.out.println(sit.sortInteger(array));
	}

}
