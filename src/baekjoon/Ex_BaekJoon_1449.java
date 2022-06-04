package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex_BaekJoon_1449 {
	public static void main(String[] args) {
		// ���� 1449�� ���� ������ �ѽ� 
		
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();  // ���� ���� �������� ����
		
		int len = scan.nextInt(); // �������� ����
		
		int answer = 0 ;  //�ʿ��� �������� ����
		
		for(int i =0 ; i < num ; i ++)
			list.add(scan.nextInt());  //�������� ��ġ
		
		Collections.sort(list);  // �Է¹��� ��ġ�� ����
		
		int target= 0 ; //�������� �ٿ����� �������� �� ��ġ
		
		for(int i = 0 ; i <num ; i ++) {
			if(target < list.get(i)) {  // �������� ��ġ���� ���̼��°��� ���Ե���������
				answer ++ ;             // �������� ���� ����
				target = list.get(i)-1+len; // �������� ��ġ ����
				}
		}
		
		System.out.println(answer);

	}

}
