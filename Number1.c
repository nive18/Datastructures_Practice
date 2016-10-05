#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	if(n>0)
	{
		printf("Positive number");
	}
	else if(n<0)
	{
		printf("Negative number");
	}
	else
	{
		printf("It is zero");
	}
	return 0;
}
