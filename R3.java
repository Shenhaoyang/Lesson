package shiyan5_3;

class Book{
	private String title;
	private String auther;
	private double price;
	private String publisher;
	//title��author��price��publisher�ĸ���Ա����
	
	Book(String title, String auther)
	{
		this.title = title;
		this.auther = auther;
	}
	//��дBook��Ĺ��췽�����÷�������title��author����������

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
	//title��authorֻ��ͨ��get�����������ʣ�price��publisher����ͨ��set������get��������
	
}

public class R3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Book book = new Book("�����֮��", "���Ρ�R��R����");
		book.setPrice(88.88);
		book.setPublisher("���������");
		System.out.println(book.getTitle());
		System.out.println(book.getAuther());
		System.out.println(book.getPrice());
		System.out.println(book.getPublisher());
	}

}
