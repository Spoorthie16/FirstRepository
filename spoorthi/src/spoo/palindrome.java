package spoo;

public class palindrome {

	public static void main(String[] args) {
		int num=121;
		int sum=0;
		int temp=num;
		int rem=0;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("p");
		}
		else {
			System.out.println("n");
		}
	}

}
