package day03.operator;

/*
 * 	2. ����������
 * 	++ : 1�� ������Ų��
 * 	-- : 1�� ���ҽ�Ų��
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
		num++; //���������� 1����
		System.out.println(num); //2
		System.out.println(++num); //3
		System.out.println(num++); //3 �����ݷ� ���� �� ++���� �� �򰥸��� �� �� 
		System.out.println(num); //4
		
		// 0~99���� ����ϴ� �ݺ���(for)
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
