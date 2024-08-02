package test240715.object3;

public class CircleController {
	
	private Circle c = new Circle();
	
	
	public String calcCircleArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * radius * radius;
        return "면적 :" + c.toString() + " / " + area;
    }

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double circum = Math.PI * c.getRadius() * 2;
		return "둘레 :" +  c.toString() + " / " + circum;
    }
}