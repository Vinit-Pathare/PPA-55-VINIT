abstract class base
{
    public int i,j;

  public   int addition(int no1,int no2)
    {
        return no1 + no2;
    }

  public abstract int Substraction (int no1,int no2);

}



class Derived extends base 
{
    public  int x;

       public   int Substraction(int no1,int no2)
    {
        return no1 - no2;
    }
     public  int Multiplication(int no1,int no2)
    {
        return no1 * no2;
    }
};


 class abstactdemo {
    public static void main(String[] args) {
        
    
    Derived dobj = new Derived();
    int Ret = 0;

    Ret = dobj.addition(11,10);
    System.out.println("addition is : "+Ret);


     Ret = dobj.Substraction(11,10);
     System.out.println("substraction is : "+Ret);


   

     Ret = dobj.Multiplication(11,10);
    System.out.println("Multiplication is : "+Ret);


    
    }
};