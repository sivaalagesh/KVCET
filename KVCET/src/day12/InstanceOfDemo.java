package day12;

class Sample
{
	
}

public class InstanceOfDemo extends Sample
{

	public static void main(String[] args) 
	{
		InstanceOfDemo iod = null;
		
		System.out.println(iod instanceof InstanceOfDemo);
		
		System.out.println(iod instanceof Sample);

	}

}
