//dynamic armstrong
import java.lang.*;
import java.util.Scanner;
class Armstrongdynamic
{
	public static void main(String args[])
	{
		int n,temp,sum=0,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=n;
		while(temp!=0)
		{
			sum=sum+((int)(Math.pow(temp%10,count)));
			temp=temp/10;
		}
		if(sum==n)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}