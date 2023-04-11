package day19;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		char c[]= {'h','e','l','l','o'};
		
		String s1 = new String(c);
		
		String s2 = new String("Welcome");
		
		String s3 = "You all ";
		
		
		System.out.println(s1+" "+s2+" "+s3);
		
		System.out.println(s1.charAt(1));
		
		System.out.println(s2.substring(1, 3));

	}

}
