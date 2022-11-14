import java.lang.*;
import java.util.Scanner;
class Maxdigit
{
	public static void main(String args[])
	{
		int n,temp,max,index=-1,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		a[0]=0;a[1]=0;a[2]=0;a[3]=0;a[4]=0;a[5]=0;a[6]=0;a[7]=0;a[8]=0;a[9]=0;
		temp=n;
		while(temp!=0)
		{	
			a[temp%10]++;
			temp=temp/10;
		}
		max=a[0];
		for(i=1;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				index=i;
			}
			else if(a[i]==max)
			{
				index=i;
			}
		}
		System.out.println(index);
	}
}