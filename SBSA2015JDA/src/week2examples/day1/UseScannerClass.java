<<<<<<< HEAD
package week2examples.day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UseScannerClass
{
	static int    inputAge;    // the age input variable by the user
	static double inputSalary; // the salary input variable by the user
	static String inputName;   // the name input variable by the user

	public static void main(String[] args)
	{
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Please enter your age in year and press ENTER : ");
		inputAge = mScanner.nextInt();
		System.out.print("Please enter your salary, and press ENTER : ");
		inputSalary = mScanner.nextDouble();
		System.out.print("Please enter your name and press ENTER : ");
		inputName = mScanner.next();
		
		
		System.out.println("Thank you. You are " + inputAge + " years old!");
		System.out.println("Your salary is "     + mDecimalFormat.format(inputSalary));
		System.out.println("Your name is "       + inputName);
		
		System.out.println("---- Using scanner class ----");

	}
=======
package week2examples.day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UseScannerClass
{
	static int    inputAge;    // the age input variable by the user
	static double inputSalary; // the salary input variable by the user
	static String inputName;   // the name input variable by the user

	public static void main(String[] args)
	{
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		Scanner mScanner = new Scanner(System.in);
		System.out.print("Please enter your age in year and press ENTER : ");
		inputAge = mScanner.nextInt();
		System.out.print("Please enter your salary, and press ENTER : ");
		inputSalary = mScanner.nextDouble();
		System.out.print("Please enter your name and press ENTER : ");
		inputName = mScanner.next();
		
		
		System.out.println("Thank you. You are " + inputAge + " years old!");
		System.out.println("Your salary is "     + mDecimalFormat.format(inputSalary));
		System.out.println("Your name is "       + inputName);
		
		System.out.println("---- Using scanner class ----");

	}
>>>>>>> a0d16c50b58db7fd4c91f21d228ec42f4562aaec
}