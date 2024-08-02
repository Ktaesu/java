package h.inhert.ex1;

public class Man {

	private String name;
	
	public Man() {
		super();
	}

	public Man(String name) {
		super();
		this.name = name;
	}
	
	public void tellYourName() {
		System.out.println("My name is " + this.name);
	}

	
}
