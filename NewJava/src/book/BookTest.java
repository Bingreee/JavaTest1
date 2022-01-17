package book;

public class BookTest {

	public static void main(String[] args) {

		Book [] book = new Book[3];
		book[0] = new Book ("SQL PLUS",50000, 5.0);
		book[1] = new Book ("Java 2.0",40000, 3.0);
		book[2] = new Book ("JSP Servlet",60000, 6.0);
		
		System.out.println("책 이름	 가격	할인율	할인후금액\n"
				+ "--------------------------------");
		for(int i = 0; i < book.length;i++) {
			book[i].bookInfo();
		}
		
		System.out.println("--------------------------------");
		
		for(int i = 0; i < book.length;i++) {
			System.out.println(book[i].bookName+ "  "+book[i].bookPrice+"원  "+book[i].bookDiscountRate+"%  "+book[i].getBookDiscountRate()+"원");
		}
							
	}

}
