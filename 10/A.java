package chap09.sec01;

public class A {
	class B {
		int field1 = 1;
		int field2 = 2;
		B() {
			System.out.println("B 积己磊 角青");
		}
		
		void method1() {
			System.out.println("B method1 角青");
		}
		
		void method2() {
			System.out.println("B method2 角青");
		}
		
	}
	
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		System.out.println(b.field2);
		b.method2();
		
	}
	
	static class S {}
	S s1 = new S();
	
	static S s2 = new S();
	
	A() {
		S s3 = new S(); 
	}
	
	void method1() {
		S s = new S();
	}
	
	static void method2() {
		S s = new S();
	}
}
