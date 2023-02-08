package day05_Inheritance;

public class HybridInheritance 
{

	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.sound();
		c.meow();
		
		Puppy p = new Puppy();
		p.sound();
		p.bark();
		p.play();
		
		Tiger t = new Tiger();
		t.sound();
		t.roar();

	}

}
