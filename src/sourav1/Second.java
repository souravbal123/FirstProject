package sourav1;

public class Second {
	public void Firstmethod() {
		System.out.println("HELLO YOUTUBE.");
	}

	public int sum1(int num2, int num3) {
		System.out.println(num3 + num2);
		return num3 + num2;

	}

	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public String loc(String loc1, String loc2) {
		System.out.println(loc1 + loc2);
		return loc1 + loc2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second se = new Second();
		se.Firstmethod();
		se.Firstmethod();
		se.sum(38, 80);
		se.loc("BBSR", "JJKR");
		se.sum1(7, 90);
	}

}
