package day03.loop;
/*
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass05 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� 0����4������ ���� ����ϱ�
		for(int i = 0; i < 5; i++) {
			//���� i�� 3�̸� �ݺ��� ����
			if(i == 3) {
				break; //�ݺ��� ���� 
			}
			System.out.println("i :" + i); //i�� ����ϱ�
		}
	}

}