//binary of binary
import java.lang.*;
import java.util.Scanner;
class Binaryofbinary
{
	static int a[]=new int[20];
	int binary(int m)
	{
		int temp,i=0;
		temp=m;
		while(temp!=0)
		{
			a[i]=temp%2;
			temp=temp/2;
			i++;
		}
		return i;
	}
	public static void main(String args[])
	{	
		int n,i,rev=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Binaryofbinary b=new Binaryofbinary();
		i=b.binary(n);
		for(int j=i-1;j>=0;j--) 
		{
			rev=rev*10+a[j];
		}
		i=b.binary(rev);
		for(int j=i-1;j>=0;j--)
			System.out.print(a[j]);
	}
}