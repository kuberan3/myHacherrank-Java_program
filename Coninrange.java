//count Consonants in range
import java.lang.*;
import java.util.Scanner;
class Coninrange
{
	public static void main(String args[])
	{
		char ch1,ch2;
		int i,count=0;
		Scanner p=new Scanner(System.in);
		ch1=p.next().charAt(0);
		ch2=p.next().charAt(0);
		for(i=96+(int)ch1;i<=96+(int)ch2;i++)
		{
			if((char)i!='a' && (char)i!='e' && (char)i!='i' && (char)i!='o' && (char)i!='u')
				count++;
		}
		System.out.print(count);
	}
}