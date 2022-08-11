package spoo;

public class abDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abstr3 a1=new abstr3();
a1.test1();
a1.test2();
abstr2 a2=a1;
a2.test2();
a2.test1();
abstr1 a3=a1;
a3.test1();
//a3.test2();

	}

}
