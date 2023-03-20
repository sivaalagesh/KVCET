package day14;
import java.util.*;

public class MatrixMultiplication 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int A[][]=new int[10][10];
		int B[][]=new int[10][10];
		int C[][]=new int[10][10];
		int r1,c1,r2,c2;
		
		System.out.println("Enter row size & Column size of First matrix");
		r1=s.nextInt();
		c1=s.nextInt();
		System.out.println("Enter row size & Column size of Second matrix");
		r2=s.nextInt();
		c2=s.nextInt();
		if(c1==r2)
		{
			System.out.println("Enter the data elements for matrix A");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					A[i][j]=s.nextInt();
				}
			}
			
			System.out.println("Enter the data elements for matrix B");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					B[i][j]=s.nextInt();
				}
			}
			
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					C[i][j]=0;
					for(int k=0;k<r2;k++)
					{
						C[i][j]= C[i][j]+ A[i][k]* B[k][j];
					}
					
				}
			}
			
			System.out.println("Result Matrix");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
			      System.out.print(C[i][j]+"\t");
				}
				System.out.println();
			}	
		}
		else
			System.out.println("Matrix Multiplication Not Possible");
	}


	}
