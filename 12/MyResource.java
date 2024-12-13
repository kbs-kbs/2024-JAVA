package ch11.sec02.exam01;

public class MyResource implements AutoCloseable {
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ") ����]");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") �б�]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") �б�]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + name + ") �ݱ�]");
	}
}