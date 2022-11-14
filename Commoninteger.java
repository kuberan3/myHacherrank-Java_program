import java.lang.*;
import java.util.Scanner;
class Commoninteger
{
	public static void main(String args[])
	{	
		int x1,y1,x2,y2,i,j,temp;
		Scanner s=new Scanner(System.in);
		x1=s.nextInt();
		y1=s.nextInt();
		x2=s.nextInt();
		y2=s.nextInt();
		if(x1>y1)
		{
			temp=x1;x1=y1;y1=temp;
		}
		if(x2>y2)
		{
			temp=x2;x2=y2;y2=temp;
		}
		if(x2>y1)
			System.out.println("-1");
		else
		{
			for(i=x2;i<=y2;i++)
		    {
				for(j=x1;j<=y1;j++)
				{
					if(i==j)
						System.out.print(i+" ");
				}
			}
		}
	}
}