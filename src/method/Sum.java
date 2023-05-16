package method;

public class Sum {
public int sumOfNo(int num1,int num2) {
	return num1+num2;
}
public int productOfTwo(int num1,int num2) {
	return num1*num2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum su=new Sum();
System.out.println("sum of the no is "+su.sumOfNo(45, 90));
System.out.println("product of the no is "+su.productOfTwo(20,40));

	}

}
