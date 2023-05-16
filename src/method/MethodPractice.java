package method;

public class MethodPractice {
public void sum(int a,int b) {
	for(int i=0;i<=b;i++) {
		a=a+i;
	}System.out.println(a);
}
public int upto(int b,int c) {
	for(int i=0;i<=c;i++) {
		b=b+i;
	}
	System.out.println(b);
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodPractice mp=new MethodPractice();
       mp.sum(0, 5);
       mp.upto(0, 5);
       mp.sum(0, 100);
       mp.upto(0, 100);
	}

}
