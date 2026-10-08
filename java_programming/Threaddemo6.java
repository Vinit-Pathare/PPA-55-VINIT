
  class Demo implements Runnable  {

     public void run()
    {
        System.out.println("thread is running....");
    }
}

 
 
 class Threaddemo6 {

    


    public static void main(String[] args) throws Exception
    {
        System.out.println("inside main thread");

       Thread dobj1 = new Thread(new Demo());
       Thread dobj2 = new Thread(new Demo());


        dobj1.start();   
        dobj2.start();   

        dobj1.join();
        dobj2.join();

        System.out.println("end of main thread");  //

        
    }
    
}

    

 
    
