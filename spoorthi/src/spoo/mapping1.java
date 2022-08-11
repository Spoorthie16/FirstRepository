package spoo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> m=new HashMap();
m.put("spoo", 76);
m.put("priya",98 );
m.put("shash", 78);
m.put("moni", 76);
System.out.println("keys");
Set s=m.keySet();
for(Object o:s) {
	System.out.println(o);
}
System.out.println("values");
Collection s1=m.values();
for(Object o:s1) {
	System.out.println(o);
	for(Map.Entry<Interger,String>i:m.entrySet()) {
		System.out.println(i.getKey()+" "i.getValue());
}}
	

	}

}
