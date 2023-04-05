package day02.basic;

/* 
 * [[ 기본 자료형]]
 * 1. 논리형(boolean)
 * 
 * 	-선언방법
 * 		boolean 변수명;
 * - 가질 수 있는 범위
 * 		true, false 두가지 값 저장 가능.
 *  ctrl + shift + w 는 모든 창 닫기
 *  
 *  -  1byte(메모리 공간차지 용량)
 */


public class MainClass03 {

	public static void main(String[] args) {
		//논리형 변수 선언하기
			boolean isWait; 
			//선언한 변수에 값 대입하기
			isWait = true;  //boolean isWait = true;  이렇게도 사용 가능함
			
			System.out.println("논리형 변수 값 : " + isWait);
			
			//boolean 가장 많이 쓰이는 용도는 - 논리형 변수 선언과 동시 대입하기
			boolean canRun = true;
			
			canRun = false;
			
			if(canRun) {
				System.out.println("I Can RUN!");
			}else {
				System.out.println("I Can Not Run");
			}
			
			
	}

}
