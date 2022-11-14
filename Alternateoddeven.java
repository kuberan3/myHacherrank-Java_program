//check alternate oddd even
import java.lang.*;
import java.util.Scanner;
class Alternateoddeven
{
	public static void main(String args[])
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			if(a[i]%2==a[i+1]%2)
				break;
		}
		if(i<n-1)
			System.out.println("NO");
		else	
			System.out.println("YES");
	}
}