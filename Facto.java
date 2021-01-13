import java.util.*;
public class Facto {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int res = fact(n);
		System.out.println("factorial of a number:"+res);		
	}
	
	public static int fact(int n) {
		if(n==1)
			return 1;
		else {
			int res=n*fact(n-1);
			return res;
		}
	}

}
