package sourav;

public class SwapNumbers {
public void swapping(int num,int num1) {
	int a;
	System.out.println("Before swapping");
	System.out.println("value of 1st number"+num);
	System.out.println("value of 2nd number"+num1);
	a=num;
	num=num1;
	num1=a;
	System.out.println();
	System.out.println();
	System.out.println("After swapping");
	System.out.println("value of 1st number"+num);
	System.out.println("value of 2nd number"+num1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers sn=new SwapNumbers();
		sn.swapping(5, 6);
	}

}
