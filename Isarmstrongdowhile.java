//armstrong number using dowhile loop
import java.lang.*;
import java.util.Scanner;
class Isarmstrongdowhile
{
	public static void main(String args[])
	{
		int n,sum=0,rem,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		do
		{
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}while(temp!=0);
		if(sum==n)
			System.out.println("Armstrong number");
		else
			System.out.println("Not a armstrong number");
	}
}