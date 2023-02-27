package example;

public class ShapeHolderAdapter<Type> {

	private Type element;
	
	public ShapeHolderAdapter(Type element) {
		this.element = element;
	}
	
	public Type getShape() {
		return element;
	}
	
	public void setShape(Type element) {
		this.element = element;
	}
}
