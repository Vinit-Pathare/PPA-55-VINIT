#include<iostream>
using namespace std;

#pragma pack(1)
class base 
{

    public:
    int i,j;
    void fun()
    { cout<<"base fun\n"; }   //1000

    void gun()
    { cout<<"base gun\n"; }   //2000

    virtual void  sun()
    { cout<<"base sun\n"; }    //3000


    virtual void  run()          //4000
    { cout<<"base run\n"; }

}; //16 bytes

#pragma pack(1)

class derived : public base
{
    public:
    int x;
    void fun()                      //address 5000
    { cout<<"derived fun\n"; }

    void  sun()                     //6000
    { cout<<"derived sun\n"; }

    virtual void  mun()             //7000
    { cout<<"derivrd mun\n"; }

     void  bun()                    //8000
    { cout<<"derived  bun\n"; }



};//20 bytes

int main()
{

    base *bp = new derived();

    
     
    bp->fun();
    bp->gun();
     bp->sun();
    bp->run();
     //bp->mun(); //error
    //bp->bun(); //error

    


    return 0;
}