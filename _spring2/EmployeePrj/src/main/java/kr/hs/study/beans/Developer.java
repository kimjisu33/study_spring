package kr.hs.study.beans;

public class Developer implements Employee {
	private int in;
	private int out;
	
	public Developer(int in, int out) {
		this.in=in;
		this.out=out;
	}
	public void Checkin() {
		System.out.println("������ "+in+"�� ���");
	}

	public void Checkout() {
		System.out.println("������ "+out+"�� ���");
	}

}