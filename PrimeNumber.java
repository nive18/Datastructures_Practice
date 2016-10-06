import java.util.*;
public class PrimeNumber {
public static void main(String args[])
{
	int n,k;
	boolean flag=false;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(k=2;k<n/2;k++)
	{
		if(n%k==0)
		{
			flag=true;
		}
	}
	if(flag==true)
	{
		System.out.println("Not prime no");
	}
	else
	{
		System.out.println("Prime no");
	}
}
}
