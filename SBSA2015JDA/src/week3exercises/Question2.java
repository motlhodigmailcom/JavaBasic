package week3exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question2
{

	public static void main(String[] args)
	{
		Scanner mScanner = new Scanner(System.in);
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		double gross_pay = 0, paye = 0, uif = 0, net_pay = 0;
		int hours_worked = 0, hourly_rate = 20; 
		String name = "";
		
		System.out.println("Enter your name");
		name = mScanner.nextLine();
		
		System.out.println("Enter hours worked");
		hours_worked = mScanner.nextInt();
				
		gross_pay = hours_worked * hourly_rate;
		paye = gross_pay * 0.25;
		uif = gross_pay * 0.02;
		net_pay = gross_pay  - uif - paye;
		
		System.out.println("Payslip for " + name);
		System.out.println("=======================");
		System.out.println("Gross pay : " + mDecimalFormat.format(gross_pay));
		System.out.println("Paye      : " + mDecimalFormat.format(paye));
		System.out.println("UIF       : " + mDecimalFormat.format(uif));
		System.out.println("Net pay   : " + mDecimalFormat.format(net_pay));
		System.out.println("=======================");
		 
		mScanner.close();
	}

}
