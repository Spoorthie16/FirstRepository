package spoo;

import java.util.Scanner;

public class arraySort {
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
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.print("after sorting");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}
	}
	
}
