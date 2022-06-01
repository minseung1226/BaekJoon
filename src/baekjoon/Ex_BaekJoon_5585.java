package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_5585 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		
		int change = 1000 - scan.nextInt(); // 천원을 냈을때의 잔돈
		
		
		int[]  money = {500,100,50,10,5,1};   // 거슬러줄수 있는 잔돈의 단위
		int count = 0 ;                       // 거스름돈의 최소 개수
		for(int i = 0 ; i < money.length;i++) { // 배열의 길이 만큼 반복
			count +=change/money[i];          
			change%=money[i];
			if(change == 0)      //만약 잔돈이 0원이 될경우 그 이후의 반복은 무의미 하므로 break
				break;
		}
		System.out.println(count);
	}

}
