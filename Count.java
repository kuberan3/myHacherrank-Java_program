import java.lang.*;
import java.util.Scanner;
class Count
{
public static void main(String[] args)
{
int n,rs5,rs2,rs1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
rs5=n/5;
rs2=(n%5)/2;
rs1=((n%5)%2)/1;
System.out.println("5RS coins is "+rs5);
System.out.println("2RS coins is "+rs2);
System.out.println("1RS coins is "+rs1);
}
}