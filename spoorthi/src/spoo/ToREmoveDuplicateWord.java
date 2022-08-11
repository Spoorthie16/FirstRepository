package spoo;

public class ToREmoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello hi hello welcom to banglore";
String[] s1=s.split(" ");
String s2="";
for(int i=0;i<s1.length;i++) {
	if(!(s2.contains(s1[i]))) {
		s2=s2+" "+s1[i];
		
	}
}
s2=s2.trim();
System.out.println(s2);
	}

}
