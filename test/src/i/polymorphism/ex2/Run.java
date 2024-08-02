package i.polymorphism.ex2;

public class Run {
	public static void main(String[] args) {
		//1. 부모타입 레퍼런스(참조변수)로 부모객체를 다루는 경우
		Car c1 = new Car("빨간색", "가솔린", 2020);
		c1.drive();
		
		//2/자식타입 레퍼런스로 자식객체를 다루는 경우
		Avante c2 = new Avante("검은색", "디젤", 2022);
		c2.drive();
		c2.moveAvante();
		
		//3.부모타입 레퍼런스로 자식객체를 다루는 경우
		
		Car c3 =c2;
		c3.drive();
		((Car)c2).drive();
		
		Car c4 = new Sonata("흰색", "가스", 2023);
		c4.drive();
		Sonata c5 = (Sonata)c4;
		((Sonata)c4).moveSonata();
		
		/*
		 * "상속 구조"의 클래스 간에 형변환 가능
		 * 
		 * 1. UpCasting
		 * 자식 타입 -> 부모타입으로 형변환
		 * 자동형변환
		 * ex) Car(c1 = new Sonata();
		 * 
		 * 
		 * 
		 * 
		 * 2. DownCasting
		 * 	  부모 타입 -> 자식 타입으로 변환
		 *    강제적변환 해야함
		 *    ex) ((Sonata)c1).moneSonata();
		 *    ((자식)부모).자식메소드();
		 */ 
		
		//다형성
		// 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클스 타입 하나로 다룰 수 없는 기술
		
		//다형성의 장점
		
		//다형성 사용 전
		Sonata[] sonataArr = new Sonata[5];
		sonataArr[0] = new Sonata("흰색", "가스", 2023);
		Avante[] avanteArr = new Avante[5];
		avanteArr[0] = new Avante("검은색", "가솔린", 2023);
		
		Car[] carArr = new Car[10];
		carArr[0] = new Sonata("흰색", "가스", 2023);
		carArr[1] = new Sonata("검은색", "가솔린", 2023);
		carArr[2] = new Sonata("흰색", "가스", 2023);
		carArr[3] = new Sonata("검은색", "가솔린", 2023);
		
		for(int i=0; i<carArr.length; i++) {
			//해당 참조변수가 실제 Sonata객체를 참조하고 있나?
			if(carArr[i] instanceof Sonata) {
				((Sonata)carArr[i]).moveSonata();
			}else if(carArr[i] instanceof Avante){
				((Avante)carArr[i]).moveAvante();
			}else {
				carArr[i].drive();
			}
			
		}
	}

}