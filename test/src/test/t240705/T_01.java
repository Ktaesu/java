package test.t240705;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		
		/*
		 * 상수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균울 출력하세요.
		 * 이 때 총점과 평균은 정수형으로 처리하세요
		 * 
		 * ex
		 * 국어 : 90.0
		 * 영어 : 90.0
		 * 수헉 : 90.0
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("국어 : ");
		num1 = sc.nextDouble();
		
		System.out.println("영어 : ");
		num2 = sc.nextDouble();
		
		System.out.println("수학 : ");
		num3 = sc.nextDouble();
		
;
		
		System.out.println("총점 : " + (num1 + num2 + num3));
		System.out.println("평균 : " + (num1 + num2 + num3)/3);
		
		
		
	}

}
