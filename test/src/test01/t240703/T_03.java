package test01.t240703;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int koScore, mathScore, enScore;
		System.out.println("국어 : ");
		koScore = sc.nextInt();
		
		System.out.println("수학 : ");
		mathScore = sc.nextInt();
		
		System.out.println("영어 : ");
		enScore = sc.nextInt();
		
		
		int sum = koScore + mathScore + enScore;
		// 정수, 연산일 경우 결과는 정수(int)가 된다.
		// 둥중 하나를 상수로 변경해주면 연산시 자동형변환에 의해서 실수값의 결과가 나온다.
		float avg = sum / 3.0f;
		
		if(koScore >= 40 && mathScore >=40 && enScore >=40 && avg >=60) {
			System.out.println("국어 : " + koScore);
		System.out.println("수학 : " + mathScore);
		System.out.println("영어 : " + enScore);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다 합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		
	
		
		
		
		

	}

}