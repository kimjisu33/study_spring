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
		System.out.println(author+"의 시 "+title+"을 "+price+"에 산다");
	}

	public void sell() {
		System.out.println(author+"의 시 "+title+"을 "+price+"에 판다");

	}

	public void create() {
		System.out.println(author+"이 시 "+title+"을 만든다");
	}

}
