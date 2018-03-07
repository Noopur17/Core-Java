
abstract class Abs
{
	abstract void m1();
	abstract void m2();
	abstract void m3();

}

abstract class Abs1 extends Abs  //declare abstract because it contains still 2 abstract methods.
{
	void m1()
	{
		System.out.println("m1 method");
	}
}

abstract class Abs2 extends Abs1    //declare abstract because it contains still 1 abstract methods.
{
	void m2()
	{
		System.out.println("m2 method");
	}
}
 class Abstclsexample2 extends Abs2
 {
	 void m3()
	 {
		 System.out.println("m3 method");
	 }
	 
	 public static void main(String[] args)
	 {
		 Abstclsexample2 a = new Abstclsexample2();
		 a.m1();
		 a.m2();
		 a.m3();
	 }
}
