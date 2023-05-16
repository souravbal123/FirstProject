package method;

public class Addition {
public void add() {
	 int a =10;
	 int b=30;
	 int c = a+b;
	 System.out.println(c);
}
public void sum(int num1, int num2) {
	int result = num1 + num2;
	
	System.out.println(result);
}
public int sub(int num1 , int num2) {
	int result=num1-num2;
	return result;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Addition ad = new Addition();
  ad.add();
  Addition ad1 = new Addition();
  ad1.add();
  Addition ad2 = new Addition();
  ad2.add();
  ad.sum(25, 30);
  ad1.sum(50, 70);
  ad2.sum(36, 90);
  System.out.println(ad.sub(50, 10));
  
	}

}
