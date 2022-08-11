package spoo;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="selenium";
		String s1="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
				}
				
			}
		}

	}

}
