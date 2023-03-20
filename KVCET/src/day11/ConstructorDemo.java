package day11;

public class ConstructorDemo 
{
	int roll;
	String name;
	String dob;
	//no arg constructor
	ConstructorDemo()
	{
		System.out.println("No Argument Constructor");
	}
	
	//2 parameter constructor
	ConstructorDemo(int roll,String name)
	{
	  System.out.println("Roll Number :"+roll);
	  System.out.println("Name :"+name);
	}
	
	//3 parameter constructor
	ConstructorDemo(int roll,String name,String dob)
	{
		System.out.println("Roll Number :"+roll);
		  System.out.println("Name :"+name);
		System.out.println("DOB :"+dob);
	}
	
	ConstructorDemo(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(100);
		ConstructorDemo cd2 = new ConstructorDemo(100,"XYZ","01-01-2000");

	}

}
