//String palandrome
import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        int i,n,j,q=0;
        name=s.next();
        n=name.length();
        char a[]=new char[n];
        for(i=0;i<n;i++)
        {
            a[i]=name.charAt(i);
        }
	for(i=0,j=n-1;i<n/2;i++,j--)
        {
            if(a[i]!=a[j])
            {
               break;
            }    
        }
        if(i<n/2)
        {
            System.out.print("No");
        }
        else
        {
            System.out.println("Yes");
	}
	}
}