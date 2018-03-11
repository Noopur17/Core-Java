
 class Consexample2 
{
	 //instance variable
	int eid;
	String ename;
	double esal;
	
	Consexample2()
	{
		eid=111;
		ename="Sam";
		esal=10000000;
	}
	
	void disp()
	{
		System.out.println("emp id= "+eid);
		System.out.println("emp name= "+ename);
		System.out.println("emp salary= "+esal);
	}
	 
	public static void main(String[] args) {
		
		Consexample2 e= new Consexample2();
		e.disp();
	}

}
