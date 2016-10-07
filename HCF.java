import java.util.*;
public class HCF {
public static void main(String args[])
{
	int k,n,t;
	Scanner sc=new Scanner(System.in);
	k=sc.nextInt();
	n=sc.nextInt();
	while(k!=n)
	{
		if(k>n)
			k=k-n;
		else
			n=n-k;
	}
	System.out.println(k);
}
}
