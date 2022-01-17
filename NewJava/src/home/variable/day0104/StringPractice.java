package home.variable.day0104;

public class StringPractice {

	public static void main(String[] args) {
		
		//String : 문자열 표현을 목적으로 만든 클래스
		String str = "문자열";
		String empty = ""; //빈 문자열 이어도 문자열로 인식.
		String blank = "  ";//공백만 이어도 문자열로 인식.
		
		// + : 숫자 + 숫자-->사칙연산
		//	 : 문자열 + 문자열-->이어쓰기
		//	 : 문자열 + 숫자-->String이 우선. 숫자를 String으로 변환
		
		String s1 = 7 + " ";
		String s2 = " " +7;
		//숫자를 문자열로 바꿀 때 
		String s3 = 7 +"";
		String s4 = "" +7;
		//빈문자열 + 7-->문자열. 따라서 14가 아니라 77이 나옴
		String s5 = "" +7+7;
		//숫자 14가 아니라 "14"
		String s6 = 7+7+"";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
				

	}

}
