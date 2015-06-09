package week2examples.day2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Younger than 30 = highest premium bracket Between 30 and 50 = medium bracket
 * older than 50 = lowest premium bracket Applies to car insurance industry.
 */

public class SwitchPremiumCalculator
{
	public static void main(String[] args)
	{
		System.out.println("In which age bracket are you?");
		System.out.println("Please chosse: \n  0 -->  0 to 30 years"
				                        + "\n  1 --> 31 to 50 years"
				                        + "\n  2 --> 51 years and older");
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		
		@SuppressWarnings("resource")
		int choice = new Scanner(System.in).nextInt();
		double premium = 57.33;

		switch (choice)
		{
			case 0:
				premium *= 3.5;
				// break;
			case 1:
				premium *= 2.1;
				// break;
			case 2:
				premium *= 1.7;
				System.out.println("Your premium will be: "
					+ mDecimalFormat.format(premium));
				break;
			default:
				System.out.println("Illegal value entered");
		}
	}
}