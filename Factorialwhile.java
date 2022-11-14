//Factorial using while
import java.lang.*;
import java.util.Scanner;
class Factorialwhile
{
	public static void main(String args[])
	{
		int n,fact=1,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial is "+fact);
	}
}