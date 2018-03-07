//example of abstract method
abstract class Abstcls
{
	abstract void m1();
	abstract void m2();
	abstract void m3();

	void m4()
	{
		System.out.println("m4 method");
	}
	
}
 class Abstclsexample1 extends Abstcls
 {
	 void m1()
		{
			System.out.println("m1 method");
		}
		
	 void m2()
		{
			System.out.println("m2 method");
		}
		
	 void m3()
		{
			System.out.println("m3 method");
		}
		
	public static void main(String[] args) 
	{
		Abstclsexample1 a=new Abstclsexample1();
		a.m1(); a.m2(); a.m3(); a.m4();
		//Parent p= new Child();
		//Abstcls a=new Abstclsexample1();
	}

}
