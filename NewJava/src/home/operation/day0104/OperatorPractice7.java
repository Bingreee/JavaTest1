package home.operation.day0104;

public class OperatorPractice7 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++); //제일 마지막 순위. 일단 출력먼저 되고 값이 하나 증가하여 11로 됨. 출력만 10
		System.out.println(++a); //먼저 증가시키고 출력
		
		int x = 10;
		int y = 20;
		
		int z = ++x +y--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
