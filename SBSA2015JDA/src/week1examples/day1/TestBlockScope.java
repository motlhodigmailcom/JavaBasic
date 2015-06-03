package week1examples.day1;

public class TestBlockScope
{

	public static void main(String[] args)
	{
		int a = 22;
		System.out.println("a= " + a);

		{
			int b = 55;
		}

		System.out.println("b= " + b); // this line causes a compiler error
	}
}
