package day05;

public class Student 
{

	public static void main(String[] args) 
	{
		int roll=101;
		String name="ABC";
		Student s=new Student();
		
		System.out.println("Student Details");
		s.display(roll,name);

	}
	
	public  void display(int roll, String name)
	{
		System.out.println(roll+"\t"+name);
	}
	

}
