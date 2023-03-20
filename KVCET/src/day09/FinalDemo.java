package day09;

final class Sample
{
	 int var=67;
	
    void display()
	{
//		var = 55;
		System.out.println("Value :"+var);
	}
}

public class FinalDemo 
{
	void display()
	{
		int var = 66;
		System.out.println("value :"+var);
	}

	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.display();
		FinalDemo fd = new FinalDemo();
		fd.display();

	}

}
