#include <stdio.h>
#include <conio.h>
void main()
{
int n1,n2,n3,large;
printf("\n enter the firsr number");
scanf("%d",&n1);
printf("\n enter the second number");
scanf("%d",&n2);
printf("\n enter the third number");
scanf("%d",&n3);
large=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
printf("\n enter the large number is:%d",large);
getch();
}



