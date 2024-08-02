package snack;

import java.util.Scanner;

public class SnackMenu {
	
	
		private Scanner sc = new Scanner(System.in);
		private SnackController scr = new SnackController();
	
		public void menu() {
			String kind;
			String name;
			String flavor;
			int numOf;
			int price;
			
			System.out.println("스낵류룰 확인하세요.");
			
			System.out.println("종류 : ");
			 kind =sc.next();
			 
			 System.out.println("이름 : ");
			 name = sc.next();
			 
			 System.out.println("맛 : ");
			 flavor=sc.next();
			 
			 System.out.println("개수 : ");
			 numOf = sc.nextInt();
			 
			 System.out.println("가격 : ");
			 price = sc.nextInt();
			 
			 String res = scr.saveData(kind, name, flavor, numOf, price);
			 System.out.println(res);
			 
			 System.out.println("저장핝 정보를 확인하시겠습니까?(y/n)");
			 char ch = sc.next().charAt(0);
			 if(ch=='y') {
				 res = scr.confirmData();
				System.out.println(res);
			 }
		 
		
	}
	

}
