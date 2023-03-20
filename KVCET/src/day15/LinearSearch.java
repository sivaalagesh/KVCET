package day15;
import java.util.*;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[]=new int[10];
		int x,flag=0;
		
		System.out.println("Enter the data elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched");
		x=s.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				flag =1;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element present in a list");
		}
		else
			System.out.println("Element Not present");

	}

}
