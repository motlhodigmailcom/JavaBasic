package chapter1;

//access modifiers, break, conditional operators, continue statement, if statement, import statement, logical expressions, loops(do while, while, for each , etc), operands. operators : equal, relational, logical, short circuit, bitwise, presedance, switch,   
public class Bunnies
{
	static int count = 0;

	Bunnies()
	{
		while (count < 10)
			new Bunnies(++count);
	}

	Bunnies(int x)
	{
		super();
	}

	public static void main(String[] args)
	{
		new Bunnies();
		new Bunnies(count);
		System.out.println(count++);
	}
}
/** 
 * What is the result?
A. 9
B. 10
C. 11
D. 12
E. Compilation fails.
F. An exception is thrown at runtime.
 * */







//ANSWER
//B.

