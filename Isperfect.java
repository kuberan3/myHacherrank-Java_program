//perfect or not
import java.lang.*;
import java.util.Scanner;
class Isperfect
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}
}