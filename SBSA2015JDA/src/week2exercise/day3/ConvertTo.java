<<<<<<< HEAD
package week2exercise.day3;

import java.util.Scanner;

public class ConvertTo
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		String strNumber = new Scanner(System.in).nextLine();
		
		strNumber += 1;
		
		System.out.println("The current value of strNumber is " + strNumber);
		
		int intValue = 45;
		
		System.out.println("The double value of intValue is " + Double.parseDouble(Integer.toString(intValue)));
		
		System.out.println("Enter a character");
		char charValue = new Scanner(System.in).nextLine().charAt(0);
		
		String msg = (Character.isDigit(charValue)) ? charValue + " is a digit" : charValue + " is not a digit";
		
		System.out.println(msg);
		
	}

}
=======
package week2exercise.day3;

import java.util.Scanner;

public class ConvertTo
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		String strNumber = new Scanner(System.in).nextLine();
		
		strNumber += 1;
		
		System.out.println("The current value of strNumber is " + strNumber);
		
		int intValue = 45;
		
		System.out.println("The double value of intValue is " + Double.parseDouble(Integer.toString(intValue)));
		
		System.out.println("Enter a character");
		char charValue = new Scanner(System.in).nextLine().charAt(0);
		
		String msg = (Character.isDigit(charValue)) ? charValue + " is a digit" : charValue + " is not a digit";
		
		System.out.println(msg);
		
	}

}
>>>>>>> a0d16c50b58db7fd4c91f21d228ec42f4562aaec
