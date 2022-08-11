package spoo;

public class perfect {
public static void main(String[]args) {
	int n=16;
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
		sum=sum+i;
	}}
	if(sum==n) {
		System.out.println("p");}
		else {
			System.out.println("n");
	}}
}

