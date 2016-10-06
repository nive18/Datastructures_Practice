import java.util.*;
public class PrimeInterval {
public static void main(String args[])
{
	int i,k,l,m,flag=0;
	Scanner sc=new Scanner(System.in);
	l=sc.nextInt();
	m=sc.nextInt();
	for(i=l;i<m;i++)
	{
		for(k=2;k<i;k++)
		{
			if(i%k==0)
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
			if(flag==1)
			{
			  System.out.println(i);
			}
		}
	}
}
}
