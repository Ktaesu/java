package test01.t240703;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.입력  \n2.수정 \n3.조회 \n4.삭제 \n7.종료  ");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("입력.");
			break;
		case 2:
			System.out.println("수정.");
			break;
		case 3:
			System.out.println("조회.");
			break;
		case 4:
			System.out.println("삭제.");
			break;
		case 7 :
			System.out.println("종료");
			break;
		default :
			System.out.println("잘못입력했습니다");
		}
		
 		
	}
	

}
