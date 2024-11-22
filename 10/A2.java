package chap09.sec01;

public class A2 {
	String field = "A2 field";
	
	void method() {
		System.out.println("A method");
	}
	
	class B {
		String field = "B field";
		
		void method() {
			System.out.println("B method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A2.this.field);
			A2.this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
}
