package week2exercise.day3;

import java.util.Scanner;

public class Vegetables
{

	@SuppressWarnings({ "resource" })
	public static void main(String[] args)
	{
		double tomatoes_price, broccolies_price, spinach_price;
		
		System.out.println("Please enter the price for tomatoes");
		tomatoes_price = Double.parseDouble(new Scanner(System.in).next());
		System.out.println("Please enter the price for broccolies");
		broccolies_price = Double.parseDouble(new Scanner(System.in).next());
		System.out.println("Please enter the price for spinach");
		spinach_price = Double.parseDouble(new Scanner(System.in).next());
		
		System.out.printf("The price list \nTomatoe : R%.2f \nbroccoli : R%.2f \nspinach : R%.2f", tomatoes_price, broccolies_price, spinach_price);
	}
}
