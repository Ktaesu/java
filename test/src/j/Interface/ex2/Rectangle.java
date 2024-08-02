package j.Interface.ex2;

public class Rectangle implements Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return this.width * this.height;
	}

}
