
public class Star1 {

	public static void main(String[] args) {
		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*");
			}
			
			
			for(int l=3;l>=i;l--)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}

	}

}
