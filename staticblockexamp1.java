
 class staticblockexamp1 
 {
	 {
		 System.out.println("instance block 1");
	 }
	 
	 {
		 System.out.println("instance block 2");

	 }
	 
	 static
	 {
		 System.out.println("static block 1");

	 }
	 staticblockexamp1() 
	 {
		 System.out.println("0-argument constructor");

	}
	 
	 staticblockexamp1(int a)
	 {
		 System.out.println("1-argument constructor");

	 }

	public static void main(String[] args)
	{
		new staticblockexamp1();
		new staticblockexamp1(10);
	}

}
