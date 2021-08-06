package thiskeyword;

public class B extends A {
	
	public B() 
	{
		this(144);
		System.out.println("Constructor of class B");
	}
	
	public B(int i)
	{
		System.out.println(i);
	}

}
//constructor have super keyword by default