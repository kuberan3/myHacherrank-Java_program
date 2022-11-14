//Maximum repeated integer
import java.lang.*;
import java.util.Scanner;
class Maxrepeatedint
{
	public static void main(String args[])
	{
		int n,i,j,k,count,count1,max,index=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		k=0;
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=0;j<n;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			b[k]=a[i];
			c[k]=count;
			k++;
		}
		max=c[0];count1=0;
		for(i=0;i<k;i=i+1)
		{
			if(c[i]==1)
				count1++;
			if(c[i]>max)
			{
				max=c[i];
				index=i;
			}
		}
		if(count1==i)
			System.out.println("-1");
		else
			System.out.println(b[index]);
	}
}