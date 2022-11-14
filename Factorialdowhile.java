//Factorial using dowhile
import java.lang.*;
import java.util.Scanner;
class Factorialdowhile
{
	public static void main(String args[])
	{
		int n,fact=1,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		do
		{
			fact=fact*i;
			i++;
		}while(i<=n);
		System.out.println("Factorial is "+fact);
	}
}