package B2_�񱳿�����_�⺻�̷�;

public class �񱳿�����_�⺻�̷�2_����1 {
	public static void main(String[] args) {
		//����1) �Ʒ� ������ ����� ��� true�� ��µǵ��� ���ڸ�  ����		
        System.out.println(10 == 3);
        System.out.println(3 != 8);
        System.out.println(5 > 38);
        System.out.println(12 < 3);
        System.out.println(11 >= 11);
        System.out.println(3 <= 10);
        
        System.out.println("-------------��--------------");
        
        System.out.println(10 == 10);
        System.out.println(3 != 8);
        System.out.println(50 > 38);
        System.out.println(1 < 3);
        System.out.println(11 >= 11);
        System.out.println(3 <= 10);
		    
        System.out.println("--------------------------");
        
        int a = 10;
        int b = 3;
        
      //����1) �Ʒ� ������ ����� ��� true�� ��µǵ��� ����a, b �� ��  ����	
        b = 10;
        System.out.println(a == b);
        b = 1;
        System.out.println(a != b);
        System.out.println(a > b);
        b=13;
        System.out.println(a < b);
        a=13;
        System.out.println(a >= b);
        System.out.println(a <= b);
	}
}