package spoo;

import java.util.LinkedHashMap;

public class CountDuplicatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hi hi heloo hi bye";
String c[]=s.split(" ");
LinkedHashMap h=new LinkedHashMap<>();
int count=0;
char s1;
for(int i=0;i<c.length;i++) {
	count=0;
	for(int j=0;j<=c.length;j++) {
		if(c[i].equals(c[i])){
			count++;
			h.put(c[i],count);
		}
	}
	System.out.println(h);
}



	}

}
