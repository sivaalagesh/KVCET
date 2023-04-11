package day21;
import java.util.*;

public class Factorial 
{
	static int Factori(int n)
	{
		if(n==0)
			return 1;
		else
			return (n * Factori(n-1));
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter n");
		n = s.nextInt();
		
		fact = Factori(n);
		
		System.out.println("Factorial of the given number is "+fact);

	}

}
