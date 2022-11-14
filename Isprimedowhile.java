//prime or not dowhile loop
import java.lang.*;
import java.util.Scanner;
class Isprimedowhile
{
	public static void main(String args[])
	{
		int n,count=0,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		do
		{
			if(n%i==0)
				count++;
			i++;
		}while(i<=n);
		if(count==2)
			System.out.println("Prime");
		else 
			System.out.println("Not Prime");
	}
}