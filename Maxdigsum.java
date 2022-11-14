//Max digit sum-Ma value
import java.lang.*;
import java.util.Scanner;
class Maxdigsum
{
	int sumOfDigits(int m)
	{
		int sum=0;
		while(m!=0)
		{
			sum=sum+(m%10);
			m=m/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		int n,i,max,k;
		Maxdigsum p=new Maxdigsum();
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n*2];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			b[i]=p.sumOfDigits(a[i]);
		}
		max=b[0];
		for(i=1;i<n;i++)
		{
			if(b[i]>max)
				max=b[i];
		}
		k=0;
		for(i=0;i<n;i++)
		{
			if(p.sumOfDigits(a[i])==max)
				c[k]=a[i];
			k++;
		}
		max=c[0];
		for(i=0;i<k;i++)
		{
			if(c[i]>max)
				max=c[i];
		}
		System.out.println(max);
	}
}