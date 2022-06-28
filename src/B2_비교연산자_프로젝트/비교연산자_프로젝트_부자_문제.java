package B2_비교연산자_프로젝트;

public class 비교연산자_프로젝트_부자_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
			철수는 13살 철수의 아버지는 45살이다. 
			몇년후 철수의 아버지는 철수나이의 3배가될까요?
			
		 */
		/*
		 * (a+철수)*3 = 아버지+a
		 * 3a+3철수 = 아버지+a
		 * 2a = 아버지-3철수
		 * a = (아버지-3철수)/2
		 */
		int 철수 = 13;
		int 아버지 = 45;
		int a = (아버지-3*철수)/2;
		System.out.println(a);
		System.out.println(아버지+a == (철수+a)*3);
		
	}
}