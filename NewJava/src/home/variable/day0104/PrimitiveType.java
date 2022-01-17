package home.variable.day0104;

public class PrimitiveType {

	public static void main(String[] args) {

		//변수 선언
		boolean b = true; //boolean 타입의 변수에는 true나 false만 저장가능
		System.out.println("b : "+b);
		b = false;
		System.out.println("b : "+b);
		
		char c1 = 'A';
		char c2 = 65;//숫자 저장 시 숫자에 맞는 글자로 바꿔서 저장됨
		char c3 = (char)0xfAC00;//44032(16진수)
		System.out.println("c1 :" +c1);//A
		System.out.println("c2 :" +c2);//이것도 A출력 (아스키코드)
		System.out.println("c3 :" +c3);
		
		int i = 100;
		long l = 10000000000L;
		System.out.println("i :"+i);
		System.out.println("l :"+l);
		//int 범위를 넘어서는 정수 리터럴값-->에러. 따라서 뒤에 l/L 둘 중 하나 붙임
		
		
		double d2 = 100;
		float f = 100;
		System.out.println("d2 :"+d2);
		System.out.println("f :"+f);
		
		double d = 3.14;
		float f2 = 3.14f;
		//실수 기본타입은 double. 실수 리터럴에 접미사 f/F붙이면 float타입 명시
		System.out.println("d :"+d);
		System.out.println("f2 :"+f2);
		
		float f3 = 1.000000000000001F;//범위 넘어감
		double d3 = 1.000000000000001;
		System.out.println("f3 :"+f3);
		System.out.println("d3 :"+d3);
		
		
		
	}

}
