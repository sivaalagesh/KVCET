package day07;

class Bank
{
	float getROI()
	{
		return 0;
	}
}

class SBI extends Bank
{
	float getROI()
	{
		return 8.9f;
	}
}

class IOB extends Bank
{
	float getROI()
	{
		return 7.8f;
	}
}

class HDFC extends Bank
{
	float getROI()
	{
		return 10.7f;
	}
}
public class PolyMorphism 
{

	public static void main(String[] args) 
	{
		SBI s = new SBI();
		System.out.println("SBI Interest "+s.getROI());
		IOB i = new IOB();
		System.out.println("IOB Interest "+i.getROI());
		HDFC h = new HDFC();
		System.out.println("HDFC Interest "+h.getROI());

	}

}
