package oopsconcept;

public class Father extends Grandfather {
	public void property2() {
		System.out.println("property situated at ctc");
	}

	public void display() {
   System.out.println("multiple inheritance 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father fth = new Father();
		fth.property1();
		fth.property2();
	}

}
