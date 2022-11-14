//NAWR armstrong
import java.lang.*;
import java.util.Scanner;
class Armstrong
{
	static int n;
	int isArmstrong()
	{
		int temp,sum=0,rem;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Armstrong a=new Armstrong();
		if(a.isArmstrong()==n)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}