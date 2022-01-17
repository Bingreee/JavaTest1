package book;

public class Book {

	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	Book(){}
	Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
		}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getBookDiscountRate() {
		return bookPrice-(bookDiscountRate * bookPrice * 0.01);
	}
		
	public void bookInfo() {
		System.out.println(bookName+"  "+ bookPrice+"원  "+ bookDiscountRate+"%  "+getBookDiscountRate()+"원");
	}
	
}
