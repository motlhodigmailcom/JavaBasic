
public class TwoStrings
{
	
	public int compareTo(String n, String m)
	{		
		if(n.equals(m))
		{
			return 0;
		}
		
		return -1;
	}
	
	public String compareToIgnoreCase(String n, String m)
	{
		if(n.equalsIgnoreCase(m))
		{
			return "These strings are the same";
		}
		
		return "These strings are not the same";
	}

	public static void main(String[] args)
	{
		System.out.println(new TwoStrings().compareTo("Tshepo", "Tshepo"));
	}

}
