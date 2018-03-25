//not possible to override the static methods in java because static methods are specific to class.

class Poly
{
	static void m1()
	{
		System.out.println("Parent m1()");
	}
}
 class Polymorexample2 extends Poly
{
	 static void m1()
		{
			System.out.println("Child m1()");
			
		}
			public static void main(String[] args)
			{
				Poly p= new Polymorexample2();
				p.m1();
			}
		
}
