package kr.hs.study.beans;

public class poet implements Book {
	private String author;
	private String title;
	private int price;
	
	public poet(String author, String title, int price) {
		this.author=author;
		this.title=title;
		this.price=price;
	}
	
	public void buy() {
		System.out.println(author+"�� �� "+title+"�� "+price+"�� ���");
	}

	public void sell() {
		System.out.println(author+"�� �� "+title+"�� "+price+"�� �Ǵ�");

	}

	public void create() {
		System.out.println(author+"�� �� "+title+"�� �����");
	}

}
