package CLRS;
import java.util.*;
public class BubbleSort {
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
   //Getting size
	int n=sc.nextInt();
	//	//Getting input
	int []input=new int[n];
	int i;
	
	for(i=0;i<n;i++)
	{
		input[i]=sc.nextInt();
	}
	bubblesort(input);
}
public static void print1(int[] array)
{
	int i;
	int n=array.length;
	for(i=0;i<n;i++)
	{
		//Printing function
		System.out.println(array[i]+",");
	}
	System.out.println("\n");
}
public static void bubblesort(int array[])
{
	int i,j,t;
	int n=array.length;
	for(i=0;i<n;i++)
	{
		//Sorting according to ascending order
		for(j=i+1;j<n;j++)
		{
			if(array[i]>array[j])
			{
				t=array[i];
			    array[i]=array[j];
				array[j]=t;
			}
			
			
		}
		
	}
	//Calling print function
	print1(array);
}

}
