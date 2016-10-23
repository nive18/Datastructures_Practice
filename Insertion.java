package CLRS;
import java.util.*;
public class Insertion {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i;
	//Enter the size
	int n=sc.nextInt();
	//Getting the input
	int []array=new int[n];
	for(i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
	}
	//calling insert function
	insert1(array);
}
public static void printNumber(int[] array)
{ int i;
//Print the given numbers in 1,2,3 order and displays all the content
	for(i=0;i<array.length;i++)
	{
	System.out.println(array[i]+" , ");	
	}
	System.out.println("\n");
	
}
public static void insert1(int a[])
{
	int j,i,key;
	int n=a.length;
	for(i=1;i<n;i++)
	{
	key=a[i];//Assign second variable to be key
	j=i-1;//then initialize another variable
	while((j>=0)&&(a[j]>key))//compare
			{
		     a[j+1]=a[j];//set next variable to 1st variable
		     j-=1;//reinitialize variable j
			}
	a[j+1]=key;//Set next variable equal to key
	printNumber(a);//Call the print function
	}

}

}
