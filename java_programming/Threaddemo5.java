
  class Demo implements Runnable  {

    public void  run()
    {
        System.out.println("thread is running....");
    }
 
    
 }
 
 
 class Threaddemo5 {

    


    public static void main(String[] args) 
    {
        System.out.println("inside main thread");

       Thread dobj1 = new Thread(new Demo());
       Thread dobj2 = new Thread(new Demo());


        dobj1.start();   
        dobj2.start();   

        System.out.println("end of main thread");  //issue

        
    }
    
}

    

 
    
