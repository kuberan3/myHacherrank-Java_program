import java.lang.*;
import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter a and b:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println(c);
	}
}