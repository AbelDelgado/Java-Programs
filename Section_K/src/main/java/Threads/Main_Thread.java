
package Threads;



//Main works like a normal thread



public class Main_Thread 
{
    public static void main (String [] args)
    {
        Thread thread_Variable;
        
        thread_Variable = Thread.currentThread();
        
        
        
        //WARNING: DO NOT USE join() in MAIN, as the program will NEVER TERMINATE
        /*
        try
        {
            thread_Variable.join();
        
        }
        catch (InterruptedException exc) { System.out.println("MAIN thread interrupted"); }
        */
        
        
        
        
        System.out.println("Main thread is called: " +thread_Variable.getName());
        
        System.out.println("Thread's Priority: " +thread_Variable.getPriority());
        
        System.out.println("");
        
        System.out.println("Setting name and priority");
        
        thread_Variable.setName("Thread 1");
        thread_Variable.setPriority(Thread.NORM_PRIORITY+3);
        
        System.out.println("Main thread is now: " +thread_Variable.getName());
        System.out.println("Thread's Priority is now: " +thread_Variable.getPriority());
        
        System.out.println("");
        //The thread that uses method_1 is still the main thread
        method_1();
        
                
    }
    
    
    static void method_1()
    {
        Thread thread_Variable2;
        
        thread_Variable2 = Thread.currentThread();
        System.out.println("Method thread is called: " +thread_Variable2.getName());
        
        System.out.println("Thread's Priority: " +thread_Variable2.getPriority());
    }
    
    
}
