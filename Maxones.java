//Maximum ones in a row
import java.lang.*;
import java.util.Scanner;
class Maxones
{
	public static void main(String args[])
	{
		int r,c,i,j,count,max;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		int a[][]=new int[r][c];
		int b[]=new int[r];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				a[i][j]=s.nextInt();
		}
		for(i=0;i<r;i++)
		{
			count=0;
			for(j=0;j<c;j++)
			{
				if(a[i][j]==1)
					count++;
			}
			b[i]=count;
		}
		max=b[0];
		for(i=0;i<r;i++)
		{
			if(b[i]>max)
				max=b[i];
		}
		System.out.println(max);
	}
}