//The selection sort is a combination of searching and sorting.
//During each pass, the unsorted element with the smallest 
//(or largest) value is moved to its proper position in the array.
//The number of times the sort passes through the array is one less
//than the number of items in the array. In the selection sort, the
//inner loop finds the next smallest (or largest) value and the outer loop 
//places that value into its proper location.
package CLRS;
import java.util.*;
public class SelectionSort {
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		//Get the input
		n=sc.nextInt();
		//Get the elements of array
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		selectionsort(a);
	}
	public static void printSort(int[] input)
	{
		int i;
		int n=input.length;
		//Print the given input
		for(i=0;i<n;i++)
		{
			System.out.println(input[i]);
		}	
	}
	public static void selectionsort(int array[])
	{
		int n=array.length;
		int i,j,temp;
		int min;
		//First assign the min variable to element j
		for(i=0;i<n-1;i++)
		{
			min=i;
			//And make the sorting easier by using swapping function using temp variable
			for(j=i+1;j<n;j++)
			
				if(array[j]<array[min])
					min=j;
				temp=array[min];
				array[min]=array[i];
				array[i]=temp;
			
		}
		//call the print function
		printSort(array);
	}
	}