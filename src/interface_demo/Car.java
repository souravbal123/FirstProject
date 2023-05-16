package interface_demo;

public class Car implements Vehicle, Rto {  //multiple inheritance possible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		cr.start();
		cr.stop();
		cr.registration();
//cr.vehicle_no="VH";
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car started");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car stopped");
	}

	public void registration() {
		// TODO Auto-generated method stub
		System.out.println("car regd");
	}

}
