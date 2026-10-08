
  class Demo extends Thread  {

     public void run()
    {
        int i = 0;
        try
        {
        for(i=1;i<=10;i++)
        {

        
        System.out.println("Thread"+Thread.currentThread().getName()+""+i);
        Thread.sleep(3000);
    }
}
        catch(Exception eobj)
        {

        }
}
}

 
 
 class Threaddemo9 {

    


    public static void main(String[] args) throws Exception
    {
        System.out.println("inside main thread");

       

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first Thread");
       dobj2.setName("second Thread");


        dobj1.start();   
        dobj2.start();   

        dobj1.join();
        dobj2.join();

        System.out.println("end of main thread");  //

        
    }
    
}

    

 
    
