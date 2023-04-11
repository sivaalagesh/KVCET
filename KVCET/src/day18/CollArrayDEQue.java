package day18;

import java.util.ArrayDeque;

public class CollArrayDEQue 
{

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		
		a.add(100);
		a.add(200);
		a.add(300);
		
		System.out.println(a);
		
		
		a.addFirst(50);
		
		System.out.println(a);
		
		a.removeLast();
		System.out.println(a);

	}

}
