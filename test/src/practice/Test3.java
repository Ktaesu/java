package practice;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] agrs) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		
		
		if(num>0) {
			System.out.println("양수");
		}
		
		if(num==0) {
			System.out.println("0이다");
		}
		
		if(num<0) {
			System.out.println("음수");
		}
		*/
		
		/*
		if(num>0) {
			System.out.println("양수");
		} else if (num==0) {
			System.out.println("0이다.");
			} else if (num<0) {
				System.out.println("음수");
				
			}
			
			*/
		/*
		 * 정수를 입력받아
		 * 1일경우 "빨간색입니다"
		 * 2일경우 "파란색입니다"
		 * 3일경울 "초록색입니다"
		 * 다른경우 모두 "잘못입력하였습니다"
		 */
		
		//System.out.println("정수입력 : ");
		//int num = sc.nextInt();
		
		/*
		switch(num) {
		case 1:
			System.out.println("빨간색입니다.");
			break;
		case 2:
			System.out.println("파란색입니다.");
			break;
		case 3:
			System.out.println("초록색입니다.");
			break;
		default :
			System.out.println("잘못입력");
		}
		*/
		
		/*
		if(num == 1) {
			System.out.println("빨강");
		} else if (num == 2) {
			System.out.println("파랑");
		} else if (num == 3) {
			System.out.println("초록");		
		} else {
			System.out.println("잘못");
		}
		*/
		
		
		//과일을 구매하는 프로그램을 작성하여봅시다.
		//구매하고자 하는 과일을 입력하면
		//그에맞는 가격이 출력되는 프로그램을 작성해 주세요.
		//구매하고자하는 과일(사과(2000), 바나나(3000), 딸기(5000)) 입력 : xx
		//xx의 가격은 xxxx입니다 / 잘못입력하셨습니다.
		
		/*
		System.out.println("입력 : " );
		String str = sc.next();
		
		switch(str) {
		case "사과" :
			System.out.println("사과(2000)");
			break;
		case"바나나" :
			System.out.println("바나나(3000)");
			break;
		case "딸기" :
			System.out.println("딸기(5000)");
			break;
		default :
			System.out.println("잘못입력");
		}
		*/
		
		//월을 입력받아 해당월에 말일이 며칠까지 있는지를 출력하는 프로그램 작성
		
		//월을 입력하세요 : XX
		//XX월은 XX일까지입니다.
				
		// 1,3,5,7,8,10,12 => 31
		// 4,6,9,11 => 30
		// 2 => 28
		
		
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 :
			System.out.println(month + "월은 31일까지입니다.");
		break;
		
		case 4,6,9,11 :
			System.out.println(month + "월은 30일까지입니다.");
		break;
		
		default :
			System.out.println("2월은 28일까지입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
