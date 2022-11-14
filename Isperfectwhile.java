//perfect number using while loop
import java.lang.*;
import java.util.Scanner;
class Isperfectwhile
{
	public static void main(String args[])
	{
		int n,sum=0,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}
}