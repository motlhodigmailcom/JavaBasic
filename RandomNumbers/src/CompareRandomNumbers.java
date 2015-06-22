import java.util.Scanner;


public class CompareRandomNumbers {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		sc = new Scanner(System.in);
		
		
		int number = 0;
		
		number = sc.nextInt();
		
		System.out.println("Well done!!! you have entered " + number);
	}
}