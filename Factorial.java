import java.util.*;
public class Factorial {
public static void main(String args[])
{
	int n,i;
	Scanner sc=new Scanner(System.in);
	int fact=1;
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	if(fact==0||fact==1)
	{
		System.out.println(fact);
	}
	else
	{
		System.out.println(fact);
	}
}
}
