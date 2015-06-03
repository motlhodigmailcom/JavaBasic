package week1examples.day1;

public class VariableDeclarationInitialization
{

	public static void main(String[] args)
	{
		System.out
				.println("sysout ctrl spacebar = short cut for System.out.println");
		String str = "Cloete";
		System.out.print("Hi there, ");
		System.out.println(str);
		System.out.println("Hi there, " + str); // string concatenation
		str = str + 1; // string concatenation
		str = str + " mampara.";
		System.out.println(str);

		String name = new String("Kundie"); // heap
		String name2 = "Kundie"; // stack

		if (name.equals(name2))
		{
			System.out.println("They are equal");
		} else
		{
			System.out.println("They are not equal");
		}

		double dd = 33;
		System.out.println(dd);

		int age = 22;
		age = (int) (age + 0.5);
		System.out.println(age);

		// age = 2;

	}
}