package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex_BaekJoon_1449 {
	public static void main(String[] args) {
		// 백준 1449번 문제 수리공 한승 
		
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();  // 물이 세는 파이프의 개수
		
		int len = scan.nextInt(); // 테이프의 길이
		
		int answer = 0 ;  //필요한 테이프의 개수
		
		for(int i =0 ; i < num ; i ++)
			list.add(scan.nextInt());  //파이프의 위치
		
		Collections.sort(list);  // 입력받은 위치를 정렬
		
		int target= 0 ; //테이프를 붙였을때 테이프의 끝 위치
		
		for(int i = 0 ; i <num ; i ++) {
			if(target < list.get(i)) {  // 테이프의 위치내에 물이세는곳이 포함되지않을때
				answer ++ ;             // 테이프의 개수 증가
				target = list.get(i)-1+len; // 테이프의 위치 변경
				}
		}
		
		System.out.println(answer);

	}

}
