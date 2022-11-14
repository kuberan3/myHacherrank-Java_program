//check all vowels
import java.lang.*;
import java.util.Scanner;
class CheckVowels
{	
	public static void main(String args[])
	{
		String word;
		int i,count1=0,count2=0,count3=0,count4=0,count5=0;
		Scanner s=new Scanner(System.in);
		word=s.next();
		for(i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a')
				count1++;
			else if(word.charAt(i)=='e')
				count2++;
			else if(word.charAt(i)=='i')
				count3++;
			else if(word.charAt(i)=='o')
				count4++;
			else if(word.charAt(i)=='u')
				count5++;
		}
		if(count1>=1 && count2>=1 && count3>=1 && count4>=1 && count5>=1)
			System.out.print("Yes");
		else	
			System.out.print("No");
	}
}