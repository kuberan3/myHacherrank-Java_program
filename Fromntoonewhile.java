import java.lang.*;
import java.util.Scanner;
class Fromntoonewhile
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		i=n;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
}