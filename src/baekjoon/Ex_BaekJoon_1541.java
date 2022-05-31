package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_1541 {

	public static void main(String[] args) {
		// ���� 1541�� :�Ҿ���� ��ȣ
		// 50-40+30-20 �̶�� �����Ͽ�����
		// 50-(40+30)-20 �϶� �ּ��� ���� ���Ҽ��ִ�
		//�׸��� �� -�������� �״��� -�� ������������ ��ȣ�� �־� �־� ������ �ϸ� �ּ��� ���� ���� �� �ִ�
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		int result = 0;
											
		String[] arr = str.split("-");			//- �������� ����
												//������ ���ǿ��� ù���ڿ� ���������ڴ� ������ ���ڶ�� �Ͽ��� ��, ù ���ڴ� -���ɼ�����
		
		String[] arr2 = arr[0].split("\\+");    // arr[0]�� ���� ������ +�̱⶧���� +�������� �߶�    
		for (int i = 0; i < arr2.length; i++) {
			result += Integer.parseInt(arr2[i]);  // result���� �����ش�
		}
		int len = 1;      //arr�� �ε��� ��ȣ
		while (arr.length > 1) {  // scanner�� ���� ����Ŀ� -�� �ϳ��� ������
			int sum = 0;          //arr �迭��  �ε����� ��
			String[] arr3 = arr[len].split("\\+");  //arr[len]�� ��   
			for (int i = 0; i < arr3.length; i++) {
				sum += Integer.parseInt(arr3[i]);
			}
			result -= sum;         // ������� -�������� �߶��⶧���� ���� �Ŀ��� -�� �پ������Ƿ� ������ ���ش�
			len++;
			if (len == arr.length) 
				break;
		}
		System.out.println(result);
	}

}
