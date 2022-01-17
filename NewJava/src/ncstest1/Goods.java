package ncstest1;

public class Goods {

	String name;
	int price;
	int quantity;
	
	Goods(){}
	Goods(String name, int price, int quantity) {
		super();//컴파일 시 자동으로 호출.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public int getPrice() {
		return price * quantity;
	}
	public void setPrice(int price) {
		this.price = price;
	}
		
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "입력한 결과는 다음과 같습니다.\n"
				+ name+", "+price+"원, "+quantity+"개\n"
						+ "총 구매 가격 : "+getPrice()+"원";
				
	}
	
}
