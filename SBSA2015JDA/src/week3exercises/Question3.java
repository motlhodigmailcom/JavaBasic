package week3exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3
{

	public static void main(String[] args)
	{
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		Scanner mScanner = new Scanner(System.in);
		double gross_pay = 0, deductions = 0, net_pay = 0;
		int hours_worked = 0, hourly_rate = 20; 
		String name = "";
		
		System.out.println("Enter your name");
		name = mScanner.nextLine();
		
		while(!name.equalsIgnoreCase("stop"))
		{
			System.out.println("Enter hours worked");
			hours_worked = mScanner.nextInt();
			
			System.out.println("Enter hourly rate");
			hourly_rate = mScanner.nextInt();
			
			System.out.println("Enter monthly deductions");
			deductions = mScanner.nextDouble();
			
			
			gross_pay = hours_worked * hourly_rate;
			net_pay = gross_pay - deductions;
			
			System.out.println("Payslip for " + name);
			System.out.println("=======================");
			System.out.println("Hours worked  : " + hours_worked);
			System.out.println("Hourly rate   : " + hourly_rate);
			System.out.println("Gross pay     : " + mDecimalFormat.format(gross_pay));
			System.out.println("Deductions    : " + mDecimalFormat.format(deductions));
			System.out.println("Net pay       : " + mDecimalFormat.format(net_pay));
			System.out.println("=======================");
			
			System.out.println("Enter your name");
			name = mScanner.nextLine();
		}
		mScanner.close();
	}

}
