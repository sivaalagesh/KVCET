package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class CollArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		System.out.println(al);
		
		for(int i:al)
		{
			System.out.print(i+"\t");
		}
		
        Iterator<Integer> ir = al.iterator();
		
		if(ir.hasNext())
		{
			System.out.println(al);
		}
		

	}

}
