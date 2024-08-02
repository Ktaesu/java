package test240723.exception;

import java.util.Scanner;

public class CharacterMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("입력 : ");
		String str = sc.nextLine();
		
		CharacterController controller = new CharacterController();
		
		try {
        int alphaCount = controller.countAlpha(str);
        
        // 반환된 값을 출력
        
        System.out.println(str + "에 포함된 영문자 : " + alphaCount);
		}catch(CharCheckException e) {
			System.out.println("문자열에 공백이 포함되어있습니다.");
			e.printStackTrace();
		}finally {
			sc.close();
			System.out.println("잘 종료되었습니다.");
		}
		
	}

}
