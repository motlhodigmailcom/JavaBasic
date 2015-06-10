package week2examples.day2;

import java.text.DecimalFormat; 

public class DecimalFormatClassExample
{
	public static void main(String[] args)
	{
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00"); /** DecimalFormat constructor 
		                                                                   receives a format string */
		
		DecimalFormat mDecimalFormat_ = new DecimalFormat("#%");
		double carPrice = 2333666.76;
		double percentage = 0.06;
		
		System.out.println("The formatted car price is now " + mDecimalFormat.format(carPrice)); //invoke the format method of the DecimalFormat class 
		System.out.println("The formatted percentage is now " + mDecimalFormat_.format(percentage));
	}
}