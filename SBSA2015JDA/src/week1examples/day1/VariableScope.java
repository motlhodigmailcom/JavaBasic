<<<<<<< HEAD
package week1examples.day1;

public class VariableScope
{
	static int aNumber; // class variable - visible throughout the whole class
	// does not need immediate initialization
	int tempNum;

	public static void main(String[] args) // static methods are loaded first

	/** in methods you can use local variables and class variables **/
	{
		int myNumber; // Local variable - visible throughout this method only
						// needs initialization before use
		myNumber = 5;
		System.out.println(myNumber);
		System.out.println(aNumber);
		String x = "xxxxx";
	}

	static
	{
		System.out.println(aNumber);
		// System.out.println(tempNum);
	}
=======
package week1examples.day1;

public class VariableScope
{
	static int aNumber; // class variable - visible throughout the whole class
	// does not need immediate initialization
	int tempNum;

	public static void main(String[] args) // static methods are loaded first

	/** in methods you can use local variables and class variables **/
	{
		int myNumber; // Local variable - visible throughout this method only
						// needs initialization before use
		myNumber = 5;
		System.out.println(myNumber);
		System.out.println(aNumber);
		String x = "xxxxx";
	}

	static
	{
		System.out.println(aNumber);
		// System.out.println(tempNum);
	}
>>>>>>> a0d16c50b58db7fd4c91f21d228ec42f4562aaec
}