//count special characters
import java.lang.*;
import java.util.Scanner;
class Countsplchar
{
	public static void main(String args[])
	{
		String s;
		int count=0,i;
		Scanner p=new Scanner(System.in);
		s=p.next();
		for(i=0;i<s.length();i++)
		{	
			if(!((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=48 && s.charAt(i)<=57)))
				count++;
		}
		System.out.print(count);
	}
}