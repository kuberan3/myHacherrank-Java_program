//Circular prime or not
import java.lang.*;
import java.util.Scanner;
class Circularprime
{
	public static void main(String args[])
	{
		int n,temp,count=0,count1,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=n;
		for(i=1;i<count;i++)
		{
			count1=0;
			for(j=1;j<=temp;j++)
			{
				if(temp%j==0)
					count1++;
			}
			temp=(temp%10)*100+(temp/10);
			if(count1!=2)
				break;
		}
		if(i<count)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}