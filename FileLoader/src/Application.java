import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
	    String file = new java.io.File(".").getCanonicalPath() + "\\src\\Text_File.txt";
	    Scanner scanner = new Scanner(new File(file));
	    scanner.useDelimiter("");
	    
	    StringBuilder information = new StringBuilder();
	    
	    while(scanner.hasNext() == true) {
	    	information.append(scanner.next());
	    }
	    
	    System.out.println(information);

	    scanner.close();
	}
}
