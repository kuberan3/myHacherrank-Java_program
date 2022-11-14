//consecutive 0 and 1 binary
import java.lang.*;
import java.util.Scanner;
class Consecutivebinary
{
	public static void main(String args[])
	{
		int n,i,temp,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[15];
		temp=n;i=0;
		while(temp!=0)
		{
			a[i]=temp%2;
			temp=temp/2;
			i++;
		}
		for(j=i-1;j>0;j--)
		{
			if(a[j]==a[j-1])
			{
				System.out.print(a[j]);
			}
			else
			{
				System.out.print(a[j]);
				System.out.println();
			}
		}
		System.out.print(a[0]);
	}
}