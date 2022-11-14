import java.lang.*;
import java.util.Scanner;
class Disconbook
{
	public static void main(String args[])
	{
		int x,y,amt;
		System.out.println("Enter x,y:");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		if(x>=2 && x<=4)
		{
			amt=(x*y)-((x*y)*10)/100;
			System.out.println("Amount is "+amt);
		}
		else if(x==5)
		{
			amt=(x*y)-((x*y)*20)/100;
			System.out.println("Amount is "+amt);
		}
		else if(x>5)
		{
			amt=(x*y)-((x*y)*50)/100;
			System.out.println("Amount is "+amt);
		}
		else
		{
			System.out.println("Amount is "+x*y);
		}
	}
}