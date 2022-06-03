package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_2864 {
	public static void main(String[] args) {
		// 백준 2864번 문제 5와6의 차이
		// 두수를 입력받아 6을 5로바꾼후 더한값과 6을 5로 바꾼값을 콘솔창에 띄우면 된다
		
		Scanner scan = new Scanner(System.in);
		StringBuffer buf1 = new StringBuffer(scan.next()); // String 은 값을 변경할 때 힙 영역에 새로운 메모리를 할당받지만
		StringBuffer buf2 = new StringBuffer(scan.next()); //StringBuffer는 기존 메모리에서 변경이 가능하다
		int sum = 0 ;
		for(int i =0 ; i < buf1.length();i++) { //6을 5로 바꾸기
			if(buf1.charAt(i) == '6')
				buf1.setCharAt(i,'5');
		}
		for(int i =0 ; i < buf1.length();i++) {
			if(buf2.charAt(i) == '6')
				buf2.setCharAt(i,'5');
		}
		
		sum = Integer.parseInt(buf1.toString()) + Integer.parseInt(buf2.toString());
		System.out.print(sum +" ");
		for(int i =0 ; i < buf1.length();i++) { //6을 5로바꾸기
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
