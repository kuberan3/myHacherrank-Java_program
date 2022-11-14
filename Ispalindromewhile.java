//palindrome using while loop
import java.lang.*;
import java.util.Scanner;
class Ispalindromewhile
{
	public static void main(String args[])
	{
		int n,rev=0,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			rev=rev*10+(temp%10);
			temp=temp/10;
		}
		if(rev==n)
			System.out.println("Palindrome number");
		else 
			System.out.println("Not a palindrome number");
	}
}