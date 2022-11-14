import java.lang.*;
import java.util.Scanner;
class BinaryofBinary1
{
	static int a[]=new int[20];
	public static void main(String args[])
	{
		int n,rev=0,x,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		BinaryofBinary1 b=new BinaryofBinary1();
		x=b.binary(n);
		for(j=x-1;j>=0;j--)
		{
			rev=rev*10+a[j];
		}
		x=b.binary(rev);
		for(j=x-1;j>=0;j--)
			System.out.print(a[j]);
	}
	int binary(int m)
	{
		int i;
		i=0;
		while(m!=0)
		{	
			a[i]=m%2;
			m=m/2;
			i++;
		}
		return i;
	}
}