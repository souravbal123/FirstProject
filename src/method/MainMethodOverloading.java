package method;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //System.out.println("Main method");
       MainMethodOverloading MMO=new MainMethodOverloading();
       int []array= {12,15,45};
       MMO.main(array);
       MMO.main();
	}
	public static void main(int[] args) {
		// TODO Auto-generated method stub
   System.out.println("Overloaded main method-int");
	}
	public static void main() {
		// TODO Auto-generated method stub
		 System.out.println("Overloaded main method-double");
	}
	

}
