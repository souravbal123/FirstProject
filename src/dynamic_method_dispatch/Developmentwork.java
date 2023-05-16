package dynamic_method_dispatch;

public class Developmentwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block bok = new Block();
		Panchyat pc = new Panchyat();
		Village vla = new Village();
		
		/*
		 * bok.blockWork(); pc.panchyatWork(); pc.blockWork(); vla.blockWork();
		 * 
		 * vla.villageWork();
		 */
		Block blc;
		blc=new Panchyat();
		blc.waterProblem();
		blc=new Village();
		blc.waterProblem();
		
		
	}

}
