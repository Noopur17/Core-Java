 class StringManipulationEx4 
{
	 public static void main(String[] args) {
		//String to StringBuffer
		 String str="Noopur";
		 StringBuffer sb=new StringBuffer(str);
		 System.out.println(sb.reverse());
		 
		 //StringBuffer to string
		 StringBuffer sb1= new StringBuffer("Bhatt");
		 String ss= sb1.toString();
		 System.out.println(ss);
	}

}
