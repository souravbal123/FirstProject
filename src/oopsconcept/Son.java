package oopsconcept;

public class Son extends Father {
	public void property3() {
		System.out.println("property situated at bbs");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son so = new Son();
		so.property1();
		so.property2();
		so.property3();
		so.display();
	}

}
