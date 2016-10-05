#include<stdio.h>
int main()
{
	char str;
	scanf("%c",&str);
	if(str>='a'||str>='A'&&str<='z'||str<='Z')
	{
		printf("Alphabet");
	}
	else
	{
		printf("Not alphabet");
	}
	return 0;
}
