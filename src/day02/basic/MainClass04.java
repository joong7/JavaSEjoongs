package day02.basic;
/*
 * 	[[�⺻ �ڷ���]]
 * 2. ������(char)
 * 	-�� ���迡�� ���̴� ���� ���� ��κ� ǥ������
 * 	-Ȧ����ǥ '' �� ǥ��
 * 	-16��Ʈ �����ڵ� ���ڸ� �����ϴ� ����
 * 	-0~65,535
 * 
 * 	-���� ���
 * 		char ������;
 * 
 */
public class MainClass04 {

	public static void main(String[] args) {
		// char  �� ���� ����� ���ÿ� �� �����ϱ�
		char ch1 = 'A';
		System.out.println("char�� ���� �� : " + ch1);
		
		char ch2 = '��';
		char  ch3 = '��';		
		
		//�ٺ��� ctrl + alt + ����Ű up or down
		//�ٻ��� ctrl + d
		//����Ű ��� ctrl +shift + L
		System.out.println(ch2);
		System.out.println(ch3);
		
		int num = ch1; //char �� ���� int ������ ����ȯ, 
		System.out.println("�빮�� A�� �ش��ϴ� �����ڵ� : " + num);
		
		char ch4 = 66;
		System.out.println("���� 66�� �ش��ϴ� ���� : " + ch4);
		
		int num2 = 110;
		char ch5 = (char)num2; // int ���� char ������ ���� ����ȯ
		
		
		
		

	}
		
}
