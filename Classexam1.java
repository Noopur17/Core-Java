 class Classexam1 
 {
	 int a=10;//instance variable
	 static int b=20;//static variable
	 
	 void m1(int a)//instance method
	 {
		 System.out.println("instance method");
	 }
	 
	 static void m2(String str)//static method
	 {
		 System.out.println("static method");
	 }
	 Classexam1() //0-arg constructor
	 {
		 System.out.println("0-arg constructor");
	 }
	 
	 Classexam1(int a) //parameterized constructor
	 {
		 System.out.println("1-arg constructor");
	 }
	 
	 {//instance block
		 System.out.println("instance block");
	 }
	 
	static {//static block
		 System.out.println("Static block");
	 }
	
	
	public static void main(String[] args)
	{
		Classexam1 c=new Classexam1();
		Classexam1 c1=new Classexam1(10);
		c.m1(10);
		Classexam1.m2("Noopur");
		
	}

}
