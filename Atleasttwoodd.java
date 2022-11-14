//atlest two odd digits
import java.lang.*;
import java.util.Scanner;
class Atleasttwoodd
{	
	public static void main(String args[])
	{
		int n,i,temp,count,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			temp=a[i];count=0;
			while(temp!=0)
			{
				if((temp%10)%2!=0)
					count++;
				temp=temp/10;
			}
			if(count>=2)
				sum=sum+a[i];
		}
		System.out.println(sum);
	}
}