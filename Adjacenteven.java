//adjacent even digits
import java.lang.*;
import java.util.Scanner;
class Adjacenteven
{
	public static void main(String args[])
	{
		int n,temp,flag=0,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		temp=n;i=0;
		while(temp!=0)
		{
			a[i]=temp%10;
			temp=temp/10;
			i++;
		}
		if(a[i-2]%2==0)
		{	
			flag=1;
			System.out.print(a[i-1]+" ");
		}
		for(int j=i-2;j>=1;j--)
		{
			if(a[j+1]%2==0 && a[j-1]%2==0)
			{
				flag=1;
				System.out.print(a[j]+" ");
			}
		}
		if(a[1]%2==0)
		{	
			flag=1;
			System.out.print(a[0]+" ");
		}
		if(flag==0)
			System.out.println("-1");
	}
}