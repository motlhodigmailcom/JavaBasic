<<<<<<< HEAD
package week1excercise.day1;

public class OneWeekAndSevenDays
{

	public static void main(String[] args)
	{
		castFromOneTypeToAnother();
		fiveIntegerQuestion();

	}
	
	public static void castFromOneTypeToAnother()
	{
		byte num1 = 2;
		int num2 = 3;
		double num3 = 4.0;
		long num4 = 45L;
		boolean isNum = false;
		
		num2 = (int) num1;
		
		num3 = (double) num2;
		num4 = (long) num3;
		
		//num2 = (int) isNum; // wont compile
		num2 = (isNum) ? 1:0;
		
		num2 = (int) num4;
		
		
		System.out.format("%d %d %.1f %b", num1, num2, num3, num4, isNum);
		
	}
	
	public static void fiveIntegerQuestion()
	{
		int num1 = 65;
		int num2 = 66;
		int num3 = 67;
		int num4 = 68;
		int num5 = 69;
		
		char initial = 't';
		
		System.out.printf("%c", num1);
		System.out.printf("%c", num2); 
		System.out.printf("%c", num3);
		System.out.printf("%c", num4);
		System.out.printf("%c", num5);
	}
}
=======
package week1excercise.day1;

public class OneWeekAndSevenDays
{

	public static void main(String[] args)
	{
		castFromOneTypeToAnother();
		fiveIntegerQuestion();

	}
	
	public static void castFromOneTypeToAnother()
	{
		byte num1 = 2;
		int num2 = 3;
		double num3 = 4.0;
		long num4 = 45L;
		boolean isNum = false;
		
		num2 = (int) num1;
		
		num3 = (double) num2;
		num4 = (long) num3;
		
		//num2 = (int) isNum; // wont compile
		num2 = (isNum) ? 1:0;
		
		num2 = (int) num4;
		
		
		System.out.format("%d %d %.1f %b", num1, num2, num3, num4, isNum);
		
	}
	
	public static void fiveIntegerQuestion()
	{
		int num1 = 65;
		int num2 = 66;
		int num3 = 67;
		int num4 = 68;
		int num5 = 69;
		
		char initial = 't';
		
		System.out.printf("%c", num1);
		System.out.printf("%c", num2); 
		System.out.printf("%c", num3);
		System.out.printf("%c", num4);
		System.out.printf("%c", num5);
	}
}
>>>>>>> a0d16c50b58db7fd4c91f21d228ec42f4562aaec
