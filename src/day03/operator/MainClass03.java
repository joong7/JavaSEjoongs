package day03.operator;
/*
 * 
 * 	3. �� ������
 * 		���� ����� boolean���� ��ȯ�Ѵ�
 * 		> : ũ��
 * 		>= : ũ�ų� ����
 * 		< : �۴�
 * 		<= : �۰ų� ����
 * 		== : ����
 * 		!= : �ٸ���
 * 
 */

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] arg) {
		boolean result = 10 < 20;
		System.out.println(result);
		
		if(result) {
			System.out.println("10�� 20���� �۴�");
		}else {
			System.out.println("10�� 20���� ũ��");
			
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���>>>");
		int age = scan.nextInt();
		
		if(age >= 18) {
			System.out.println("�� 18�� �̻��Դϴ�");
		}else {
			System.out.println("�̼����� �Դϴ�");
		}
		
		
	}

}
