package method;

public class Practice2 {
	public int maxNo(int num, int num1, int num2) {
		if (num > num1 && num > num2) {
			return num;
		} else if (num1 > num && num1 > num2) {

			return num1;
		} else {

			return num2;
		}

	}

	public int minNo(int num, int num1, int num2) {
		if (num < num1 && num < num2) {

			return num;
		} else if (num1 < num && num1 < num2) {

			return num1;
		} else {

			return num2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 prc = new Practice2();
		System.out.println("min no among these is = "+prc.minNo(56, 45, 50));
		System.out.println("max no among these is = "+prc.maxNo(78, 80, 100));

	}

}
