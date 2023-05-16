package oopsconcept;

//method overloading..

public class Polymorphism {
public void addition() {
	int num = 10;
	int num1 = 20;
	int num2=num+num1;
	System.out.println(num2);
}
public void addition(int num,int num1) {
	int num2=num+num1;
	System.out.println(num2);
}
public void addition(double num,double num1) {
	double num2=num+num1;
	System.out.println(num2);
}
public void addition(double num3,double num4,double num5) {
	double num2=num3+num4+num5;
	System.out.println(num2);
}
public void addition(int num,double num1) {
	double num2=num+num1;
	System.out.println(num2);
}
public void addition(double num,int num1) {
	double num2=num+num1;
	System.out.println(num2);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism poly=new Polymorphism();
		poly.addition();
		poly.addition(10, 60);
		poly.addition(12.5, 45.6);
		poly.addition(15.5, 20.56, 40.58);
		poly.addition(15, 20.56);
		poly.addition(20.89, 10);
		
		
	}

}
