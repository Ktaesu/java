package test240709.object1;

import f.object.ex3.Book;

public class Run {
	
	public static void main(String[] args) {
		Member jiwon = new Member();
		jiwon.changeName("최지원");
		jiwon.printName();
		
		//아이디, 비번, 이름을 초기화하는 생성자를 통해
		//객체를 하나 생성하고 printName()을 통해 이름을 출력해라
		
		Member sumin = new Member("sskjj0000", "x7t673y4i9", "김수민");
		sumin.printName();
	}
	
	

}
