package oopsconcept;

public class College {
 int college_id;
 String location;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 College gift = new College();
 gift.college_id = 1;
 gift.location = "BBS";
 College cvr = new College();
 cvr.college_id = 2;
 cvr.location = "PURI";
 System.out.println(gift.college_id + " is located at "+ gift.location);
 System.out.println(cvr.college_id + " is located at "+ cvr.location);
 
	}

}
