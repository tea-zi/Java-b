package B2_비교연산자_프로젝트;

public class 비교연산자_프로젝트_여행_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
			고속버스를 타고 여행을 떠나려한다.
			출발시간까지 1시간 여유가 있다.
			고속버스역과 상점을 시속 3km 로 걸어서 왕복을하고,
			10분동안 물건을 산다고하면 
			역에서  1.3km 떨어진 상점을 다녀올수있나요?
		 */
		/*
		 * 분속 = 3/60 = 0.05
		 * 상점까지 걸리는 시간 = 1.3/0.05
		 * 상점을 다녀오는데 걸리는 시간 = (1.3/0.05)*2 + 10 
		 */
		double 시속 = 3;
		double 분속 = 시속/60;
		double 상점 = 1.3/분속;
		double 총시간 = 상점*2+10;
		System.out.println(분속);
		System.out.println(상점);
		System.out.println(총시간);
		System.out.println("상점을 다녀올수있나? "+(총시간<=60));
		
		
		
	}
}