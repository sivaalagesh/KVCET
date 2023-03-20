package day12;
import java.util.*;

public class TwoDimArray 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[][]=new int[3][3];
		
		System.out.println("Enter the values for 3X3 matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("3X3 matrix elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
