package day13;
import java.util.*;

public class DividebyZeroDemo 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("***************");
		}
		

	}

}
