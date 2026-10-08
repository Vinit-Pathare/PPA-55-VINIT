#include<stdio.h>

int main()
{
    int Arr[]={10,20,30,40};
    int *P = &(Arr[1]);
    int *q = &(Arr[3]);

    printf("%d\n",P);
    printf("%d\n",q);

    printf("%d\n",P+2);
    printf("%d\n",q-2);
    printf("%d\n",q-P);

    return 0;


}