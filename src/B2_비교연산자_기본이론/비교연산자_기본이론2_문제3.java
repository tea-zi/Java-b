package B2_비교연산자_기본이론;

public class 비교연산자_기본이론2_문제3 {
	public static void main(String[] args) {		
		/*
			[예시]
			int a = 0;
			2 * a - 7 == 0   이 사실이 되도록 a의 값을 구해보자			
		 */
		
		int a = 0;
		/*
		 * 14-a == -6+3
		 * 14-a == -3
		 * a == 14+3
		 * a == 17
		 */
		a = 17;
		System.out.println(7 * 2 - a == 3 * -2 - -3);
		
		int b = 0;
		/*
		 * b^2 == 25
		 * b == 5
		 */
		b = 5;
		System.out.println(b * b - 25 == 0);
		
		
		int c = 0;
		/*
		 * 3c == c-2-2 == c-4
		 * 3c-c == -4
		 * 2c == 4
		 * c == -2
		 */
		c = -2;
		System.out.println(3 * c + 2 == c - 2);
		
		int d = 0;
		/*
		 * 5d = 2d+11=4
		 * 5d = 2d+15
		 * 5d-2d = 15
		 * 3d = 15
		 * d = 5
		 */
		d = 5;
		System.out.println(5 * d - 4 == 2 * d + 11);
		
	}
}