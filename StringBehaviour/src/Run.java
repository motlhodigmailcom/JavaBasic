
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello world.";
	    String str2 = "Hello world.";

	    if (str1 == str2)
	        System.out.print("str1 == str2\n");
	    else
	        System.out.print("str1 != str2\n");

	    if(str1.equals(str2))
	        System.out.print("str1 equals to str2\n");
	    else
	        System.out.print("str1 doesn't equal to str2\n");

	    String str3 = new String("Hello world.");
	    String str4 = new String("Hello world.");

	    if (str3 == str4)
	        System.out.print("str3 == str4\n");
	    else
	        System.out.print("str3 != str4\n");

	    if(str3.equals(str4))
	        System.out.print("str3 equals to str4\n");
	    else
	        System.out.print("str3 doesn't equal to str4\n");
	}
}
