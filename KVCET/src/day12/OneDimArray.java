package day12;
import java.util.*;

public class OneDimArray 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[]= new int[10];
		
		System.out.println("Enter 10 values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a[4]);

	}

}
