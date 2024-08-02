package practice;

import java.util.Scanner;

public class P_1 {
	public static void main(String[] args) {
		
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		 * 로그인 성공 시 "로그인 성공",
		 * 아이디가 틀렸을시 "아이디가 틀렸습니다.",
		 * 비밀번호가 틀렸을시 "비밀번호가 틀렸습니다."를 출력하세요.
		 * 
		 * ex 1.					ex 2.					ex 3.
		 * 아이디 : myId				아이디 : myId				아이디 : my
		 * 비밀번호 : myPassword12 	비밀번호 : myPassword		비밀번호 : myPassword12
		 * 로그인성공					비밀번호가 틀렸습니다.			아이디가 틀렸습니다.
		 */
		
		final String ID ="myId";
		final String PWD = "myPassword12";
		String id, pwd;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String str = sc.next();
		
		System.out.println("비밀번호 : ");
		String str2 = sc.next();
		
		
		if(str!=ID) {
			if(str2!=PWD) {
				System.out.println("둘다틀렸다.");
			}
			
		}
		
		if(str2.equals(PWD)) {
			if(str.equals(ID)) {
				System.out.println("로그인성공");
			}else {
				System.out.println("아이디 틀림");
			}
			
			}else {
				System.out.println("비밀번호 틀림");
				
			}
	
		


				
		
		
			
			
		
		
		

	}

}
