package B1_변수_프로젝트;

public class 변수_프로젝트_자전거_문제 {
	
	public static void main(String[] args) {
		/*
		  [문제]
		 	철수는 자전거를 타고 일정한 빠르기로 7분동안 23 / 30km를 갔습니다.
		 	철수가 자전거를 타고 45초동안 간 거리는 몇 km입니까?
		 */
		double 칠분 = 23/30.0;
		double 일분 = 칠분/7;
		double 일초 = 일분/60;
		double 사십오초 = 일초*45;
		
		System.out.println(칠분);
		System.out.printf("%.3f",사십오초);
		
	}
	
}