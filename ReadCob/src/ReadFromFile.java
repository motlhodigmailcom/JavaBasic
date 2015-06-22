import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\USERS\\STUDENT\\DESKTOP\\SCORE.DAT")));
		String x = br.readLine();
		String y = x.substring(0, 40);
		String z = x.substring(41, 140);
		br.close();
		
		//String goals [][] = new String[4][10];
				
		System.out.println(x);		
		System.out.println(y);	
		System.out.println(z);	
		
	}

}
