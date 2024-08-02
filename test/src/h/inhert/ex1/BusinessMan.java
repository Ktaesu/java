package h.inhert.ex1;

public class BusinessMan extends Man{
	private String company;
	private String position;
	
	public BusinessMan(String company, String position) {
		super();
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + this.company);
		System.out.println("My position is " + this.position);
	}
}
