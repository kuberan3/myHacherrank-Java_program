//Divisible - Sum of Digits
import java.lang.*;
import java.util.Scanner;
class Divisibledigitssum
{	
	public static void main(String args[])
	{
		int n,i,temp,sum,flag=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			temp=a[i];sum=0;
			while(temp!=0)
			{	
				sum=sum+(temp%10);
				temp=temp/10;
			}
			if(a[i]%sum==0)
			{
				flag=1;
				System.out.print(a[i]+" ");
			}
		}
		if(flag==0)
			System.out.println("-1");
	}
}