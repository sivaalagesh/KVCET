package day20;

class Demo
{
	public void display()
	{
		System.out.println("In Base Class");
	}
}

public class AnnotationDemo extends Demo
{
	@Override
	public void display()
	{
		System.out.println("In Derived class");
	}

	public static void main(String[] args) 
	{
	  AnnotationDemo ad = new AnnotationDemo();
	  ad.display();

	}
	

}
