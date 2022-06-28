package B1_변수_알고리즘;

public class 변수_알고리즘_설탕_문제 {
	
	public static void main(String[] args) {
		/*
		 [문제]
			 설탕 15kg 을 6명이서 똑같이 나누어 줄려고합니다.
			 한명씩 차례대로 설탕을 나눠갖는다고했을때
			 4번째 사람이 받아가면 남은 설탕량은 얼마인가?
		*/
		double 설탕 = 15*1000;
		double 일인 = 설탕/6;
		double 남은량 = 설탕-일인*4;
		System.out.println(남은량);
		int 전체인원 = 6;
		double 한명 = 설탕/전체인원;
		double 두명 = 한명*2;
		System.out.println(두명);
		
	}
	
}