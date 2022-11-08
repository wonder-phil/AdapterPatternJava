package shapes;

import interfaces.OneDimensionalShape;

public class Line implements OneDimensionalShape {
	
	private int length;

	public String returnShape() {
		return "1D line";
	}
	
	public int length() {
		return length;
	}
}
