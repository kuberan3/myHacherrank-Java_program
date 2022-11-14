//check the alphabet
import java.lang.*;
import java.util.Scanner;
class checkAlphabet
{
	public static void main(String args[])
	{
		String word;
		int x,i;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		word=s.next();
		for(i=0;i<word.length();i++)
		{
			if(word.charAt(i)==x+96)
			{
				break;
			}
		}
		if(i<word.length())
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
