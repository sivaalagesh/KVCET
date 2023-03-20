package day08;

public class Student 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.SDisplay();
		Teacher t = new Teacher();
		t.TDisplay();

	}
	
	public void SDisplay()
	{
		System.out.println("Method From Student class");
	}

}
