//First M even integers
import java.lang.*;
import java.util.Scanner;
class Firstmevenint
{
	public static void main(String srgs[])
	{
		int n,m,i,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{	
				count++;
				if(count>m)
					break;
				else
					System.out.print(a[i]+" ");
			}
		}
		if(count==0)
			System.out.println("-1");
	}
}