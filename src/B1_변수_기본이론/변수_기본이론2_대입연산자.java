package B1_����_�⺻�̷�;

/*
 * 		[���� ������] =
 * 		������ ���� ���� �����ڸ� ���ؼ�����
 * 		���� ������ �����ϴ�.
 */

public class ����_�⺻�̷�2_���Կ����� {
	public static void main(String[] args) {

		int num = 8;
		
		// ����) num �� 1��  ���غ���.
		System.out.println(num + 1);		//	9
		
		// �� ���� ��������ó���������� ���� num �� ���� 8�� ������ ����. 
		System.out.println(num);			//	8
		
		
		int temp = num;
		num = (temp + 1); 	// ���� �����ڸ� ���ؼ��� ���� ����ȴ�. 		
		
		System.out.println(num);			//	9
			
	
		// ������ �켱������  ���Կ����� ����  ���ϱ� �����ڰ� �켱����ȴ�
		int b = 10;
		b = b + 1; // () �� ���ڟݾƵ� b + 1 �� ���� ������� �ٽ� b �� ����ȴ�.
		System.out.println(b);
		
     }
}