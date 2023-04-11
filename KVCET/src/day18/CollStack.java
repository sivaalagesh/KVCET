package day18;

import java.util.Stack;

public class CollStack 
{

	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		
		System.out.println(s.isEmpty());
		s.push("ABC");
		s.push("QWE");
		s.push("XYZ");
		s.push("TYU");
		s.push("CVB");
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.pop();
		System.out.println(s);
		
		

	}

}
