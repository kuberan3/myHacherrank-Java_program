//prime or not
import java.lang.*;
import java.util.Scanner;
class Isprime
{
	public static void main(String args[])
	{
		int n,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
}