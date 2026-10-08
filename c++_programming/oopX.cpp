#include<iostream>

using namespace std;

class Arithematic
{
    public:         
        int no1;
        int no2;

        Arithematic()
        {
            no1 = 0;
            no2 = 0;

        }

        Arithematic(int i, int j)
        {
            no1 = i;
            no2 = j;
        }

        int Addition()
        {
            int Ans = 0;
            Ans = no1 + no2;
            return Ans;
        }


};

int main()
{

    Arithematic aobj1(10,11);

    int Result = 0;

    Result = aobj1.Addition();

    cout<<"Addition is : "<<Result<<"\n";
    

   

    return 0;
}