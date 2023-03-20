package day07;
import java.util.*;

public class ScannerClas 
{

	public static void main(String[] args) 
	{
		int roll;
		String name;
		double per;
		
		Scanner s = new Scanner(System.in);
		roll= s.nextInt();
		name = s.next();
		per = s.nextDouble();
		
		System.out.println(roll + name + per);

	}

}
