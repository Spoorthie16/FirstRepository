package spoo;

public class To_Remove_duplicate_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aaabbbbdfdsfsdffff";
char c[]=s.toCharArray();
String s1="";
for(int i=0;i<c.length;i++) {
	if(s1.indexOf(c[i])==-1) {
		s1=s1+c[i];
	}
}
System.out.println(s1);
	}

}
