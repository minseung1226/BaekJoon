package baekjoon;

import java.util.Scanner;

public class Ex_BaekJoon_1541 {

	public static void main(String[] args) {
		// 백준 1541번 :잃어버린 괄호
		// 50-40+30-20 이라고 가정하였을때
		// 50-(40+30)-20 일때 최소의 값을 구할수있다
		//그말은 즉 -가있을때 그다음 -를 만나기전까지 괄호를 넣어 주어 연산을 하면 최소의 값을 구할 수 있다
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		int result = 0;
											
		String[] arr = str.split("-");			//- 기준으로 묶기
												//문제의 조건에서 첫문자와 마지막문자는 무조건 숫자라고 하였다 즉, 첫 숫자는 -가될수없다
		
		String[] arr2 = arr[0].split("\\+");    // arr[0]의 값은 무조건 +이기때문에 +기준으로 잘라서    
		for (int i = 0; i < arr2.length; i++) {
			result += Integer.parseInt(arr2[i]);  // result값에 더해준다
		}
		int len = 1;      //arr의 인덱스 번호
		while (arr.length > 1) {  // scanner로 받은 연산식에 -가 하나라도 있을때
			int sum = 0;          //arr 배열의  인덱스별 합
			String[] arr3 = arr[len].split("\\+");  //arr[len]의 합   
			for (int i = 0; i < arr3.length; i++) {
				sum += Integer.parseInt(arr3[i]);
			}
			result -= sum;         // 연산식을 -기준으로 잘랐기때문에 원래 식에는 -가 붙어있으므로 뺄셈을 해준다
			len++;
			if (len == arr.length) 
				break;
		}
		System.out.println(result);
	}

}
