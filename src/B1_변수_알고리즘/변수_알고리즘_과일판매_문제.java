package B1_변수_알고리즘;

public class 변수_알고리즘_과일판매_문제 {
	public static void main(String[] args) {	
	
		/*
		   [문제]
		 - 가게에 과일 250개가 있다. 
		 - 그중에 오전에 120개가 팔렸고 오후에는  80개가 팔렸다.
		 - 남은 과일는 전체 과일의 몇 % 인가?
		 */	
		int 과일 = 250;
		int 오전 = 120;
		int 오후 = 80;
		int 남은과일 = 과일 - 오전 - 오후;
		double	퍼센트 = 남은과일/과일*100.0; // int(정수) 설정으로는 값을 찾을수 없는 식 식이 성립하기 위해서는 int로 되어있는 변수를 double로 변환해야함
		System.out.println(퍼센트);
		double 일퍼센트 = 과일/100.0;
		double 남은과일퍼센트 = 남은과일 / 일퍼센트;
		System.out.println(남은과일퍼센트);
     }
}