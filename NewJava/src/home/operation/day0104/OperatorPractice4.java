package home.operation.day0104;

public class OperatorPractice4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean c = (a += 12) > b && (a ==(b+2)); //&&뒤에 실행 ㅇ
		boolean d = !((a += 12) > b) && (a ==(b+2)); //&&뒤에 실행 x
		boolean e = (a += 12) > b || (a ==(b+2));
		boolean f = !((a += 12) > b) || (a ==(b+2));
		
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		System.out.println("e :"+e);
		System.out.println("f :"+f);
		System.out.println("a :"+a);
		System.out.println("b :"+b);

	}

}
