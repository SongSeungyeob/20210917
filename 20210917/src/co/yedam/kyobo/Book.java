package co.yedam.kyobo;

public class Book 
{
	private String title;
	private String author;
	private String press;
	private int price;
	
	public Book(String title, String author, String press, int price) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("[ 책 제목 : %s, 저자 : %s, 출판사 : %s, 가격 : %d ]\n", title, author, press, price);
	}
}