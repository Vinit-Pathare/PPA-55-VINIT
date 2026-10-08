
  class Demo implements Runnable  {

    public void run()
    {
        System.out.println("thread is running....");
    }
}

 
 
 class Threaddemo7 {

    


    public static void main(String[] args) throws Exception
    {
        System.out.println("inside main thread"+Thread.currentThread().getName());

       Thread dobj1 = new Thread(first Thread());
       Thread dobj2 = new Thread(second Thread());

       dobj1.setName("first Thread");
       dobj2.setName("second Thread");


        dobj1.start();  
        dobj2.start();   

        dobj1.join();
        dobj2.join();

        System.out.println("end of main thread");  //

        
    }
    
}

    

 
    
