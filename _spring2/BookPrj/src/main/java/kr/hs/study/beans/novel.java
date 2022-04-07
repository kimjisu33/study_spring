package kr.hs.study.beans;

public class novel implements Book {
	private String author;
	private String title;
	private int price;
	
	public novel(String author, String title, int price) {
		this.author=author;
		this.title=title;
		this.price=price;
	}
	
	public void buy() {
		System.out.println(author+"의 소설 "+title+"을 "+price+"에 산다");
	}

	public void sell() {
		System.out.println(author+"의 소설 "+title+"을 "+price+"에 판다");

	}

	public void create() {
		System.out.println(author+"이 소설 "+title+"을 만든다");
	}

}
