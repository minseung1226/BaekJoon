package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_5585 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		
		int change = 1000 - scan.nextInt(); // õ���� �������� �ܵ�
		
		
		int[]  money = {500,100,50,10,5,1};   // �Ž����ټ� �ִ� �ܵ��� ����
		int count = 0 ;                       // �Ž������� �ּ� ����
		for(int i = 0 ; i < money.length;i++) { // �迭�� ���� ��ŭ �ݺ�
			count +=change/money[i];          
			change%=money[i];
			if(change == 0)      //���� �ܵ��� 0���� �ɰ�� �� ������ �ݺ��� ���ǹ� �ϹǷ� break
				break;
		}
		System.out.println(count);
	}

}
