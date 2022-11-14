//palindrome using dowhile loop
import java.lang.*;
import java.util.Scanner;
class Ispalindromedowhile
{
	public static void main(String args[])
	{
		int n,rev=0,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		do
		{
			rev=rev*10+(temp%10);
			temp=temp/10;
		}while(temp!=0);
		if(rev==n)
			System.out.println("Palindrome number");
		else 
			System.out.println("Not a palindrome number");
	}
}