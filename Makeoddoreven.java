//make odd or even
import java.lang.*;
import java.util.Scanner;
class Makeoddoreven
{
	public static void main(String args[])
	{
		int n,i,odd=0,even=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		if(odd>even)
		{
			for(i=0;i<n;i++)
			{
				if(a[i]%2!=0)
					System.out.print((a[i]+1)+" ");
				else	
					System.out.print(a[i]+" ");
			}
		}
		if(odd==even)
		{
			for(i=0;i<n;i++)
			{
				if(a[i]%2!=0)
					System.out.print((a[i]+1)+" ");
				else	
					System.out.print((a[i]-1)+" ");
			}
		}
		else
		{
			for(i=0;i<n;i++)
			{
				if(a[i]%2!=0)
					System.out.print(a[i]+" ");
				else	
					System.out.print((a[i]-1)+" ");
			}
		}
	}
}