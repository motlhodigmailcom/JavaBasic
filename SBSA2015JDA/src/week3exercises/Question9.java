package week3exercises;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Question9
{

	public static void main(String[] args)
	{
		DecimalFormat mDecimalFormat = new DecimalFormat("R ###,###.00");
		String name, item_name = "";
		char exit_or_not = 'Y';
		int quantity = 0, i = 0;
		double total = 0, price = 0, discount = 0;
		String display = "";
		
		System.out.println("Enter your name");
		name = new Scanner(System.in).next();
		
		while(Character.toLowerCase(exit_or_not) == 'y')
		{
			System.out.println(i+1 + "Enter item name");
			item_name = new Scanner(System.in).next();
			System.out.println(i+1 + "Enter quantity");
			quantity = new Scanner(System.in).nextInt();
			System.out.println(i+1 + "Enter price");
			price = new Scanner(System.in).nextDouble();
			
			display += ((i + 1) + "\t" + item_name + "\t" + quantity  + "\t" + mDecimalFormat.format(price * quantity) + "\n");
			total += (price * quantity);
			
			System.out.println("Do you want to continue? (Y/N)");
			exit_or_not = new Scanner(System.in).next().charAt(0);
			i++;
		}
		
		if(total > 1000)
		{
			discount = total * 0.1;
			total -= discount;
		}
		
		display += "Total amount due :" + mDecimalFormat.format(total + discount) + "\n" 
		                   + "Discount : " + mDecimalFormat.format(discount) + "\n"
				           + "Final amount due : " + mDecimalFormat.format(total);
		
		System.out.println(display);
	}
}
