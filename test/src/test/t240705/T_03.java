package test.t240705;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		/*
		 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		 * 
		 * ex
		 * 입력1 : 5
		 * 입력2 : -8
		 * 입력3 : 5
		 * 
		 * false
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("입력%d : ", i + 1);
			arr[i] = sc.nextInt();
			
		}
		
//		if(arr[0] == arr[1] && arr[0] == arr[2]) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		System.out.println(arr[0] == arr[1] && arr[0] == arr[2]);
		
		
		/*
		int num1, num2, num3;
		
		System.out.println("1정수 입력 :");
		num1=sc.nextInt();
		
		System.out.println("2정수 입력 :");
		num2=sc.nextInt();
		
		System.out.println("3정수 입력 :");
		num3=sc.nextInt();
		
		if(num1 == num2 && num1 == num3) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		*/
		
		
		
		
		
	}

}
