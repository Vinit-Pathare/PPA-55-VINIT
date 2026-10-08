#include<stdio.h>

struct Demo{

    int i;  //4 bytes
    char ch; //1 byts
    float f;  //4 bytes
    double d; //8 bytes
};

 int main()
 {
    printf("%d\n",sizeof(struct Demo));
     
      
    return 0;
 }
