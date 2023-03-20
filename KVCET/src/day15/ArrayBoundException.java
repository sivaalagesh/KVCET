package day15;

public class ArrayBoundException 
{

	public static void main(String[] args) 
	{
		int a[]=new int[10];
		
		try
		{
			a[15]=100;
			System.out.println(a[15]);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
