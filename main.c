#include <stdio.h>
#include <conio.h>
void main()
{
int year;
    printf("\n enter the year");
    scanf("%d",&year);
    if(year%4==0&&year%100!=10&&year%400!=0)
    {
    printf("\n the year is leap year");
    }
    else
    {
    printf("\n the year is not leap");
    }
getch();
}

