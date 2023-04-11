package day22;

@FunctionalInterface
interface Animal
{
	public void run();
}

public class WithoutLambda 
{

	public static void main(String[] args) 
	{
		Animal a = new Animal() {
		public void run()
		{
			System.out.println("RUNNING");
		}

	};
	
	a.run();

    }
}