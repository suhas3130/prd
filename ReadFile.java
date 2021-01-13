import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile {
	
	public static void main(String[]args){
		File samplefile = new File("F:\\samplefile.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(samplefile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Sorry! File does not exist.");
//			e.printStackTrace();
		}
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	}

}
