//first n terms
import java.lang.*;
import java.util.Scanner;
class Firstnterms
{
	public static void main(String args[])
	{
		int row,i,j,sum,k=1;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		for(i=1;i<=row;i++)
		{
			sum=0;
			for(j=1;j<=i;j++)
			{
				sum=sum+k;
				k++; 
			}
			System.out.print(sum);
			System.out.print(" ");
		}
	}
}