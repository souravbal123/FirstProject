package interface_demo;

public class BJP implements Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BJP bjp = new BJP();
		bjp.covid_guidelines();
		bjp.voting_guidelines();
		Election el=new BJP(); //run time polymorphism
		el.covid_guidelines(); //run time polymorphism
	}

	public void covid_guidelines() {
		// TODO Auto-generated method stub
		System.out.println("covid guidelines should be followed");
	}

	public void voting_guidelines() {
		// TODO Auto-generated method stub
		System.out.println("voting guidelines should be followed");
	}

}
