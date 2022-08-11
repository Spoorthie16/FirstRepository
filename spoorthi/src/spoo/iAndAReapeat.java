package spoo;

public class iAndAReapeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="helo hi helo and hi";
String s1[]=s.split(" ");
String s2=" ";
for(int i=0;i<s1.length;i++) {
	if(!s2.contains(s1[i])) {
		s2=s2+" "+s1[i];
	}
}
System.out.println(s2);	}

}
