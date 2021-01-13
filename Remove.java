import java.util.*;
public class Remove {
	
	public static void main(String[]args) {
		//Scanner scan=new Scanner(System.in);
		
		String str="apple";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=s.nextLine();
		System.out.println("Enter the letter to remove:");
		String letter=s.nextLine();
		
		String newstr= name.replace(letter,"");
		System.out.println("new string is:"+newstr);
		
	}

}
