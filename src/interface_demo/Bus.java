package interface_demo;

public class Bus implements Vehicle,Rto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bu = new Bus();
		bu.start();
		bu.stop();
		bu.registration();
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("bus start");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("bus stops");
	}

	public void registration() {
		// TODO Auto-generated method stub
		System.out.println("bus regd:");
	}

}
