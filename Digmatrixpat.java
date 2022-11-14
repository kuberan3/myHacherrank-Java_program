//digit matrix pattern
import java.lang.*;
import java.util.Scanner;
class Digmatrixpat
{
	public static void main(String args[])
	{	
		int n,temp,rev=0,i,j,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			rev=rev*10+(temp%10);
			temp=temp/10;
		}
		for(i=1;i<=rev%10;i++)
		{
			temp=rev;
			while(temp!=0)
			{
				for(j=1;j<=rev%10;j++)
				{
					System.out.print(temp%10);
				}
				temp=temp/10;
			}
			System.out.println();
		}
	}
}