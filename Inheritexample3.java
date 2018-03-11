
class In
{
	In(int a)
	{
	System.out.println("Parent class 1 arg cons");
	}
}
class Inheritexample3 extends In
{
	 Inheritexample3()
	{
		 super(10);
		 System.out.println("0-arg cons child");
	}
	 
	 public static void main(String[] args)
	 {
		 new Inheritexample3();
	 }
}
