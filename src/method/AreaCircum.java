package method;

public class AreaCircum {
public double area(double radius) {
	return (double) (3.17*radius*radius); //or return (3.17*radius*radius);
}
public double circum(double radius) {
	return (double) (2*3.17*radius);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircum ac=new AreaCircum();
		System.out.println("The area of circle is "+ac.area(12));
		System.out.println("The circumference of circle is "+ac.circum(10));
	}

}
