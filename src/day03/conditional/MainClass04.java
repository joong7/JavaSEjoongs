package day03.conditional;

public class MainClass04 {

	public static void main(String[] args) {
		char ch = 'w';                           //��ǻ�� ����ġ ������ �� ����ϴ� ���ǹ�
		switch (ch) {							//if ������ switch�� ������������ ���� if���� �����
		case 'w':
			System.out.println("������ �̵�");
			break;
		case 'a':
			System.out.println("�������� �̵�");
			break;
		case 's':
			System.out.println("�ڷ� �̵�");
			break;
		case 'd':
			System.out.println("�������� �̵�");
			break;
		default: // 
			System.out.println("���!");
			break;
		}
	
	}

	
}
