package test.t240705;

import java.util.Scanner;

public class T_09 {
	public static void main(String[] args) {
		
		/*
		 
		 */
		
		Scanner sc =new Scanner(System.in);
		
		int num;
		while(true) {
			System.out.println("정수 : ");
			num = sc. nextInt();
			
		
			
			if(num > 0) {
				for(int i=1; i <=num; i++) {
					System.out.println(i % 2 ==0 ? "수" : "박");
				}
			}else {
				System.out.println("양수가 아닙니다.");
			}
		}
	}

}
