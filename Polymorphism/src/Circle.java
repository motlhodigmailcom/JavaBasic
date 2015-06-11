
public class Circle extends Shape{
	public int radius;

	public Circle() {
		super();
		this.radius = 0;
	}

	public Circle(int radius) {
		super();
		setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius > 0)
		this.radius = radius;
	}

	@Override
	public int getArea() {
		int area = (int) (radius * radius * 3.14);
		return area;
	}
	
	@Override
	public String toString() {
		return "The area of a Circle is    : " + getArea();
	}
}
