package B3_논리연산자_프로젝트;

public class 논리연산자_프로젝트_과일가격_문제 {
	/*
	 * [문제]
	 * 사과1개와 바나나3개의 값은 5500원이고,
	 * 사과1개와 바나나5개의 값은 8500원이다.
	 * 각각의 과일가격을 구하시오.
	 */
	public static void main(String[] args) {
		
		int apple = 0;
		int banana = 0;
		/* a=사과 b=바나나
		 * a+3b=5500 -> a=5500-3b 대입
		 * a+5b=8500 -> 5500-3b+5b=8500 -> 2b=8500-5500 -> 2b=3000
		 * b=1500 대입
		 * a+3*1500=5500 -> a=5500-4500
		 * a=1000
		 */
		apple = 1000;
		banana = 1500;
		System.out.println(apple+banana*3 == 5500 && apple+banana*5 == 8500);
		
		
	}
}