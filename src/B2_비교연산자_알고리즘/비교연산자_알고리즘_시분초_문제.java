package B2_�񱳿�����_�˰���;

public class �񱳿�����_�˰���_�ú���_���� {
	public static void main(String[] args) {

		/*
		 * [����] 
		 * 	321321�ʸ�  "�ð�" , "��" , "��" �� ǥ�������� ,
		 *  "��" ��  Ȧ���ΰ���?
		 */
		int �� = 321321;
		int �ð� = ��/3600;
		int �� = ��%3600/60;
		int ������ = ��%60;
		System.out.print(�ð�+"��");
		System.out.print(��+"��");
		System.out.println(������+"��");
		System.out.println("\"��\"�� Ȧ���ΰ�? " + (��%2 != 0));
	}
}