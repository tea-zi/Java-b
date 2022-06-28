package B3_논리연산자_기본이론;

public class 논리연산자_기본이론2_문제2 {
	public static void main(String[] args) {
		
		
		// 문제 ) 숫자1 이 3의 배수이면서, 짝수입니까?
		int num1 = 12;
		 System.out.println(num1%3 == 0 && num1%2 == 0);
		// 문제) 숫자2가 홀수이거나 5의 배수입니까?
		int num2 = 50;
		System.out.println(num2%2 != 0 || num2%5 == 0);
	}
}