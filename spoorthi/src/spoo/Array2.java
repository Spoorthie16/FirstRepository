package spoo;

import java.util.Scanner;

public class Array2 {

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
	System.out.print("sum");
	for(int i=0;i<a.length;i++) {
		
	
	 sum=sum+a[i];}
	 System.out.println(sum);
	}
	}
