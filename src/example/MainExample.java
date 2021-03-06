package example;

import interfaces.OneDimensionalShape;
import interfaces.TwoDimensionalShape;
import shapes.Line;
import shapes.Square;

public class MainExample {

	public static void main(String[] args) {
		
		Line line = new Line();
		ShapeHolderAdapter<OneDimensionalShape> shape_1 = new ShapeHolderAdapter<OneDimensionalShape>(line);
		
		System.out.println(shape_1.getShape().returnShape());
		
		Square square = new Square();
		ShapeHolderAdapter<TwoDimensionalShape> shape_2 = new ShapeHolderAdapter<TwoDimensionalShape>(square);
		
		System.out.println(shape_2.getShape().returnShape());
	}
	
}
