package day24;

import java.util.regex.Pattern;

public class Regex1Demo 
{

	public static void main(String[] args) 
	{
	   System.out.println(Pattern.matches("j..a", "java"));
	   System.out.println(Pattern.matches(".a.a", "lava"));
	   
	   System.out.println(Pattern.matches("[a-dA-D[m-pM-P]]", "Z"));

	}

}
