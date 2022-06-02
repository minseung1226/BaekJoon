package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_13305 {
	public static void main(String[] args) {
		// 백준 13305 주유소 문제
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();			   // 도시의 개수 
		int[] len = new int[num-1];          //도시간 거리 num-1 
		int[] city = new int[num];			 //도시당 리터가격 
		
		long answer = 0;                    //도시당 최대 리터 가격이 10억 이기때문에 
											//자료형은 int가 아닌 long으로 받아주어야한다
		
		
		for(int i= 0 ; i <num-1 ; i ++	)   
			len[i]=scan.nextInt();
		for(int i =0 ; i < num ; i ++)
			city[i] = scan.nextInt();
		int j = 0;    
		answer +=city[0]*len[0];     // 출발할때의 차의 기름이 없으므로 첫도시에서는 
									 //최소 두번째 도시까지의 거리만큼의 기름을 넣어야 한다\
		
		for(int i = 1 ; i <num -1 ; i++) {  
			
			if(city[j]>city[i]) //j도시의 기름값이 i도시의 기름값보다 크다면 i도시 로 이동한 후 기름을 넣어야 한다
				j=i;            
			answer+=city[j]*len[i];
		}
		System.out.println(answer);
	}
}
