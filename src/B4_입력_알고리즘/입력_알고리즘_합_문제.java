package B4_�Է�_�˰���;

import java.util.Scanner;

public class �Է�_�˰���_��_���� {
	/*
		[����]
		 ���� 2���� �Է¹޴´�. �μ����� �������Ͻÿ�.

	 */
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n1 = scan.nextInt();
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n2 = scan.nextInt();
		
		System.out.println("�μ��� ���� : "+(n1+n2));
		
		int sum = n1+n2;
		System.out.printf("�μ��� ���� : %d", sum);
	
	}
}