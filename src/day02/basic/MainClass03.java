package day02.basic;

/* 
 * [[ �⺻ �ڷ���]]
 * 1. ����(boolean)
 * 
 * 	-������
 * 		boolean ������;
 * - ���� �� �ִ� ����
 * 		true, false �ΰ��� �� ���� ����.
 *  ctrl + shift + w �� ��� â �ݱ�
 *  
 *  -  1byte(�޸� �������� �뷮)
 */


public class MainClass03 {

	public static void main(String[] args) {
		//���� ���� �����ϱ�
			boolean isWait; 
			//������ ������ �� �����ϱ�
			isWait = true;  //boolean isWait = true;  �̷��Ե� ��� ������
			
			System.out.println("���� ���� �� : " + isWait);
			
			//boolean ���� ���� ���̴� �뵵�� - ���� ���� ����� ���� �����ϱ�
			boolean canRun = true;
			
			canRun = false;
			
			if(canRun) {
				System.out.println("I Can RUN!");
			}else {
				System.out.println("I Can Not Run");
			}
			
			
	}

}
