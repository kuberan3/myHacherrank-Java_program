import java.lang.*;
import java.util.Scanner;
class Boundaryint
{
	public static void main(String args[])
	{
		int r,c,k,i,j;
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		c=s.nextInt();
		k=s.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			if(i<1 || i>r-2)
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]!=k)
						break;
				}
			}
			else
			{
				for(j=0;j<c;j=j+(c-1))
				{
					if(a[i][j]!=k)
						break;
				}
			}
			if(j<c)
				break;
		}
		if(i<r)
			System.out.println("NO");
		else	
			System.out.println("YES");
	}
}