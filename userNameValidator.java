import java.io.*;
import java.util.*;

public class NameValidator {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int n,i,j;
         n=s.nextInt();
         String a[]=new String[n];
         for(i=0;i<n;i++)
         {
             a[i]=s.next();
         }
         for(i=0;i<n;i++)
         {      
             for(j=0;j<a[i].length();j++)
             {  if(a[i].length()<8)
                {
                    break;
                }
                if(j==0)
                {
                     if(!((a[i].charAt(0)>=65 && a[i].charAt(0)<=90) ||  (a[i].charAt(0)>=97 && a[i].charAt(0)<=122)))
                     {
                         break;
                     }
                 }
                 
                     if(!((a[i].charAt(j)>=97 && a[i].charAt(j)<=122) || (a[i].charAt(j)>=65 && a[i].charAt(j)<=90) || (a[i].charAt(j)>=48 && a[i].charAt(j)<=57) || (a[i].charAt(j)=='_')))
                     {
                         break;
                     }
                 
             }if(j<a[i].length())
             {
                System.out.println("Invalid");
             
             }
             else
             {
                 System.out.println("Valid");
             }
         }
         
    }
}
