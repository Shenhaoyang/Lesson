package shiyan5_3;

class Book{
	private String title;
	private String auther;
	private double price;
	private String publisher;
	//title，author，price，publisher四个成员变量
	
	Book(String title, String auther)
	{
		this.title = title;
		this.auther = auther;
	}
	//重写Book类的构造方法，该方法传入title和author两个参数。

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public String getAuther() {
		return auther;
	}
	//title和author只能通过get（）方法访问，price和publisher可以通过set（）和get（）访问
	
}

public class R3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Book book = new Book("冰与火之歌", "乔治·R·R·马丁");
		book.setPrice(88.88);
		book.setPublisher("重庆出版社");
		System.out.println(book.getTitle());
		System.out.println(book.getAuther());
		System.out.println(book.getPrice());
		System.out.println(book.getPublisher());
	}

}
