package kr.hs.study.beans;

public class Designer implements Employee{
	private int in;
	private int out;
	
	public Designer(int in, int out) {
		this.in=in;
		this.out=out;
	}
	public void Checkin() {
		System.out.println("�����̳� "+in+"�� ���");
	}

	public void Checkout() {
		System.out.println("�����̳� "+out+"�� ���");
	}

}
