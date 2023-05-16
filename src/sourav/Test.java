package sourav;

class Bank {
	int getinterest() {
		return 0;
	}
}

class A extends Bank {
	int getinterest() {
		return 1;
	}
}

class B extends Bank {
	int getinterest() {
		return 5;
	}
}

class C extends Bank {
	int getinterest() {
		return 7;
	}
}

public class Test {
	public static void main(String args[]) {
		Bank x;
		x = new A();
		System.out.println(x.getinterest());
		x = new B();
		System.out.println(x.getinterest());
		x = new C();

		System.out.println(x.getinterest());
	}
}