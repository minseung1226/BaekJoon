package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_2864 {
	public static void main(String[] args) {
		// ���� 2864�� ���� 5��6�� ����
		// �μ��� �Է¹޾� 6�� 5�ιٲ��� ���Ѱ��� 6�� 5�� �ٲ۰��� �ܼ�â�� ���� �ȴ�
		
		Scanner scan = new Scanner(System.in);
		StringBuffer buf1 = new StringBuffer(scan.next()); // String �� ���� ������ �� �� ������ ���ο� �޸𸮸� �Ҵ������
		StringBuffer buf2 = new StringBuffer(scan.next()); //StringBuffer�� ���� �޸𸮿��� ������ �����ϴ�
		int sum = 0 ;
		for(int i =0 ; i < buf1.length();i++) { //6�� 5�� �ٲٱ�
			if(buf1.charAt(i) == '6')
				buf1.setCharAt(i,'5');
		}
		for(int i =0 ; i < buf1.length();i++) {
			if(buf2.charAt(i) == '6')
				buf2.setCharAt(i,'5');
		}
		
		sum = Integer.parseInt(buf1.toString()) + Integer.parseInt(buf2.toString());
		System.out.print(sum +" ");
		for(int i =0 ; i < buf1.length();i++) { //6�� 5�ιٲٱ�
			if(buf1.charAt(i) == '5')
				buf1.setCharAt(i,'6');
		}
		for(int i =0 ; i < buf1.length();i++) {
			if(buf2.charAt(i) == '5')
				buf2.setCharAt(i,'6');
		}
		sum = Integer.parseInt(buf1.toString()) + Integer.parseInt(buf2.toString());
		
		
				System.out.print(sum);
	}

}
