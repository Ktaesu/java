package test240724.IO;

import java.util.Scanner;
import java.io.File;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기 ");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : 
				this.fileSave();
				break;
			case 2:
				this.fileOpen();
				break;
			case 3:
				this.fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
	
			}
			
		}
		
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder(); //StringBuilder 문자열을 다루는 객체(String)
		
		// ex끝it 이라고 입력했을 떄
		while(true){
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.println("내용 : ");
			String str = sc.nextLine();
			
			//ex끝it이라고 입력했을 때
			if(str.equals("ex끝it")) {
				
				//파일명이 존재하지 하면서 덮어쓰기를 하지 않겠다고 할때 계속반복
				while(true) {
					System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
					String fileName = sc.next();
					
					//파일명이 존재할 때
					if (fc.checkName(fileName)) {
						System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
						char isPass = sc.next().charAt(0);
						//덮어쓰겠다고 할 때
						if(isPass == 'y') {
							fc.fileSave(fileName, sb);
							return;
						}
					}else {//파일명이 존재하지 않을 때
						fc.fileSave(fileName, sb);
						return;
					}
				}
				
			}
			sb.append(str);
		}
	}
	
	public void fileOpen(){
		System.out.println("열 파일 명 : ");
		String file = sc.nextLine();
		if(fc.checkName(file)) {
			StringBuilder sb = fc.fileOpen(file);
			System.out.println(sb.toString()); 
		}else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit(){
		System.out.println("수정할 파일 명 : ");
		String file = sc.next();
		sc.nextLine();
		if(fc.checkName(file)) {
			
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.println("내용 : ");
				String str = sc.nextLine();
				
				if(str.equals("ex끝it")) {
					fc.fileEdit(file, sb);
					return;
				}
				
				sb.append(str);
			}
			
		}else {
			System.out.println("없는 파일입니다.");
		}
		
	}		

}
