import java.lang.*;
import java.util.Scanner;
class Fromntoone
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter n:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}