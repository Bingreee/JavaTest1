package home.forprac.day0105;

public class ForEx8 {
	//-for 문을 이용해 1부터 누적해서 합계를 구하다가 
	//합이 300이 넘으면 중지하고 그때까지의 합과 
	//마지막으로 더해진 값을 구하는 코드를 작성하세요.
	//(출력 결과 : 합은 325이고 마지막으로 더해진 수는 25이다.)
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		for (;;i++) {
			sum += i;
			if(sum > 300) {break;}
		}
		System.out.printf
		("합은 %d이고 마지막으로 더해진 수는 %d이다.\n",sum,i);
		System.out.println("=============================");

		//1부터 100까지의 자연수 중에서 
		//3의 배수이면서 동시에 5의 배수인 숫자를 출력하세요.

		for(int i1 = 1; i1 <= 100; i1++) {
			if(i1 % 3 == 0 & i1 % 5 == 0) {
				System.out.println(i1);
			}
		}
	}

}
