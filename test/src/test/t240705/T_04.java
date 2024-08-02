package test.t240705;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		/*
		 * A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력하세요.
		 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		 * 
		 * ex
		 * A사원의 연봉 : 2500
		 * B사원의 연봉 : 2900
		 * C사원의 연봉 : 2600
		 * 
		 * A사원 연봉/연봉+a : 2500/3500.0
		 * 3000이상
		 * B사원 연봉/연봉+a : 2900/2900.0
		 * 3000미만
		 * C사원 연봉/연봉+a : 2600/2989.999999999995
		 * 3000미만
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("A사원의 연봉 : ");
		num1=sc.nextInt();
		
		System.out.println("B사원의 연봉 : ");
		num2=sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		num3=sc.nextInt();
		
		double total1 = num1 + (num1 * 0.4); 
		double total2 = num2;
		double total3 = num3 + (num1 * 0.15); 
		
		System.out.printf("A사원 연봉/연봉+a : %d/%f\n", num1 ,num1/(num1 * 0.4));
		System.out.println(total1>=3000 ? "3000 이상" : "3000미만");
		
		System.out.printf("B사원 연봉/연봉+a : %d/%f\n" + num2/num2);
		System.out.println(total2>=3000 ? "3000 이상" : "3000미만");
		
		System.out.printf("C사원 연봉/연봉+a : %d/%f\n" + num3/(num3 * 1.5));
		System.out.println(total3>=3000 ? "3000 이상" : "3000미만");
		
	}

}
