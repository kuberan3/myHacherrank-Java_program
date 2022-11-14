//Bring zeros to left or right
import java.lang.*;
import java.util.Scanner;
class Bringzeros
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println();
		for(i=0;i<r;i++)
		{	
			if(i%2==0)
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]==0)
						System.out.print(a[i][j]+" ");
				}
				for(j=0;j<c;j++)
				{
					if(a[i][j]==1)
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			else
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]==1)
						System.out.print(a[i][j]+" ");
				}
				for(j=0;j<c;j++)
				{
					if(a[i][j]==0)
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
