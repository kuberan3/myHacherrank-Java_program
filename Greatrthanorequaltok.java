//greater than or equal to k
import java.lang.*;
import java.util.Scanner;
class Greatrthanorequaltok
{
	public static void main(String args[])
	{
		int n,i,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]<k)
				break;
		}
		if(i<n)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}