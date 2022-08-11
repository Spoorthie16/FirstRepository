package spoo;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123;
int rev=0;
int rem=0;
while(num>0) {
	rem=num%10;
	num=num/10;
	rev=rev*10+rem;
}
System.out.println(rev);
	}

}
