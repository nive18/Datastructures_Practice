import java.util.*;
public class Armstrong {
public static void main(String args[])
{
	int n,r,d=0,k;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	k=n;
	while(n>0)
	{
		r=n%10;
		d=d+r*r*r;
		n=n/10;
	}
	if(k==d)
	{
	System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("No armstrong number");
	}
}
}
