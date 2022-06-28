package B3_논리연산자_알고리즘;

public class 논리연산자_알고리즘_과일무게_문제 {
	/*
	
	 [문제]
	 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
	 귤5개의 무게가 4의 배수이고,  사과 4개의 무게가 5의 배수입니까?

	*/
	public static void main(String[] args) {
		int 귤 = 840/6;
		int 사과 = 750/3;
		System.out.println(귤);
		System.out.println(사과);
		System.out.println(귤*4);
		System.out.println(사과*5);
		System.out.println(귤*5%4 == 0 && 사과*4%5 == 0);
	}
}