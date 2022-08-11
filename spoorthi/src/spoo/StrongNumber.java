package spoo;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=145;
int sum=0;

int temp=n;
int rem=0;
int strong=0;
while(temp!=0) {
rem=temp%10;
int fact=1;
for(int i=1;i<=rem;i++) {
	fact=fact*i;
}
strong=strong+fact;
temp=temp/10;
}
if(n==strong) {
	System.out.println("strong");
}
else {
	System.out.println("not strong");
}
	}

}
