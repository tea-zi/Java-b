package B2_�񱳿�����_�⺻�̷�;

public class �񱳿�����_�⺻�̷�2_����5 {
	public static void main(String[] args) {		
		//����1) �Ʒ����� true ���ǵ���  ����a ���� �����غ���.
	    int a = 0;
	    /*
	     * 2a > 5
	     */
	    a = 3;
	    boolean b = 2 * a - 1 > 4 ;
	    System.out.println(b);
	   
	   //����2) �Ʒ����� true ���ǵ���  ����a2 ���� �����غ���.
	    int a2 = 0;
	    /*
	     * 3a2>6
	     * a2>2
	     */
	    a2 = 3;
	    boolean b2 = 6 - 2 * a2 < a2 ;
	    System.out.println(b2);
	   
	   //����3) �Ʒ����� true ���ǵ���  ����a3 ���� �����غ���.
	    int a3 = 0;
	    /*
	     * 63a3-2a3 > 7+5
	     * 61a3 > 12
	     * 0�̳� ������ �ƴϸ� ����
	     */
	    a3 = 1;	    
	    boolean b3 = 63 * a3 - 5 > 7 + 2 * a3;
	    System.out.println(b3);
	}
}