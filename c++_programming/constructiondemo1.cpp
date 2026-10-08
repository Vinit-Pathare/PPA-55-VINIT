#include <iostream>

using namespace std;

class ppa
{
    public:
       int no1;
       int no2;

       // default constructor

       ppa()
       {
        cout<<"inside default constructor\n";
       }

       ~ppa()
       {
        cout<<"inside destructor\n";
       }
       
        
       

};

int main()
{

    ppa pobj1;
    ppa pobj2;
    


     return 0;
}