package chap09.sec01;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("ÀÍ¸í ÀÚ½Ä Tire °´Ã¼1ÀÌ ±¼·¯°©´Ï´Ù.");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("ÀÍ¸í ÀÚ½Ä Tire °´Ã¼2°¡ ±¼·¯°©´Ï´Ù.");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
}
