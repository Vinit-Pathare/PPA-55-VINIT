
class base 
{

    
    int i,j;
    void fun()
    { System.out.println("base fun\n"); }   //1000

    void gun()
    { System.out.println("base gun\n"); }   //2000

     void  sun()
    {System.out.println("base sun\n"); }    //3000


     void  run()          //4000
    { System.out.println("base run\n"); }

} //16 bytes


class derived extends base
{
    
    int x;
    void fun()                      //address 5000
    { System.out.println("derived fun\n"); }

    void  sun()                     //6000
    { System.out.println("derived sun\n"); }

    void  mun()             //7000
    { System.out.println("derivrd mun\n"); }

     void  bun()                    //8000
    { System.out.println("derived  bun\n"); }



}//20 bytes


public class virtualdemo6
 {

    public static void main(String[] args)
     {

        base bp = new derived();

        
        
        bp.fun();
        bp.gun();
        bp.sun();
        bp.run();
        // bp.mun(); //error
        // bp.bun(); //error
    

        


        
    }
}