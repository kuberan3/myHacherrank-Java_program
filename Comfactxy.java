//common factors of x and y
import java.lang.*;
import java.util.Scanner;
class Comfactxy
{
	public static void main(String args[])
	{
		int x,y,min;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		if(x<y)
			min=x;
		else
			min=y;
		for(int i=1;i<=min;i++)
		{
			if(x%i==0 && y%i==0)
				System.out.println(i);
		}
	}
}