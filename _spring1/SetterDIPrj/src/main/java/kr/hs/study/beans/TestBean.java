
package kr.hs.study.beans;

public class TestBean {
	private int a;
	private double b;
	private String c;
	private DataBean d;
	private DataBean e;
	
	public TestBean(int a, double b, String c, DataBean d, DataBean e) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		
	}

	public void printData() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	
}
