package B4_입력_알고리즘;

import	java.util.Scanner;

public class 입력_알고리즘_장학생_문제 {
	
	/*[문제] 
	 *  국어점수가 100점이거나 수학점수가 100점이면 장학생입니다.
	 *  아래 두학생의 시험점수가있습니다. 
	 *  각각의 학생은 장학생입니까?
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int 국어1 = 99;
		int 수학1 = 99;
				
		int 국어2 = 1;
		int 수학2 = 100;
		
		System.out.println(국어1 == 100 || 수학1 == 100);
		System.out.println(국어2 == 100 || 수학2 == 100);
		
		System.out.println("국어점수 : ");
		int 국어 = scan.nextInt();
		System.out.println("수학점수 : ");
		int 수학 = scan.nextInt();
		
		System.out.println(국어 == 100 || 수학 == 100);
				
	}
}