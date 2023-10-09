     
package Threads;

  
//V2: improvment on Creating_Threads_V1
// combines thread creation + start in single line



  

class Thread_Class implements Runnable
{
    Thread thread_Variable;
    
    
    //Constructor
    Thread_Class (String name)
    {
        thread_Variable = new Thread (this,name);     //this means that I want to create an object from the current class (Thread_Class) 
                                                     //Instead of making an object and then referecing it here, just use THIS
        
        
        //Thread td = new Thread ( Object created from a class that implements Runnable, Thread Name)
        
        //This was used in Creating_Threads_V1:
        //Thread td = new Thread( Object created from a class that implements Runnable)  
        
       
    }
    
    //FACTORY METHOD??
    //pg 388 - Lets you make an object, set its state (start it), and return it
    public static Thread_Class create_And_Start(String name)
    {
        Thread_Class my_Thread = new Thread_Class(name);
        
        my_Thread.thread_Variable.start();               //once my_Thread obj is created, a thread is made. WE can access it like a variable. Remember, using start -> run();
        
        return my_Thread;                        
    }
    
                    
    
    
    
    
    public void run()           //Since this class implements Runnable, and Runnable ENFOURCES you to create this run method
    {
        System.out.println(thread_Variable.getName() + " starting!");
        try
        {
            for (int count = 0; count < 10; count++)
            {
                Thread.sleep(400); 
                System.out.println("In " + thread_Variable.getName() + ", count is: " +count);
            }
            
        }
        catch (InterruptedException exc) { System.out.println(thread_Variable.getName() +" interuppted");
        
        }
        
        System.out.println(thread_Variable.getName() + " is done and has now stopped");            //Whenever a thread returns from its run() method, it ENDS
    }
    
}


public class Creating_Threads_V2 
{
    public static void main (String[] args)
    {
        System.out.println("Main thread starting!");                                        //All this time, whenever your program starts == the MAIN THREAD would start
        
        //The line creates, names, and runs a thread
        Thread_Class mt = Thread_Class.create_And_Start("CHILD #1");
        
        
        for (int i = 0; i < 50; i++)
        {
            System.out.println("In main thread");
            try {   Thread.sleep(100);  }
            catch(InterruptedException exc) { System.out.println("Main thread interuppted"); }
        }
        System.out.println("Main thread ending");
        
        
    }
    
}
