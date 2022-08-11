package spoo;

public class reverseTheString {
	public static void main(String[]args) {
		String s="Advanced selenium";
		String[] s2 = s.split(" ");

		//String s1="";
		
		//System.out.println(s2[1]);
		//char c[]=s.toCharArray();
		for(int i=0;i<s2.length;i++) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				System.out.print(s2[i].charAt(j));
		}
		System.out.print(" ");
	
	}
}}
