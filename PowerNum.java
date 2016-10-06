
import java.util.*;
import java.math.*;
public class PowerNum
{
public static void main(String args[])
{
int k,n;
Scanner sc=new Scanner(System.in);
k=sc.nextInt();
n=sc.nextInt();
int p=(int) Math.pow(k, n);
System.out.println("Power is"+p);
}
}