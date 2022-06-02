package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_13305 {
	public static void main(String[] args) {
		// ���� 13305 ������ ����
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();			   // ������ ���� 
		int[] len = new int[num-1];          //���ð� �Ÿ� num-1 
		int[] city = new int[num];			 //���ô� ���Ͱ��� 
		
		long answer = 0;                    //���ô� �ִ� ���� ������ 10�� �̱⶧���� 
											//�ڷ����� int�� �ƴ� long���� �޾��־���Ѵ�
		
		
		for(int i= 0 ; i <num-1 ; i ++	)   
			len[i]=scan.nextInt();
		for(int i =0 ; i < num ; i ++)
			city[i] = scan.nextInt();
		int j = 0;    
		answer +=city[0]*len[0];     // ����Ҷ��� ���� �⸧�� �����Ƿ� ù���ÿ����� 
									 //�ּ� �ι�° ���ñ����� �Ÿ���ŭ�� �⸧�� �־�� �Ѵ�\
		
		for(int i = 1 ; i <num -1 ; i++) {  
			
			if(city[j]>city[i]) //j������ �⸧���� i������ �⸧������ ũ�ٸ� i���� �� �̵��� �� �⸧�� �־�� �Ѵ�
				j=i;            
			answer+=city[j]*len[i];
		}
		System.out.println(answer);
	}
}
