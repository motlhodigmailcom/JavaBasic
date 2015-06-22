import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
	
	private String filePath;
	private BufferedWriter bw;
	private FileWriter fw;
	private File file;		
	
    public WriteToFile(String filePath) {
		this.filePath = filePath;
    }

    public void openFile() throws Exception{
	    file = new File(filePath);
	    fw = new FileWriter(file);
	    bw = new BufferedWriter(fw);	
    }
    
    public void readFile(Person[] myPerson) throws IOException{
    	bw.write(myPerson.toString());
    }
}


