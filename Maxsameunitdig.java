//Maximum sum - same unit digit
import java.lang.*;
import java.util.Scanner;
class Maxsameunitdig
{
	public static void main(String args[])
	{
		int n,i,j,sum,max;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{	
			sum=0;
			for(j=0;j<n;j++)
			{
				if(a[i]%10==a[j]%10)
					sum=sum+a[j];
			}
			b[i]=sum;
		}
		max=b[0];
		for(i=1;i<n;i++)
		{	
			if(b[i]>max)
				max=b[i];
		}
		System.out.println(max);
	}
}