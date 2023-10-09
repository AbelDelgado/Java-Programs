

package Threads;


//Thread priority = potential CPU access
//the higher the priority = MORE potential cpu access
//Circumstantial, as low priority threads can run while High priority is waiting


class Thread_Priority implements Runnable
{
    int count; 
    Thread thread_Variable;
    
    static boolean stop = false;
    static String currentName;

    Thread_Priority(String name) 
    {
        thread_Variable = new Thread (this, name);
        count = 0;
        currentName = name;
    }
    
    public void run() 
    {
        System.out.println(thread_Variable.getName() + " starting");
        do
        {
            count++;
            
            if (currentName.compareTo(thread_Variable.getName()) != 0)
            {
                currentName = thread_Variable.getName();
                System.out.println("In " + currentName);
            }
        }
        while (stop == false && count < 10000000);
        
        stop = true;
        System.out.println("\n" + thread_Variable.getName() + " ending");
    }
    
    
            
}

class Thread_Priority_Demo
{
    public static void main (String[] args)
    {
        Thread_Priority mt1 = new Thread_Priority ("HIGH");
        Thread_Priority mt2 = new Thread_Priority ("Low");
        Thread_Priority mt3 = new Thread_Priority ("Normal #1");
        Thread_Priority mt4 = new Thread_Priority ("Normal #2");
        Thread_Priority mt5 = new Thread_Priority ("Normal #3");
        
        
        //default priority = 5, MAX = 10, MIN = 1
        mt1.thread_Variable.setPriority(Thread.NORM_PRIORITY+2);        
        mt2.thread_Variable.setPriority(Thread.NORM_PRIORITY-2);        
   
        //leave mt3,mt4,mt5 as normal priority
        
        mt1.thread_Variable.start();
        mt2.thread_Variable.start();
        mt3.thread_Variable.start();
        mt4.thread_Variable.start();
        mt5.thread_Variable.start();
        
        try
        {
            mt1.thread_Variable.join();
            mt2.thread_Variable.join();
            mt3.thread_Variable.join();
            mt4.thread_Variable.join();
            mt5.thread_Variable.join();
        }
        catch (InterruptedException exc) { System.out.println("Main thread interrupted"); }
            
        System.out.println("\nHigh Priority thread counted to " + mt1.count);
        System.out.println("\nLow Priority thread counted to " + mt2.count);
        System.out.println("\nNormal #1 Priority thread counted to " + mt3.count);
        System.out.println("\nNormal #2 Priority thread counted to " + mt4.count);
        System.out.println("\nNormal #3 Priority thread counted to " + mt5.count);
        
        
        
    }
}
