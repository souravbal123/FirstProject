package oopsconcept;
            //method overriding//
public class HDFC extends Rbi {
	public void repoRate() {
		System.out.println("current reporate is 8.5%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hf=new HDFC();
		hf.repoRate();
		Rbi ri=new Rbi();
		ri.repoRate();
	}

}
