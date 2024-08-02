package test240715.object3;

public class RectangleController {
	
	private Rectangle r;
	
	
	
	public RectangleController() {
		this.r = new Rectangle();
	}
	
	public String calcArea(int x, int y, int width, int height) {
		r.setHeight(height);
	    r.setWidth(width);
	    r.setX(x);
	    r.setY(y);
	    
	    int area = r.getWidth() * r.getHeight();
	    
	    return "면적 : " + r.toString() + " / " + area;
	}

	public String calcPerimeter(int x, int y, int width, int height) {
      r.setHeight(height);
      r.setWidth(width);
      r.setX(x);
      r.setY(y);
      
      double perimeter = 2 * (r.getWidth() + r.getHeight());
      return "둘레 : " + r.toString() + " / " + perimeter;
	}
}
