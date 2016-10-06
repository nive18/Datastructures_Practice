import java.util.*;
public class Multiplicationtable {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,k;
	n=sc.nextInt();
	for(i=1;i<n;i++)
	{
		k=n*i;
		System.out.println(k);
	}
		
}
}
