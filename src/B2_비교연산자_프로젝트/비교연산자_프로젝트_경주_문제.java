package B2_비교연산자_프로젝트;

public class 비교연산자_프로젝트_경주_문제 {
	public static void main(String[] args) {

		 /*
	 	[문제] 
		  	자동차는 154키로의거리를  1시간18분에 달린다.
		  	트럭은 215키로의거리를 2시간17분에 달린다. 			  	
		  	자동차가 트럭보다 빠른가요? 
	  */
		/*
		 * 자동차 154 키로를 78분에 달린다
		 * 자동차가 1분동안 가는거리 = 154/78
		 * 트럭 215 키로를 137분에 달린다
		 * 트럭이 1분동안 가는거리 = 215/137 
		 */
		double 자동차 = 154/78.0;
		double 트럭 = 215/137.0;
		System.out.println(자동차);
		System.out.println(트럭);
		System.out.println("자동차가 트럭보다 빠른가? "+(자동차>트럭));
			
     }
}