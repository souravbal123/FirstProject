package method;

public class Voting {
	public String eligibleForVote(int age) {
		if (age >= 18) {
			return "Eligible for vote";
		} else {
			return "Not eligible for vote.";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting vg = new Voting();
		System.out.println("He/She is " + vg.eligibleForVote(19));
		System.out.println("He/She is " + vg.eligibleForVote(12));
	}

}
