package oopsconcept;

public class Sbi extends Rbi {
	public void accoutopening() {
		System.out.println("today 1500 new account opened");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi sb = new Sbi();
		sb.repoRate();
		sb.loanAudit();
		Rbi ri = new Rbi();
		ri.loanAudit();
		Rbi rbi = new Sbi();// Dynamic method dispatch
	}

}
