class Inher
{
	Inher()
	{
		System.out.println("parent class 0-arg constructor");
	}
}
 class Inheritexample4 extends Inher
 {
	 /*code is generated by compiler
	  	child()
	  	{
	  		super();
	  		}
	   */
	 public static void main(String[] args)
	 {
		 new Inheritexample4();
	 }

}
