package test.t240704;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * 
		 * ex
		 * 숫자 : 4
		 * ===== 4단 =====
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		
		if(num1 <= 9) {
		
		System.out.println("========" + num1 + "단=========");
		for(int i=1; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
		
		}
		
		for(int j=2; j<10; j++) {
			for(int i=1; i<10; i++)
				System.out.println(j + " * " + i + " = " + (j * i));
			
		}
		
		}else {
			System.out.println("9이하의 숫자만 입력하세요");
		}

	}

}
