package spoo;


	import java.util.HashMap;
	import java.util.Map;
		public class workingWithMap {
			public static void main(String[]args) {
	Map m=new HashMap();
	m.put(4,"spoo");
	m.put(2,"pruth");
	m.put(3, "niki");
	m.put(1,"swa" );
	m.put(3,"niki");
	m.put(6,"spoo");
	System.out.println(m);
	System.out.println("displying key");
	Set s=m.keySet();
	for(Object o:s) {
		System.out.println(o);
	}
			}
}