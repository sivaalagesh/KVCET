package day21;
import java.util.*;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n,orig,arm=0,rem,count=0,m;
		
		System.out.println("Enter Value");
		n=s.nextInt();
		orig=n;
		m=n;
		
		while(m>0)
		{
			count++;
			m=m/10;
		}
		
		while(n>0)
		{
		rem=n%10;
		arm=(int) (arm+Math.pow(rem, count));
		n=n/10;
		}
		
		if(orig == arm)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
