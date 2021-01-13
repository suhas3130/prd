
public class reversepttrn {
	
	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=1;i<=n;i++){
			System.out.println();
			for(j=n;j>=i;j--){
				System.out.print("*");
			}
		}
	}
}
