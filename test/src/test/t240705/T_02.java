package test.t240705;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		/*
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 * ex
		 * 주민번호를 입력하세여( - 포함) : 132456-2123456
		 * 
		 * 여자
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세여( - 포함) : ");
		String n = sc.next();
		char ch = n.charAt(7);
		
		switch(ch) {
		
		case '1' :
		case '3' :
			System.out.println("남자");
			break;
		case '2' : 
		case '4' :	
			System.out.println("여자");
			break;
		default :
			System.out.println("잘못입력");
		
		}

		
	}

}
