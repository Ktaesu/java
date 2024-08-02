package test.t240705;

import java.util.Scanner;

public class T_12 {
	public static void main(String[] args) {
		/*
		 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
		 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
		 사용자가 "exit"를 입력하기 전까지 가위바위보를 계속 진행하고 "exit"가 들어가면 반복을 멈추고
		 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		String[] gameArr = {"가위", "바위", "보"};
		
		int win=0, draw=0, loss=0;
		String name, game;
		
		System.out.println("당신의 이름을 입력해주세요 :");
		name = sc.next();
		
		while(true) {
		System.out.print("가위바위보 : ");
		game = sc.next();
		
		if (game.equals("exit")) {
			System.out.printf("%d전 %d승 %d무 %d패", (win + draw + loss), win, draw, loss);
			break;
		}
		//컴퓨터에 랜덤으로 "가위, 바위, 보"중 하나른 부여
		//문자열을 랜덤으로 줄 수 없으니 랜덤 숫자를 부여하자
		int rand = (int)(Math.random() * 3);//0(가위) 1(바위) 2(보)
//		gameArr[0] -> 가위
//		gameArr[1] -> 바위
//		gameArr[2] -> 보
		
		String com = gameArr[rand];
		
		if(game.equals(com)) {
			System.out.println("비겼습니다.");
			draw++;
		}else if(game.equals("가위") && com.equals("보") ||
				(game.equals("바위") && com.equals("가위")) ||
				(game.equals("보") && com.equals("바위"))
				) {
			System.out.println("이겼습니다.");
			win++;
		}else {
			System.out.println("졌습니다.");
			loss++;
		}
		}
		
		
//		switch(game) {
//		
//		case "가위":
//			System.out.println("컴퓨터 :" + ?);
//		case "바위":
//			System.out.println("컴퓨터 :" + ?);
//		case "보":
//			System.out.println("컴퓨터 :" + ?);
//		}
		
		
	}

}
