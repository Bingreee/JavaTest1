package home.operation.day0104;

public class OperatorPractice {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 3;
		System.out.println(i1 + i2);
		System.out.println(i1 - i2);
		System.out.println(i1 * i2);
		System.out.println(i1 / i2); //int값만 출력. 즉, 몫만 출력
		System.out.println((double)i1 / i2); //실수 값도 출력
		System.out.println(i1 % i2); //나머지
		
		/*int i3 =0;
		System.out.println(i2/i3);*/
		//0으로는 나눌 수 없음! error뜸
		
		String s1 = "";
		String s2 = i1 + s1;
		//String s3 = i1 - s1; //더하기를 제외한 나머지 연산자(-,*,/,%)는 숫자만!! 다룰 수 잇음
		System.out.println(s1 + s2);
		
		

	}

}
