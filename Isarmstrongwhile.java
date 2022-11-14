//armstrong number using while loop
import java.lang.*;
import java.util.Scanner;
class Isarmstrongwhile
{
	public static void main(String args[])
	{
		int n,sum=0,rem,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(sum==n)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}
}