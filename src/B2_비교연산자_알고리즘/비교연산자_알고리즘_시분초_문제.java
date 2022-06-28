package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_시분초_문제 {
	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 	321321초를  "시간" , "분" , "초" 로 표현햇을때 ,
		 *  "분" 이  홀수인가요?
		 */
		int 초 = 321321;
		int 시간 = 초/3600;
		int 분 = 초%3600/60;
		int 남은초 = 초%60;
		System.out.print(시간+"시");
		System.out.print(분+"분");
		System.out.println(남은초+"초");
		System.out.println("\"분\"은 홀수인가? " + (분%2 != 0));
	}
}