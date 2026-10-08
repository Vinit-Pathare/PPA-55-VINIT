 import java.util.*;

  class  AgeInvalid extends Exception

  {
    public AgeInvalid(String str)
    {
        super(str);
    }
  }
 
    
 
 
 public class exceptiondemo4 
 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        int Age = 0;

        System.out.println("enter your age :");
        Age = sobj.nextInt();

        try
        {

        if (Age<18) {

            throw new AgeInvalid("you are under age");
            
        }
        else
        {
            System.out.println("welcome to");
        }
    }

        catch (AgeInvalid aobj)
        {
            System.out.println("exception occured due to age");
        }

       

    }
    
}
