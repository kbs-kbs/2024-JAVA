package ch08.sec01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		
		a = b;
		a.PrintState("B");
		
		a = c;
		a.PrintState("C");
		
		a = d;
		a.PrintState("D");
		
		a = e;
		a.PrintState("E");
		
	}

}
