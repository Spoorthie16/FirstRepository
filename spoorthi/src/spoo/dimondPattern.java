package spoo;

public class dimondPattern {
public static void main(String[]args) {
	int num=4;
	for(int i=0;i<num;i++) {
		for(int j=0;j<num;j++) {
			if(i+j>=num-1) {
			System.out.print("*" +" ");
			}
			else {
				System.out.print(" ");
			}}
			System.out.println();
		}
		for(int k=0;k<num;k++) {
			for( int m=0;m<num;m++) {
				if(k<=m-1) { 
					System.out.print("*"+ " ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
