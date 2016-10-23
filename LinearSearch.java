package CLRS;
import java.util.*;
public class LinearSearch {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	//Enter the size
	int n=sc.nextInt();
	//Enter the array elements
	int array[]=new int[n];
		int i;
	for(i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
	}
	//Enter the elements to search
	System.out.println("Enter the element to find");
	int v=sc.nextInt();

	search(array,v);
}
public static void search(int a[], int x)
{
	int i,n,key=0;
	n=a.length;
	for(i=0;i<n;i++)
	{
		//If x element equal to array element i
		if(x==a[i])
		{//set key to 1 so that it choose only for the value it sets
			key=1;
		}
	}
	//If found then it gives element found
	if(key==1)
	{
		System.out.println("Element found");
	}
	//Else return false
	else
	{
		System.out.println("Element not found");
	}
}
}
