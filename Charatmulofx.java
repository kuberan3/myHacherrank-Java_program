//character at multiples of x - reverse
import java.lang.*;
import java.util.Scanner;
class Charatmulofx
{	
	public static void main(String args[])
	{
		String word;
		int x,i;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		word=s.next();
		for(i=word.length()-1;i>=0;i--)
		{
			if((i+1)%x==0)
			{
				System.out.print(word.charAt(i));
			}
		}
	}
}