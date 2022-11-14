import java.lang.*;
import java.util.Scanner;
class Fromntoonedowhile
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		i=n;
		do
		{
			System.out.println(i);
			i--;
		}while(i>=1);
	}
}