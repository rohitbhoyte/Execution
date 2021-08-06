package methodrunningruleanddatamemberrunningrule;

public class Test {
	
	public static void main(String[] args) {
		
		A a=new B();
		a.m1();
		a.m2();
		System.out.println(a.a);
		System.out.println(a.b);
        //System.out.println(a.c);  error a/c to data member running rule  

		
	}

}

