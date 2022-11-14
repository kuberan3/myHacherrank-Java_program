import java.lang.*;
import java.util.Scanner;
class Consecutiveoddeven
{
	public static void main(String args[])
	{	
		int n,i,j,k,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[10];
		temp=n;
		while(temp!=0)
		{
			if(((temp%10)%2==0 && (temp/10)%2!=0) || ((temp%10)%2!=0 && (temp/10)%2==0))
			{
				temp=temp/10;
				break;
			}
			else 
			{
				temp=temp/10;
				continue;
			}
		}
		System.out.print(temp);
	}
}