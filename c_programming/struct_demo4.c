#include<stdio.h>
#pragma pack(1)

struct Demo{

    int i;
    char ch;
    float f;
    double d;
};

 int main()
 {
    struct Demo dobj1;
    struct Demo  dobj2;

    struct Demo *dp = NULL;

    dp = &dobj2;
    
// dirrect accesing operator
    dobj1.i = 11;    //object
    dobj1.ch = 'A';
    dobj1.f = 90.99f;


    //in direct accesing operator
    dp->i = 21;    //pointer
    dp->ch = 'B';
    dp->f = 90.99;

    printf("%d\n",dobj1.i);
    printf("%d\n",dp->i);

      
    return 0;
 }
