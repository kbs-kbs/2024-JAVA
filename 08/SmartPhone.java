package ch07.sec02;

public class SmartPhone extends Phone {
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super(model, color);
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) ������ �����.");
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("�������� ���¸� �����߽��ϴ�.");
	}
	
	public void internet() {
		System.out.println("���ͳݿ� �����մϴ�.");
	}
}
