package kr.hs.study.beans;

public class publisher implements Employee {
	private int in;
	private int out;
	
	public publisher(int in, int out) {
		this.in=in;
		this.out=out;
	}
	public void Checkin() {
		System.out.println("�ۺ��� "+in+"�� ���");
	}

	public void Checkout() {
		System.out.println("�ۺ��� "+out+"�� ���");
	}

}
