package static_demo;

public class Static_demo {
	
static String name="sourav";  //datamemeber or class level variable or class attribute or instance variable
public static void print() {  //method or member function or member method
	System.out.println("abc");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_demo sd=new Static_demo();
		System.out.println(sd.name);
		System.out.println(Static_demo.name);
		sd.print();
		Static_demo.print();
		
	}

}
