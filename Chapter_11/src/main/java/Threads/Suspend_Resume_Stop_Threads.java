
package Threads;

//pg 414
//Loops through run while checking to see if a state has been switched
//states are switched manually in main



class Thread_Control implements Runnable
{
    Thread thread_Variable;
    boolean suspended;
    boolean stopped;
    
    Thread_Control (String name)
    {
        thread_Variable = new Thread (this,name);
        suspended = false;
        stopped = false;
                
    }
    
    
    public static Thread_Control createAndStart (String name)
    {
        Thread_Control thread_Object = new Thread_Control (name);
        
        thread_Object.thread_Variable.start();
        return thread_Object;        
    }
    
    
    public void run()
    {
        System.out.println(thread_Variable.getName() + "starting");
        try
        {
            for (int i = 1; i < 200; i++)
            {
                System.out.println(i+ " ");
                if ((i%10)==0)
                {
                    System.out.println();
                    Thread.sleep(250);
                    
                    synchronized (this)                                         //SYNCHRONIZED block 
                    {
                        while (suspended) { wait(); }
                            
                        if (stopped) { break;}
                    }
                }
            }
        }
        
        catch (InterruptedException exc) { System.out.println(thread_Variable.getName() + " interrupted"); }
        
        System.out.println(thread_Variable.getName() + " exiting");
    }
    
    
    
    //Stop thread
    synchronized void mystop()
    {
        stopped = true;
        
        
        
        //This makes sure that a suspended thread can be stopped
        suspended = false;
        notify();
                
    }
    
    //suspend thread
    synchronized void mysuspend()
    {
        suspended = true;
    }
    
    
    //resume thread
    synchronized void myresume()
    {
        suspended = false;
        notify();
    }

    
}

class Suspend_Resume_Stop_Threads 
{
    public static void main (String[] args)
    {
       Thread_Control mt1 = Thread_Control.createAndStart("My thread");
       
       try 
       {
           Thread.sleep(1000);
           
           mt1.mysuspend();
           System.out.println("suspending thread");
           Thread.sleep(1000);
           
           mt1.myresume();
           System.out.println("Resuming thread");
           Thread.sleep(1000);
           
           mt1.mysuspend();
           System.out.println("suspending thread");
           Thread.sleep(1000);
           
           mt1.myresume();
           System.out.println("Resuming thread");
           Thread.sleep(1000);
           
           mt1.mysuspend();
           System.out.println("stopping thread");
           mt1.mystop();
           
       }
       catch (InterruptedException exc ) { System.out.println("Main Thread Interrupted"); }
       
       try
       {
           mt1.thread_Variable.join();
           
       }
       catch (InterruptedException exc ) { System.out.println("Main Thread Interrupted"); }
       
       System.out.println("Main thread exiting");   
    }
    
}
    

