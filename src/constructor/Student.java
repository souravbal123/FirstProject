package constructor;

public class Student {
	int rollno;
	String name;

	Student() {
		rollno = 1;
		name = "sourav";
	}

	public Student(int rollno, String name) { // we can also write Student(int roll---)
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sourav = new Student();
		System.out.println(sourav.rollno + " " + sourav.name);
		Student laxman = new Student();
		System.out.println(laxman.rollno + " " + laxman.name);
		Student ram = new Student(3, "ram");
		System.out.println(ram.rollno + " " + ram.name);
		Student hari = new Student(4, "hari");
		System.out.println(hari.rollno + " " + hari.name);

	}

}
