package B4_�Է�_������Ʈ;

import java.util.Scanner;

public class �Է�_�򰡹���_����_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * [����] 
		 * 		���� 3���� �Է¹޴´�.
		 * 		�׼����߿� �Ѱ��� ���ڶ� Ȧ���������� �����Դϴ�.
		 * 		�Ʒ����ڵ��������� �ֳ���?
		 */
		System.out.println("����1 : ");
		int n1 = scan.nextInt();
		System.out.println("����2 : ");
		int n2 = scan.nextInt();
		System.out.println("����3 : ");
		int n3 = scan.nextInt();
		System.out.printf("%d, %d, %d �̼��ڵ��� ������ �ִ°�? ",n1,n2,n3);
		System.out.println(n1%2==0 && n2%2==0 && n3%2==0);
		System.out.println("�Ǽ��Է� : ");
		double a = scan.nextDouble();
		System.out.println(a);
		
		
	}
}