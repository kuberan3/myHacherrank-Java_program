import java.io.*;
import java.util.*;

public class CaseConversion {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
       int  n=A.length();
       int  m=B.length();
        
        System.out.println(n+m);
        if(A.charAt(0)>B.charAt(0))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        int i;
        char a[]=new char[n];
        char b[]=new char[m];
        a[0]=(char)(A.charAt(0)-32);
        b[0]=(char)(B.charAt(0)-32);
        for(i=1;i<n;i++)
        {
            a[i]=A.charAt(i);
        }
        for(i=1;i<m;i++)
        {
            b[i]=B.charAt(i);
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.print(" ");
        for(i=0;i<m;i++)
        {
            System.out.print(b[i]);
        }
        s.close();
    }
}
