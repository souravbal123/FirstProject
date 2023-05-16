package method;

public class Practice {
	public void findEvenOdd(int start, int end, String result) {
		String result1 = "even";
		String result2 = "odd";
		if (start == end) {
			System.out.println("This is invalid input");
		} else {
			if (result1.equalsIgnoreCase(result)) {
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
			} else if (result2.equalsIgnoreCase(result)) {
				for (int i = start; i <= end; i++) {
					if (i % 2 == 1) {
						System.out.println(i);
					}
				}
			}
		}
	}

	public String findEvenOdd1(int num) {
		if (num % 2 == 0) {
			System.out.println("Even");
			return "even";
		} else {
			System.out.println("Odd");
			return "odd";
		}

	}

	public boolean matchString(String s1, String s2) {
		if (s1 == s2) {
			// System.out.println("Match record");
			return true;
		} else {
			// System.out.println("Mismatch record");
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice pr = new Practice();
		// pr.findEvenOdd(50, 60, "Odd");
		// pr.findEvenOdd1(6);
		// int num = 5;
		// System.out.println(num + " is an " + pr.findEvenOdd1(num) + " number");
		System.out.println(pr.matchString("car", "bus"));

	}

}
