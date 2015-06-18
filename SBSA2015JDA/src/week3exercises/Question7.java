package week3exercises;

import java.util.Scanner;

public class Question7
{

	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		String name = "";
		char marital_status = ' ';
		double hourly_rate = 0, gross_pay = 0, tax = 0, net_pay = 0;
		int hours_worked = 0;
		
		System.out.println("Please enter name. Enter \"None left\" to terminate the program ");
		name = mScanner.next();
		
		while(name.equalsIgnoreCase("None left"))
		{
			System.out.println("Please enter marital status. m = married, s = single");
			name = mScanner.next();
			
			System.out.println("Please enter hourly rate ");
			hourly_rate = mScanner.nextDouble();
			
			System.out.println("Please enter hours worked ");
			hours_worked = mScanner.nextInt();
			
			gross_pay = hours_worked * hourly_rate;
			
			if(gross_pay >= 0 && gross_pay <= 100)
			{
				if(Character.toUpperCase(marital_status) == 'M')
				{
					tax = 0.1;
				}
				else
				{
					tax = 0.12;
				}
			}
			
			if(gross_pay >= 101 && gross_pay <= 200)
			{
				if(Character.toUpperCase(marital_status) == 'M')
				{
					tax = 0.2;
				}
				else
				{
					tax = 0.22;
				}
			}
			
			if(gross_pay > 200)
			{
				if(Character.toUpperCase(marital_status) == 'M')
				{
					tax = 0.25;
				}
				else
				{
					tax = 0.27;
				}
			}
			
			
			System.out.println("Please enter name. Enter \"None left\" to terminate the program ");
			name = mScanner.next();			
		}
		mScanner.close();
	}
}