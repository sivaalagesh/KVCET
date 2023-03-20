package day13;

public class UnboxDemo 
{

	public static void main(String[] args) 
	{
		Integer i = new Integer(20);
		
		int a = i.intValue();
		
//		int a = i;
		
		System.out.println(i+"\t"+a);

	}

}
