//bean class ||vo(value object)||bo (business object)||DTO (data transfer object)
 class EmpBean 
{
	 //instance variable
	private int eid;
	private String ename;
	
	//setters(used to set the value to properties)
	public void setEid(int eid)//local variable
	{
		this.eid=eid;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public String getEname()
	{
		return ename;
	}
}
