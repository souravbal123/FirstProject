package constructor;

public class ConstructorOverloading {
	int rollno;
	String name;
	int mark;

	ConstructorOverloading(int rollno, String name) {   //parameterized constructor
		this.rollno = rollno;
		this.name = name;
	}

	ConstructorOverloading(int rollno, String name, int mark) {   //parameterized constructor
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}

	public void display() {
		System.out.println(rollno + " " + name + " " + mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading cso = new ConstructorOverloading(1, "sourav");
		ConstructorOverloading cso1 = new ConstructorOverloading(2, "tom", 50);

		cso.display();
		cso1.display();

	}

}
