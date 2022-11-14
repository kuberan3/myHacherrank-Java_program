//palindrome or not using for loop
import java.lang.*;
import java.util.Scanner;
class Ispalindrome
{
	public static void main(String args[])
	{
		int n,rev=0,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(temp=n;temp!=0;temp=temp/10)
		{
			rev=rev*10+(temp%10);
		}
		if(rev==n)
			System.out.println("Palindrome Number");
		else 
			System.out.println("Not a palindrome number");
	}
}