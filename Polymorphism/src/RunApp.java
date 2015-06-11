
public class RunApp {

	public static void main(String[] args) {
		
		Shape mShape[] = {new Circle(3), new Square(4), new Rectangle(2, 3), new Circle(4)};
		
		for (Shape shape : mShape){
			System.out.println(shape);
		}
	}
}