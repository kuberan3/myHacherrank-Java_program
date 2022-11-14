import java.lang.*;
import java.util.Scanner;
class Binarytoggle
{
	public static void main(String args[])
	{
		int n,sum=0,i,j,temp;
		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;i=0;
		while(temp!=0)
		{
			a[i]=temp%2;
			temp=temp/2;
			i++;
		}
		for(j=0;j<i;j++)
		{
			if(a[j]==1)
			{
				a[j]=0;
				break;
			}
		}
		for(j=0;j<i;j++)
		{
			if(a[j]==1)
			{
				sum=sum+(int)(Math.pow(2,j));
			}
		}
		System.out.println(sum);
	}
}