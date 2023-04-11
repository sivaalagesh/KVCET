package day22;

interface Animal
{
	public void run();
	
}

public class WithLambda 
{

	public static void main(String[] args) 
	{
		Animal a = ()-> {
			System.out.println("RUNNING");
		};
		
		a.run();

	}

}
