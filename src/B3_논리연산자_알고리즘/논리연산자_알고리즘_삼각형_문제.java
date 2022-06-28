package B3_논리연산자_알고리즘;

public class 논리연산자_알고리즘_삼각형_문제 {
	/*
	 * [문제]
	 * 
	 * 가로가 15이고 세로가 24인 삼각형 넓이가 짝수이거나, 5의 배수입니까?
	 */
	public static void main(String[] args) {
		int 가로 = 15;
		int 세로 = 24;
		int 넓이 = 가로*세로/2;
		System.out.println(넓이);
		System.out.println(넓이%2 == 0 || 넓이%5 == 0);
		
			
	}
}