package B4_입력_알고리즘;
import java.util.Scanner;

public class 입력_알고리즘_로그인_문제 {
	/*		 
	 * [문제] 
	 * 		철수는 로그인을 하려고 한다. 
	 * 		아이디와 비밀번호를 입력받는다. 
	 * 		아이디와 비밀번호 둘중하나만틀려도 로그인은 실패합니다.
	 * 		철수는 로그인을 성공할까요?
	 * 		joinId 와 joinPw 는 철수가 이미가입한 아이디와 비밀번호입니다.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int joinId = 1234;
		int joinPw = 4321;
		
		System.out.println("아이디 입력 : ");
		int id = scan.nextInt();
		System.out.println("비빌번호 입력 : ");
		int pw = scan.nextInt();
		
		System.out.println(joinId == id && joinPw == pw);
	
	
	}
}