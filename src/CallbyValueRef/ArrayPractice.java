package CallbyValueRef;

public class ArrayPractice {

	public static void main(String[] args) {
		String[][] sd = new String[2][2];
		sd[0][0] ="Deepika";
		sd[0][1] = "Pune";
		sd[1][0] = "Princy";
		sd[1][1] = "Mumbai";
		
		for(int i=0; i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(sd[i][j]+"\t");
			}
				System.out.println();
		}

	}

}
