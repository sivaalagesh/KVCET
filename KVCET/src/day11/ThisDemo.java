package day11;

class Student
{
	int roll;
	String name;
	String dob;
	
	Student(int roll,String name,String dob)
	{
		this.roll=roll;
		this.name=name;
		this.dob=dob;
	}
	
	void display()
	{
		System.out.println(roll+"\t"+name+"\t"+dob);
	}
	
}

public class ThisDemo 
{
	
	public static void main(String[] args) 
	{
		Student td = new Student(100,"ABC","01-02-2000");
		Student td1 = new Student(200,"CDE","03-03-2000");
		Student td2 = new Student(300,"XYZ","05-06-2000");
		td.display();
		td1.display();
		td2.display();

	}

}
