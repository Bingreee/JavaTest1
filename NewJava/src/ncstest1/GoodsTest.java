package ncstest1;

import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("다음 항목의 값을 입력하시오.\n"
				+ "상품명 : ");
		String name = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		Goods gd = new Goods(name, price, quantity);
		System.out.println();

			
		System.out.println(gd.toString());
		sc.close();
		
		
	}

}
