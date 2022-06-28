package B1_변수_프로젝트;

public class 변수_프로젝트_투표 {
	public static void main(String[] args) {

		 /*
		        [문제]
			 		철수네 반은 학생이 40명이다.
			 	 	철수와 , 영희 와 , 민수 이는 반장선거에 나갔다.
			 	 	민수는 득표를 전체중 40% 를 획득했고, 
			 	 	영희는 9표를 획득했다.
			 	 	2명은 투표를 하지않았고 
			 	 	나머지는 철수가 득표를 했다.
			 	 	철수는 전체 득표에서 몇%를 획득했는가?
		  */
		int 반학생 = 40;
		double 민수 = 40*0.4;
		int 영희 = 9;
		int 비투표 = 2;
		double 철수 = 반학생-민수-영희-비투표;
		System.out.println(민수);
		System.out.println(철수);
		System.out.println(철수/반학생*100);
			
			
     }
}