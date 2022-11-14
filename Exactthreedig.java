import java.lang.*;
import java.util.Scanner;
class Exactthreedig
{
	public static void main(String args[])
	{
		int n,temp,i,count=0;
		int a[]=new int[10];
		a[0]=0;a[1]=0;a[2]=0;a[3]=0;a[4]=0;a[5]=0;a[6]=0;a[7]=0;a[8]=0;a[9]=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			a[temp%10]++;
			temp=temp/10;
		}
		for(i=0;i<10;i++)
		{
			if(a[i]>0)
				count++;
		}
		if(count==3)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}