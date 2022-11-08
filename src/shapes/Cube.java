package shapes;

import interfaces.ThreeDimensionalShape;

public class Cube implements ThreeDimensionalShape {
	
	private int length,width,height;

	public String returnShape() {
		return "3D cube";
	}

	public int volume() {
		return length*width*height;
	}
	
	public int measure() {
		return volume();
	}
}
