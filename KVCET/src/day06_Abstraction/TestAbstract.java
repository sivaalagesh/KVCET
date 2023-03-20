package day06_Abstraction;

public class TestAbstract 
{

	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.sound();
		d.sleep();
		
		Cat c = new Cat();
		c.sound();
		c.sleep();

	}

}
