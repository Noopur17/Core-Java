
public class Consexample1 {
	
	void m1()
	{
		System.out.println("m1 method");
	}
	

	 Consexample1() 
	{
		 System.out.println("0-arg Constructor");
	}
	 Consexample1(int a)
	 {
		 System.out.println("Parameterised Constructor");
	 }
	public static void main(String[] args) {
		Consexample1 c = new Consexample1();
		Consexample1 c1 = new Consexample1(10);
		
		c.m1();
		c1.m1();
		
		
	}

}
