package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_오이_문제 {
	public static void main(String[] args) {
		
		/*
		 * [문제] 
		 * 	돈20000원에서 오이(1200원)  을 9개 사고,
			남은 거스름돈이 10000원 이하입니까?
		*/
		int money = 20000;
		int 오이 = 1200;
		int 거스름돈 = 20000-1200*9;
		System.out.println(거스름돈);
		System.out.println("거스름돈이 10000원 이하 입니까? "+(거스름돈<=10000));
	
	}
}