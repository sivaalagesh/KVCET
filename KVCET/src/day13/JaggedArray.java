package day13;

public class JaggedArray 
{

	public static void main(String[] args) 
	{
		int a[][] = new int[4][];
		
		a[0] = new int[3];
		
		a[1] = new int[1];
		
		a[2] = new int[2];
		
		a[3] = new int[5];
		
		int count = 1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = count++;
			}
		}
		
		System.out.println("Contents of JAgged array");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
