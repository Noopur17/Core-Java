
public class EmpBeanTest 
{
	public static void main(String[] args) 
	{
		EmpBean eb1 = new EmpBean();
		//setter is used to set the data
		eb1.setEid(100);
		eb1.setEname("Noopur");
		
		//getter is used to get the data
		int eid= eb1.getEid();
		System.out.println(eid);
		String ename=eb1.getEname();
		System.out.println(ename);
		
		
				
		
	}
}
