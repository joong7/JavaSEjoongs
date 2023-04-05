package day03.conditional;


/*
 * 	swich  ~ case 문 (if문이랑 비슷)
 */
public class MainClass03 {

	public static void main(String[] args) {
		int num = 1;
		switch(num) {
		case 0 : 
			System.out.println("0입니다");
			break;              //브레이크를 지우면 모두 실행 된다.
		case 1 :
			System.out.println("1 입니다.");
			break;
		case 2 :
			System.out.println("2 입니다.");
			break;
		case 3 :
			System.out.println("3 입니다.");
			break;
		default :
		}

	}

}
