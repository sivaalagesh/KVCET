package day10;

class Student
{
	int roll;
	String name;
	static String clg="AU";
	 
	 static void change()
	 {
		 clg = "Anna University";
	 }
	
	void display(int roll, String name)
	{
		System.out.println("Roll Number :"+roll);
		System.out.println("NAme :"+name);
		System.out.println("COllege NAme :"+clg);
	}
	
	static 
	{
		clg = "KVCET - Affiliated to Anna University";
		System.out.println(clg);
	}
}

public class StaticDemo 
{
	public static void main(String[] args) 
	{
		Student.change();
		Student s = new Student();
		s.display(100, "ABC");
			
	}
	
	static
	{
		System.out.println("Static Block executed sucessfully");
	}

}
