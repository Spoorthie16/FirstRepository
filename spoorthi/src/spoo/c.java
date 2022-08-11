package spoo;

import java.util.Scanner;

public class c {
	public static void main(String[]args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=true;
		System.out.println("enter the elemnt");
		 int s=sc.nextInt();
		 for(int i=0;i<a.length;i++) {
			 if(s==a[i]) {
				 flag=false;
				 break;
			 }}
			 if(flag==false) {
				 System.out.println("present");
			 }
			 else {
				 System.out.println("not");
				 
			 }
		 }
}
