import java.util.*;
public class Count {

	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.nextLine();
		//int count=s.length(); ...........direct method
		//System.out.println(count);
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			//char c=s.charAt(i);
			count=count+1;
		}
		System.out.println(count);
		
	}
	
}
