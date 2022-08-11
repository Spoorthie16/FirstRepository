package spoo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> h=new HashMap();
h.put(1, "spoo");
h.put(2,"pri");
h.put(3,"sha");
h.put(1, "hems");
System.out.println(h);
Set h1 = h.keySet();
for(Object o:h1) {
	System.out.println(o);
}
Collection h2 = h.values();
for(Object M:h2) {
	System.out.println(M);

}
for(Entry h3:h.entrySet()) {
	System.out.println(h3.getKey()+" "+h3.getValue());
}
	}

}
