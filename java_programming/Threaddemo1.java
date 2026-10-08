 class Threaddemo1 {

    public static void main(String[] args) 
    {
        System.out.println("inside main");

        Thread t = Thread.currentThread();


        System.out.println("current Thread name is :"+t.getName());

        System.out.println("current thread is TID is :"+t.getId());

        System.out.println("current thread alive or not :"+t.isAlive());

        System.out.println("thread priority is : "+t.getPriority());
    }
    
}
