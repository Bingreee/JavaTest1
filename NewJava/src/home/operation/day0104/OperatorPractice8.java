package home.operation.day0104;

public class OperatorPractice8 {

	public static void main(String[] args) {
		
		//조건 연산자
		int score = 76;
		
		char grade = score >=90 ? 'A': (score >=80 ? 'B' : 'C');
		//삼항 연산자는 중복이 가능하다
				System.out.println("학점 : "+grade); 

	}

}
