
public class Square extends Shape{
	private int length;
	
	public Square() {
		super();
		this.length = 0;
	}

	public Square(int length) {
		super();
		setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int getArea() {
		return length * length;
	}
	
	@Override
	public String toString() {
		return "The area of a Square is    : " + getArea();
	}
}
