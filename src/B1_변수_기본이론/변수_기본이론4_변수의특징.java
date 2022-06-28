package B1_변수_기본이론;
/*
 * # 변수의 특징
 * 1. 변수는 값을 한개만 저장할 수 있다.
 * 2. 때문에 새로운 값이 저장되면 이전의 값은 사라진다.
 * 3. 같은 이름의 변수를 또 다시 선언 할 수 없다. ==> (int 를 같은이름에 2번사용못한다.)
 */
public class 변수_기본이론4_변수의특징 {
	public static void main(String[] args) {

		int num;
		num = 9;
		num = 3;
		System.out.println(num);
		
		// int num = 4;  (주석을 지우면 에러가 난다.) 
		
		
		int b = 10; // 축약형	
		//int b;
		//b = 10;
		
     }
}