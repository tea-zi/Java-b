package B1_변수_알고리즘;

public class 변수_알고리즘_놀이공원_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
		 * 	철수는 놀이공원에 갔습니다. 
		 *  놀이공원 입장료는 15000원 입니다.
		 *  철수는 이런저런 할인을 받아서 9000원에 입장했습니다.
		 *  몇 % 할인받은것일까요?
		 */
		int 입장료 = 15000;
		int 할인가 = 9000;
		int 할인액 = 입장료-할인가;
		double 일퍼 = 15000/100;
		double 할인률 = 할인액/일퍼;
		System.out.println(일퍼);
		System.out.println(할인률);
		System.out.printf("%.2f",할인률);

	}
}