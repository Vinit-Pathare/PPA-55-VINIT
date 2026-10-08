 import java.util.*;
 
 class Exceptiondemo1XX {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        int no1 = 0, no2 = 0, ans = 0;

        try
        {
        

        System.out.println("enter first number :");
        no1 = sobj.nextInt();

        System.out.println("enter second number :");
        no2 = sobj.nextInt();

        ans = no1/no2;  //exception prone code
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("exception occured :"+aobj);
        }

        catch(Exception aobj)
        {
            System.out.println("inside generic catch");
        }

        finally
        {
            System.out.println("inside finally block");
        }

        System.out.println("division is : "+ans);
        
    }
    
}
