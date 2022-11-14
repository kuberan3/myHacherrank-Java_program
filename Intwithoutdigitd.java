//integers without digit D
import java.lang.*;
import java.util.Scanner;
class Intwithoutdigitd
{	
	public static void main(String args[])
	{
		int n,d,flag=0,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		d=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			while(temp!=0)
			{
				if(temp%10==d)
					break;
				temp=temp/10;
			}
			if(temp==0)
			{
				System.out.print(a[i]+" ");
				flag=1;
			}
		}
		if(flag==0)
			System.out.print("-1");
	}
}