package f.object.ex4;

//이름 나이 수학점수 영어점수 국어점수를 데이터를 가지고 있는 객체를 만들어라
// 데이터는 직접 접근을 허용하지 않고 모두 간접적으로 set/get을 해줄 수 있도록 작성해라.
// 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성

public class Student {

	// 필드영역(데이터
	private String name;
	private int age;
	private int num1;
	private int num2;
	private int num3;

	// 생성자영역/ alt + shift + s -> o
	public Student(String name, int age, int num1, int num2, int num3) {
		this.name = name;
		this.age = age;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	// 메소드영역(기능)
	// getter,setter
	//alt + shift + s -> r

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 1) {
			this.age = age;
			return; // 메소드 종료
		}
		this.age = age;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		if(num1 < 0) {
			this.num1 = 0;
			return;
		}
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		if(num2 < 0) {
			this.num2 = 0;
			return;
		}
		this.num2 = num2;
	}

	public int getNum3() {
			return num3;
		}
		

	public void setNum3(int num3) {
		if(num3 < 0) {
			this.num3 = 0;
			return;
		}
		this.num3 = num3;
	}

	public void setName(String nmae) {
		this.name = name;
	}
	
	public double getEvg() {
		double evg = (this.num1 + this.num2 + this.num3) /3.0;
		return evg;
	}
	
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}

}
