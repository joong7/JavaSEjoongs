package day03.operator;

/*
 * 	2. 증감연산자
 * 	++ : 1씩 증가시킨다
 * 	-- : 1씩 감소시킨다
 * 
 * 
 * 
 */

public class MAinClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		num = num + 1;
		System.out.println(num); //1
		num++; //증감연산자 1증가
		System.out.println(num); //2
		System.out.println(++num); //3
		System.out.println(num++); //3 세미콜론 실행 후 ++증가 됨 헷갈리지 말 것 
		System.out.println(num); //4
		
		// 0~99까지 출력하는 반복문(for)
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		int num2 = 0;
		num2 = num2 -1;
		System.out.println(num2);
		num2--;
		System.out.println(num2);
		
		
	}

}
