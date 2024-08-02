package test240715.object3;

import java.util.Scanner;

//사용자로부터 입력을 받거나 결과를 보여주는 class
public class PointMenu {
	
		private Scanner sc = new Scanner(System.in);
		private CircleController cc = new CircleController();
		private RectangleController rc = new RectangleController();
		
		
		public void mainMenu() {
			int choice;
			
			while(true) {
			System.out.println("============ 메뉴 ============");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			choice = sc.nextInt();
			
		
		
			switch(choice) {
			case 1:
				this.circleMenu();
				break;
			case 2:
				this.reactangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못입력");
			
			
			}
		}
	}
		
	
	
	
	public void circleMenu() {
		System.out.println("========== 원 메뉴 =========");
		System.out.println("1. 원 둘레");
		System.out.println("2. 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			this.calcCircum();
			break;
		case 2:
			this.calcCircleArea();
			break;	
		}
	}
	
	public void reactangleMenu() {
		System.out.println("========== 메뉴 ==========");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.println("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("x 좌표 : ");
			int x3 = sc.nextInt();
			System.out.println("y 좌표 : ");
			int y3 = sc.nextInt();
			System.out.println("반지름 : ");
			int radius3 = sc.nextInt();
		
		}
		
		
	}
	
	public void calcCircum() {

		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
			
		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);
	}
	
	
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int radius = sc.nextInt();
		String result = cc.calcCircleArea(x, y, radius);
		System.out.println(result);
		
		
	}

	
	public void calcPerimeter() {
		int x, y, width, height;
		
		System.out.println("x 좌표 : ");
		x = sc.nextInt();
		System.out.println("y 좌표 : ");
		y = sc.nextInt();
		System.out.println("높이 좌표 : ");
		height = sc.nextInt();
		System.out.println("너비 : ");
		width = sc.nextInt();
		
		String result = rc.calcPerimeter(x, y, width, height);
		System.out.println(result);
		
		
		
	}
	
	
	public void calcRectArea() {
		int x, y, width, height;
		
		System.out.println("x 좌표 : ");
		x = sc.nextInt();
		System.out.println("y 좌표 : ");
		y = sc.nextInt();
		System.out.println("높이 좌표 : ");
		height = sc.nextInt();
		System.out.println("너비 : ");
		width = sc.nextInt();
		
		String result = rc.calcPerimeter(x, y, width, height);
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
