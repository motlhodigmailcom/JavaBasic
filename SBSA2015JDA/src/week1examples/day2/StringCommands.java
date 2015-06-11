package week1examples.day2;

public class StringCommands
{

	public static void main(String[] args)
	{
		String s = "   The crazy lady shot the postman.   "; //3 spaces
		
		System.out.println(s);
		drawLine();
		System.out.println("String length: " + s.length());
		drawLine();
		
		s = s.trim();
		System.out.println("String length: " + s.length());
		drawLine();
		
		System.out.println("Determine the position of the first character \'d\'");
		drawLine();
		System.out.println(s.indexOf("d"));
		drawLine();
		
		System.out.println("Determine character position at 11:");
		drawLine();
		System.out.println(s.charAt(11));
		drawLine();
		
		System.out.println("String starts with \'A\'");
		drawLine();
		System.out.println(s.startsWith("A"));
		drawLine();
		
		System.out.println("String ends with \'t\'");
		drawLine();
		System.out.println(s.endsWith("t"));
		drawLine();
		
		System.out.println("Replace all \'a\' with \'x\'");
		drawLine();
		s = s.replace('a', 'x');
		System.out.println(s);
		drawLine();
		
		System.out.println("All lower case");
		drawLine();
		s = s.toLowerCase(); 
		System.out.println(s);
		drawLine();
		
		System.out.println("All upper case");
		drawLine();
		s = s.toUpperCase();
		System.out.println(s);
		drawLine();
		
		System.out.println("Substring SHOT out of string s");
		String tempString = s.substring(16, 4);
		System.out.println(tempString);
		// comparison
		
	}
	
	public static void drawLine()
	{
		System.out.println("--------------------------------------");
	}

}
