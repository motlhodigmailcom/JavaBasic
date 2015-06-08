package week2examples.day1;

public class ConvertStringToPrimitiveType
{
	public static void main(String[] args)
	{
		String strAge = "10";
		System.out.println(strAge);
		strAge += 23;
		System.out.println(strAge);
		
		int intAge = Integer.parseInt(strAge);
		intAge += 23;
		System.out.println(intAge);
		
		
		String strDiameter = "12.33";
		System.out.println(strDiameter);
		strDiameter += "5432";
		System.out.println(strDiameter);
		
		double doubleDiameter = Double.parseDouble(strDiameter);
		System.out.println(doubleDiameter);		
		doubleDiameter *= 3;
	    System.out.println(doubleDiameter);
	}
}