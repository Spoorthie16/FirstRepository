package spoo;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=20;
		int sum=0;
		for(int i=1;i<=range;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				sum=sum+i ;
			}
		}
System.out.println( sum);
	}

}
