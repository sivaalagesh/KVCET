package day07;

class Student
{
	public void display()
	{
		System.out.println("display method in Students Class");
	}
}

public class Sample extends Student
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Sample s = new Sample();
		Student ss = new Student();
		ss.display();
		s.display();
		Sample.display(1);
		Sample.display(45.6f);
	}
	
	public  void display()
	{
		System.out.println("Display Method");
	}
	
	public static void display(int a)
	{
		System.out.println("Second Display Method");
	}
	
	public static void display(float b)
	{
		
	}

}
