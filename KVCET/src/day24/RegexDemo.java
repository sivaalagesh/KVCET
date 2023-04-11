package day24;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo 
{

	public static void main(String[] args) 
	{
		//first method
//		Pattern p = Pattern.compile("r*mail");
//		Matcher m = p.matcher("rrrrrrrrrrrmail");
//		boolean b = m.matches();
		
//		System.out.println(b);
		
		//second method
//		boolean b = Pattern.compile(".mail").matcher("gmail").matches();
//		System.out.println(b);
		
		//Third Method
		
		boolean b = Pattern.matches(".mail", "gmail");
		System.out.println(b);

	}

}
