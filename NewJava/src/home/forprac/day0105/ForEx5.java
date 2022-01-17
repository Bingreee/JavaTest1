package home.forprac.day0105;

public class ForEx5 {
//	for 문을 이용해 1~100사이의 값 중 3과 7의 공배수를 구하고 
//	그중 최소 공배수도 출력해주세요
	public static void main(String[] args) {
		int min = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 7 == 0) {
				System.out.println("3과 7의 공배수 : "+ i);
				if(min == 0) {
					min = i;
				}
			}
		}
		System.out.println("3과 7의 최소공배수 : "+min);
		System.out.println("===============================");
		
		//for문을 이용해 알파벳 대문자 A~Z까지 출력해주세요
	      char alphabet = 'A';
			
			for(;alphabet <= 'Z';alphabet++) {
				System.out.println(alphabet);
			}
			 	
	}
}
