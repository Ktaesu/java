package practice;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library book1 = new Library();
		Library book2 = new Library();
		
		book1.bookName = "이순신";
		book1.bookNumber = 10;
		
		book2.bookName = "무인도에서 살아남기";
		book2.bookNumber = 99;
		
		
		book1.print();
		
	}

}
