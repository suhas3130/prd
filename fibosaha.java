import java.util.*;

public class fibosaha {
	
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int res = fibo(n);
		System.out.println("Fibo number is="+res);
			
	}
	public static int fibo(int n) {
		if(n==0) 
			return 0;
		else if(n==1)
			return 1;
		else {
			int res = fibo(n-1)+fibo(n-2);
			return res;
			
			
		}
	}

}
