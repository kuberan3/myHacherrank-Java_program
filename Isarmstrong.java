//armstrong using for loop
import java.lang.*;
import java.util.Scanner;
class Isarmstrong
{
	public static void main(String args[])
	{
		int n,sum=0,rem;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int temp=n;temp!=0;temp=temp/10)
		{
			rem=temp%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==n)
			System.out.println("Armstrong number");
		else 
			System.out.println("Not a armstrong number");
	}
}