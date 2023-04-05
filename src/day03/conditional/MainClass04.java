package day03.conditional;

public class MainClass04 {

	public static void main(String[] args) {
		char ch = 'w';                           //컴퓨터 스위치 지정할 대 사용하는 조건문
		switch (ch) {							//if 문보다 switch가 직관적이지만 보통 if문을 사용함
		case 'w':
			System.out.println("앞으로 이동");
			break;
		case 'a':
			System.out.println("촤측으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		case 'd':
			System.out.println("우측으로 이동");
			break;
		default: // 
			System.out.println("대기!");
			break;
		}
	
	}

	
}
