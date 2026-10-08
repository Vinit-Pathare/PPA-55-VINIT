#include <iostream>

using namespace std;

class ppa
{
    public:
       int no1;
       int no2;

       void Display()
       {
        cout<<"Inside Display\n";
       }




};

int main()
{

    ppa pobj;

    cout<<sizeof(pobj)<<"\n";

    return 0;
}