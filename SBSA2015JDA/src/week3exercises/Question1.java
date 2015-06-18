package week3exercises;

import java.util.Scanner;

public class Question1
{

	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		
		System.out.println("Enter the number of kilometers the car has done up till this point...");
		int numOfKilometersCurrent = mScanner.nextInt();
		int diffKilos = 0;
		
		System.out.println("Enter the number of litres purchased...");
		int numOfLitres = mScanner.nextInt();
		
		System.out.println("Enter the number of kilometers the car from the previous time petrol has been purchased...");
		int numOfKilometersPrevious = mScanner.nextInt();
		
		diffKilos = numOfKilometersCurrent - numOfKilometersPrevious;
		
		System.out.println("=====================================================================================================");
		System.out.printf("1. Total kilometers since the last odometer reading - When the car last had petrol put into it is %d \n", numOfKilometersPrevious);
		System.out.printf("2. Amount of litres put in the car is %d \n", numOfLitres);
		System.out.printf("3. Odometer reading of total kilometres done after finished the tank of petrol is %d \n", numOfKilometersCurrent);
		System.out.printf("4. Amount of kilometers the car did on the tank of fuel is %d \n", diffKilos);
		System.out.printf("5. Kilometers per litre is %d \n", diffKilos/numOfLitres);
		System.out.printf("6. Amount of kilometers the car did on the tank of fuel is %d \n", diffKilos);
		System.out.println("=====================================================================================================");
		
		
		
		
		
		
		
		
		
		
		
		mScanner.close();
	}

}
