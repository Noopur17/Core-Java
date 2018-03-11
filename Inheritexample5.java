class Me
{
	{
		System.out.println("Parent class instance block");
	}
	
	static
	{
		System.out.println("Parent class static block");
	}
	
	Me()
	{
		System.out.println("Parent class 0-arg constructor");
	}
}
 class Inheritexample5 extends Me
 {
	 {
		 System.out.println("Child class instance block");
	 }
	 
	 static
	 {
			System.out.println("child class static block");
		}
	 
	 Inheritexample5()
		{
		 	//super(); code generated by compiler
			System.out.println("child class 0-arg constructor");
		}
	 
	 public static void main(String[] args)
	 {
		 new Inheritexample5();
	 }

}
