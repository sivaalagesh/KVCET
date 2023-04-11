package day21;
import java.util.*;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int n,r,q=0,orig;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = s.nextInt();
		orig = n;
	while(n>0)
	{
		r = n % 10;    // r = 1 % 10 = 1
		q = (q*10)+r;   // q = 321
		n = n / 10;     // n = 1 / 10 = 0
	}
	
	if(orig == q)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}

	}

}
