//floyds Triangle
/*  1
    2 3
	4 5 6  */
import java.lang.*;
import java.util.Scanner;
class Floyds
{
	public static void main(String args[])
	{
		int row,k=1;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println();
		}
	}
}