package spoo;

import java.util.TreeMap;

public class Maps_NumberOfAccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="karnataka";
char c[]=s.toCharArray();
int count=0;
TreeMap m=new TreeMap();
for(int i=0;i<c.length;i++) {
	count=0;
	for(int j=0;j<c.length;j++) {
		if(c[i]==c[j]) {
			count++;
			
		}
	}
	m.put(c[i], count);
	
}
System.out.println(m);
	}

}
