import java.util.*;
public class OddNum {
public static void main(String args[])
{
	int i,k,l;
    Scanner sc=new Scanner(System.in);
    
    k=sc.nextInt();
    l=sc.nextInt();
    for(i=k;i<l;i++)
    {
    	if(i%2!=0)
    	{
        	System.out.println(i);
    	}
    	
    }
    
}
}
