     
package Threads;



//If "Creating_Multiple_Threads.java" is in same package as this file, then you can create a Thread_Class object
// CTRL + CLICK on class = which file its from (click on Thread_Class to see which file)

 
//Using isAlive checks if a thread is still running
//Using join(); https://www.geeksforgeeks.org/joining-threads-in-java/



public class Checking_If_Thread_Has_Ended 
{
    public static void main (String[] args)
    {
//        using_IsAlive();
        using_Join();
        
    }
    
    
    
    
    //Method #1: Using isAlive();
    
    static void using_IsAlive()
    {
        System.out.println("MAIN THREAD STARTING");
        
        Thread_Class mt1 = Thread_Class.create_And_Start("Child #1");
        Thread_Class mt2 = Thread_Class.create_And_Start("Child #2");
        Thread_Class mt3 = Thread_Class.create_And_Start("Child #3");
        
        do
        {
            System.out.println(".");
            try { Thread.sleep(100); }
            catch (InterruptedException exc ) { System.out.println("Main thread interrupted"); }
        }
        while (mt1.thread_Variable.isAlive() || mt2.thread_Variable.isAlive() || mt3.thread_Variable.isAlive());        //As long as a single thread is still alive, keep the main thread alive using this do/while loop
                
        System.out.println("Main Thread ending");
        
    }
    
    
    
    
    
    
    //Method #2: join();
    
    static void using_Join()
    {
        System.out.println("Join: MAIN THREAD STARTING");
        
        Thread_Class mt1 = Thread_Class.create_And_Start("Child #1");
        Thread_Class mt2 = Thread_Class.create_And_Start("Child #2");
        Thread_Class mt3 = Thread_Class.create_And_Start("Child #3");
        
        
        try
        {
            mt1.thread_Variable.join();                                         //Join waits for the thread that you used it on to end
            
                                                                                //However, since all 3 threads were created/started at the same time,
                                                                                //this join waits for the mt1 to finish, and then prints out the next
                                                                                //line
                                                                                            
            System.out.println("Main thread has waited and at last, Child #1 has joined it. This means Child #1 is done");
            mt2.thread_Variable.join();
            System.out.println("Main thread has waited and at last, Child #2 has joined it. This means Child #2 is done");
            mt3.thread_Variable.join();
            System.out.println("Main thread has waited and at last, Child #3 has joined it. This means Child #3 is done");
        }    
        
        catch (InterruptedException exc ) { System.out.println("Main thread interrupted"); }
        
        System.out.println("Main Thread ending");
    }
}
