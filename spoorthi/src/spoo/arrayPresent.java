package spoo;

import java.util.Scanner;

public class arrayPresent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the sise");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	System.out.println("enter the elemnts");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	boolean fla=true;
	System.out.println("enter the value");
	int value=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if(a[i]==value) {
			fla=false;
		}}
	if(fla==false) {
		System.out.println("pre");
	}
	else {
		System.out.println("not");
	
		}
	}
}
