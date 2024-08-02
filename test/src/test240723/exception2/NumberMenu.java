package test240723.exception2;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("정수 1 :");
		num1 = sc.nextInt();
		System.out.println("정수 2 :");
		num2 = sc.nextInt();
		
		try {
		 NumberController nc = new  NumberController();
		 boolean isDouble = nc.checkDouble(num1, num2);
		 System.out.printf("%d은(는) %d의 배수인가 ? %b \n", num1,num2,isDouble);
		}catch(NumRangeException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}

}
