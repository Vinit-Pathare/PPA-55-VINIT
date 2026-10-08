#include<stdio.h>

void Addition(int no1, int no2)
{
    int Result = 0;
    Result = no1 + no2;  // bussiness logic
    printf("Addition is : %d\n",Result);
}


int main()
{
    int Value1 = 0, Value2 = 0;

    printf("Enter first number : \n");
    scanf("%d",&Value1);

    printf("Enter second number : \n");
    scanf("%d",&Value2);

    Addition(Value1,Value2);   

    

    
}