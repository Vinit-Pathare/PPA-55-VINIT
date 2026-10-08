import java.util.Scanner;
class addition 
 {
   

   public static void main(String A[]) 
   {

    Scanner sobj = new Scanner(System.in);

    int no1 = 0, no2 = 0, ans = 0;
    // int no1 , no2 , ans ;

    System.out.println("enter first number");
    no1 = sobj.nextInt();

    System.out.println("enter second number");
    no2 = sobj.nextInt();

    ans = no1 + no2;

    System.out.println("addition is :"+ ans);



   }
      
   }

