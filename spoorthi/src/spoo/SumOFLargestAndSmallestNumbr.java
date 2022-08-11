package spoo;

import java.util.Scanner;

public class SumOFLargestAndSmallestNumbr {
public static void main(String[]args) {
	//Scanner sc=new Scanner(System.in);
	int[] arr = { 28, 45, 36, 87, 66, 55, 99 };
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] > arr[j]) {
				int tem = arr[i];
				arr[i] = arr[j];
				arr[j] = tem;
			}
			
		}
	}
	for(int  i=0;i<arr.length;i++){
		//System.out.print(arr[i]+" ");
	
}
	System.out.println(arr[arr.length-1]+arr[0]);
}}
//int []arr= {28,43,12,90};
//int min=0;
//int max=0;
//int sum=0;
//for(int i=0; i<arr.length;i++) {
//	if(min>arr[i]) 
//		min=arr[i];
//	
//		System.out.println(min);
//		if(max<arr[i]) 
//			max=arr[i];
//			System.out.println(max);
//		}}
//	//sum=max+min;
//	//System.out.println(sum);
//
//

