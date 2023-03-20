package day15;
import java.util.*;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[]=new int[10];
		int x,mid,low,high,flag=0;
		
		System.out.println("Enter the data elements in Ascending order");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the element to be searched");
		x=s.nextInt();
		
		low=0;
		high=a.length-1;
		
		while(low<=high)
		{
			mid = (low+high)/2;
			
			if(a[mid]==x) 
			{
				flag =1;
			}
			else if(a[mid]<x)
			     {
				   low = mid+1;
			      }    
			else if(a[mid]>x)
			{
				high = mid-1;
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
