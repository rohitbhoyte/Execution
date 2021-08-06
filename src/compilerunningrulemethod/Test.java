package compilerunningrulemethod;

public class Test {
	
	public static void main(String[] args) {
		
		A a=new B();
		a.m1();
		a.m2();
		a.m4();
		A b=new C();
		a.m4();

		System.out.println(a.a);
		//System.out.println(a.c);
		System.out.println(a.b);



		
	}

}

