package day03.loop;
/*
 * 	[[�ݺ��� ]]
 * 	Ư�� �κ��� �ڵ尡 �ݺ������� �����ϵ��� �ϴ� ���.
 * 
 * 	1.whiile ��
 * 		while(���ǹ�) {
 * 			�ݺ� ������ �ڵ�
 * }
 * 
 * 
 */
public class MainClass03 {

	public static void main(String[] args) {
		//while���� �̿��ؼ� 0~99���� ����ϱ�
		int count = 0;
		while(true) {
			System.out.println(count);
			++count; // count + 1
			if(count == 100 )
				break;
		}
		
		count = 0;
		while(count < 100) {
			System.out.println(count);
			++count;
		}
		
		count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			++count;
			if(count == 100)
				isRun = false;
		
		
		System.out.println("���� �޼ҵ� ����!");
	}

	}
}
