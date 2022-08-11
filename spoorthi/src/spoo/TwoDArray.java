package spoo;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the rows");
int rows=sc.nextInt();
System.out.println("enter the column");
int columns=sc.nextInt();
int a[][]=new int[rows][columns];
System.out.println("enter the elements");
//to take the element
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
	a[i][j]=sc.nextInt();
	
}
	}
	//to display the element
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
		System.out.print(a[i][j]+" ");
	}
System.out.println();
}}}
