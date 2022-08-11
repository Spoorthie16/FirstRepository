package spoo;

public class replaceIA {

	public static void main(String[] args) {
	String s=new String("im a test engineer");
	char c[]=s.toCharArray();
	String s1=" ";
	for(int i=0;i<s.length();i++) {
		if(c[i]=='a'||c[i]=='i') {
			String word=""+c[i];
			s1=s1+word.toUpperCase();
		}
		else {
			s1=s1+c[i];
		}
	}
	System.out.println(s1);
	}

}
