package test.t240704;

import java.util.Scanner;

public class T_01 {
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
		
		System.out.println("아이디 입력 : ");
		id = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		pwd = sc.next();
		
		//아이디 비밀번호 모두 일치
		
			if(ID.equals(id)) {
				if(PWD.equals(pwd)) {
					System.out.println("로그인성공");
				} else { //아이디만 일치
					System.err.println("비밀번호가 틀렸습니다.");
				}
			}else { //패스워드만 일치
				System.out.println("아이디가 틀렸습니다.");
			
			}
		
		
		
	}

}
