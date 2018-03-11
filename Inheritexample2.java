
class Inherit
{
	void m1()
	{
		System.out.println("Parent class method");
	}
}
class Inheritexample2 extends Inherit
{
	
	void m1()
	{
		System.out.println("child class method");

	}
	
	void m2()
	{
		m1();
		super.m1();
	}

	public static void main(String[] args) 
	 {
		Inheritexample2 h = new Inheritexample2();
		 h.m2();
	}

}
