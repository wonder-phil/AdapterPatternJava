package shapes;

import interfaces.TwoDimensionalShape;

public class Square implements TwoDimensionalShape {
	
	private int length,width;
	
	public String returnShape() {
		return "2D square";
	}
	
	public int area() {
		return length*width;
	}

}
