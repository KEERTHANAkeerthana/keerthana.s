#include <stdio.h>
#include <conio.h>

int main()
{
    int num;
    printf("\n enter any number:");
    scanf("%d",&num);
    if(num==0)
        printf("\n the value is equal to zero");
    else if(num>0)
        printf("\n the number is positive");
    else if (num<0)
        printf("\n the number is negative");
    return 0;
    }
