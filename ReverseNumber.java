import java.util.*;
public class ReverseNumber {
public static void main(String args[])
{
	int n,r,d=0,k;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	while(n>0)
	{
		r=n%10;
		d=(d*10)+r;
		n=n/10;
	}
	
	{
		System.out.println("Reverse number"+d);
	}
}
}
