//Method overloading
 class Polymorexample1 
 {
	 void m1(int a)
	 {
		 System.out.println("int m1 method");
	 }
	 
	 void m1(int a, int b)
	 {
		 System.out.println("int,int m1 method");
	 }
	 
	 void m1(char ch)
	 {
		 System.out.println("char m1 method");
	 }
	 
	 public static void main(String[] args)
	 {
		 Polymorexample1 p =new Polymorexample1();
		 p.m1(10);
		 p.m1('N');
		 p.m1(10, 20);
	 }

}
