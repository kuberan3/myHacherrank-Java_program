//prime or not while loop
import java.lang.*;
import java.util.Scanner;
class Isprimewhile
{
	public static void main(String args[])
	{
		int n,count=0,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n)
		{
			if(n%i==0)
				count++;
			i++;
		}
		if(count==2)
			System.out.println("Prime");
		else 
			System.out.println("Not Prime");
	}
}