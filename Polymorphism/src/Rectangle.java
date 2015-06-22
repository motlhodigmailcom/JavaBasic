
public class Rectangle extends Square {
	private int length;
	private int width;

	public Rectangle() {
		super();
		setLength(0);
		setWidth(0);
	}
	
	public Rectangle(int length, int width) {
		super(length);
		setLength(length);
		setWidth(width); 
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "The area of a Rectangle is : " + getArea();
	}
}
