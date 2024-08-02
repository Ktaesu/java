package test.t240705;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 False를 출력하세요.
		 * 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		 * 이 때, 출석 비율은 출석 횟수의 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		 * 
		 * ex 1.
		 * 중간 고사 점수 : 80
		 * 기말 고사 점수 : 30
		 * 과제 점수 : 60
		 * 출석 횟수 : 18
		 * =============결과===============
		 * 중간 고사 점수(20) : 16.0
		 * 기말 고사 점수(30) : 9.0
		 * 과제 점수 		(30) : 18.0
		 * 출석 점수		(20) : 18.0
		 * 총점 : 61.0
		 * Fail [점수 미달]
		 */
		Scanner sc = new Scanner(System.in);
		
		
		int num1, num2, num3, num4;
		
		
		System.out.println("중간 고사 점수 : ");
		num1 =sc.nextInt();
		
		System.out.println("기말 고사 점수 : ");
		num2 =sc.nextInt();
		
		System.out.println("과제 점수 : ");
		num3 =sc.nextInt();
		
		System.out.println("출석 횟수 : ");
		num4 =sc.nextInt();
		
		double mum1, mum2, mum3, mum4;
		mum1 = num1 * 0.2;
		mum2 = num2 * 0.3;
		mum3 = num3 * 0.3;
		
		
		double total = mum1 + mum2 + mum3 + num4;
				
		
		System.out.println();
		
		
		
	}

}
