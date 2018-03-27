 class StringManipulationEx5
 {
	 public static void main(String[] args) {
		String s1="noopur";
		String s2="bhatt";
		String s3="noopur";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s2));//false
		System.out.println("NOOPUR".equals("noopur"));//FALSE
		System.out.println("NOOPUR".equalsIgnoreCase("noopur"));//true
		
		
		System.out.println(s1.compareTo(s2));//+ve
		System.out.println(s1.compareTo(s3));//0
		System.out.println(s2.compareTo(s3));//-ve
		System.out.println("NOOPUR".compareTo("noopur"));//-ve
		System.out.println("NOOPUR".compareToIgnoreCase("noopur"));//0
	}

}
