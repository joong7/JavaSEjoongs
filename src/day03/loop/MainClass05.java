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
		// for문을 이용하여 0부터4까지의 숫자 출력하기
		for(int i = 0; i < 5; i++) {
			//만약 i가 3이면 반복문 종료
			if(i == 3) {
				break; //반복문 종료 
			}
			System.out.println("i :" + i); //i값 출력하기
		}
	}

}
