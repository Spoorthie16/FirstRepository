package spoo;

public class Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=rows;i>=1;i--) {
			for(int s=1;s<=rows-i;s++) {
				System.out.print("");
			}
			for(int j=i;j<=2*i-1;j++) {
				if(j%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print("@");
				}
				for(int k=0;k<i-1;k++) {
					System.out.print("@");
				}
			}
			System.out.println();
		}


	}

}
