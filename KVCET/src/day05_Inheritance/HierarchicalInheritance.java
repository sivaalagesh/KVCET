package day05_Inheritance;

public class HierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.sound();
		c.meow();
		
		Dog d = new Dog();
		d.sound();
		d.bark();
		
		Tiger t = new Tiger();
		t.sound();
		t.roar();

	}

}
