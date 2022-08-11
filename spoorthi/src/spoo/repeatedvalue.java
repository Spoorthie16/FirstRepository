package spoo;

public class repeatedvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="i live and live";
String s1[]=s.split(" ");
String s2="live";
int count=0;
for(int i=0;i<s1.length;i++) {
	if(s1[i].equals(s2)) {
		count++;
	}
}
System.out.println(count);
}
	

}
