package ch08.sec01;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
