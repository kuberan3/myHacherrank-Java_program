//perfect number using dowhile loop
import java.lang.*;
import java.util.Scanner;
class Isperfectdowhile
{
	public static void main(String args[])
	{
		int n,sum=0,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		i=1;
		do
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}while(i<=n/2);
		if(sum==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}
}