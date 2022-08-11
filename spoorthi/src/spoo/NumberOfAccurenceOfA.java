package spoo;

public class NumberOfAccurenceOfA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="karnataka";
char c[]=s.toCharArray();
int count=0;
for(int i=0;i<c.length;i++) {
	if(c[i]=='a') {
		count++;
	}
}
System.out.println(count);
	}

}
