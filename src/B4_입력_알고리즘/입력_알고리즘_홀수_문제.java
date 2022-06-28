package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_홀수_문제 {
	/*	
		[문제]
		 숫자 1개를 입력받는다. 그숫자가 홀수인가요?	
	 */
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int n1 = scan.nextInt();
		System.out.println(n1+"는 홀수인가? "+(n1%2!=0));
	
	}
}