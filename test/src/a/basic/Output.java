package a.basic;

public class Output {
	public static void main(String[] args) {
		// 한줄을 출력하고 개행을 한다.
		System.out.println("안녕하신가");
		System.out.println("최지원이올시다");
		
		
		// 단순하게 출력을 할 떄 사용하는 출력문
		System.out.print("소인의 성별은");
		// print에서 개행을 하고싶을 때는 \n을 이용한다.
		System.out.print("남자이올시다.\n");
		
		String name = "김태수";
		System.out.println("안녕하세요 저는" + name + "입니다.");
		
		//System.out.println(문자열포멧, 값1, 값2);
		/*
		 * 포멧안에서 쓸 수 있는 키워드
		 * %d : 장수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수
		 */
		System.out.printf("안녕하세요 저는 $s입니다. 나이는 %d이고 키는 $f입니다", "아무개" ,55, 180.5);
	}
}
