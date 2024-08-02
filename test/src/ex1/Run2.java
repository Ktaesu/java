package ex1;

import java.util.Scanner;

public class Run2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grade, classroom;
		
		System.out.println("학년");
		grade = sc.nextInt();
		
		System.out.println("반");
		classroom = sc.nextInt();
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("몸무게 : ");
		double height = sc.nextDouble();
		
		System.out.println("성별 : ");
		 char gender = sc.next().charAt(0);
		
		Student kim = new Student(grade, classroom, name, height, gender);
		kim.information();
	}

}
