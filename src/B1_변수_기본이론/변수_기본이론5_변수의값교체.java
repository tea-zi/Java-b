package B1_����_�⺻�̷�;

public class ����_�⺻�̷�5_�����ǰ���ü {
	public static void main(String[] args) {

		// a�� b�� �� ��ü�ϱ�
		int a = 5;
		int b = 7;
		a = b;
		b = a;
		
		// �� ����  ����  ��������.
		System.out.println("a = " + a); 
		System.out.println("b = " + b); 
		
		
		System.out.println("--------------------------");	
		// ��ȯ�� �Ʒ��� ���� �ؾ��Ѵ�. 
		// x ��  y�� �� ��ü�ϱ�
		int x = 10;
		int y = 20;

		int z = x; // z = 10
		x = y; // x = 20
		y = z; // y = 10

		System.out.println("x = " + x);
		System.out.println("y = " + y);
     }
}