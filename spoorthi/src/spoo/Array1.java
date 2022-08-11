package spoo;
import java.util.Scanner;
public class Array1 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the sise");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elemnts");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
System.out.print("e;emts are:");
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
}
}
