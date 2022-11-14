//first and last X integers
import java.lang.*;
import java.util.Scanner;
class Firstlastx
{
	public static void main(String args[])
	{
		int n,i,x;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		x=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{	
			a[i]=s.nextInt();
		}
		for(i=0;i<x;i++)
		{	
			if(a[i]!=a[n-x+i])
				break;
		}
		if(i<x)
			System.out.print("NO");
		else
			System.out.print("YES");
	} 
}	
