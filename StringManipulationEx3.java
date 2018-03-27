
 class StringManipulationEx3 
 {
	 public StringManipulationEx3(String str) {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
		StringManipulationEx3 s1= new StringManipulationEx3("Noopur");
		StringManipulationEx3 s2=new StringManipulationEx3("Noopur");
		System.out.println(s1.equals(s2));
		
		String s3="Bhatt";
		String s4="Bhatt";
		System.out.println(s3.equals(s4));
		
		StringBuffer s5= new StringBuffer("Shailesh");
		StringBuffer s6= new StringBuffer("Shailesh");
		System.out.println(s5.equals(s6));
	}
}
