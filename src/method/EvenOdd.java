package method;

public class EvenOdd {
	// or we can write public int and return num but we cant show it is odd
	// or even like this type..
	public String findEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("The no is even");
			return "even";
		} else {
			System.out.println("The no is odd");
			return "odd";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd eo = new EvenOdd();
		eo.findEvenOdd(54);
		int num = 45;
		System.out.println(num + " is an " + eo.findEvenOdd(num) + " number");

	}

}
