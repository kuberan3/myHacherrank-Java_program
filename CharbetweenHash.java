//Character Between Hash
import java.lang.*;
import java.util.Scanner;
class CharbetweenHash
{
	public static void main(String args[])
	{
		String s;
		int i,j,k;
		Scanner p=new Scanner(System.in);
		s=p.next();
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='#')
			{
				for(j=i+1;;j++)
				{
					if(s.charAt(j)=='#')
						break;
				}
				for(k=i+1;k<j;k++)
					System.out.print(s.charAt(k));
				i=j-1;
			}
		}
	}
}