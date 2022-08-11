package spoo;

public class ArrayDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,98,4,6,24};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}}
	System.out.println(a[i]);
		}
	
}}
