//Integers Check Triplets
import java.lang.*;
import java.util.Scanner;
class Checktriplets
{
	public static void main(String args[])
	{
		int n,i,j,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=0;k<n;k++)
				{	
					if((a[k]*a[k])+(a[j]*a[j])==a[i]*a[i])
					break;
				}
				if(k<n)
					break;
			}
			if(j<n)
				break;
		}
		if(i<n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}