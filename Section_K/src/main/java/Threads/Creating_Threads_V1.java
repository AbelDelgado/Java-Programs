       
package Threads;


//creates a thread, then uses seperate method to start it

//To create a thread:
//1. Create a class that implements the interface: Runnable
//    -runnable NEEDS a run method, which is when the thread will start
//2. Create object from the class you just made (that uses the Runnable interface) in the MAIN THREAD (the main method)
//3. Use that new object to create thread using Thread class
//4. Start thread using start();


  
//The main thread runs at the same time as the newly created thread
//Its good practice for the MAIN thread to end lastw (hence why new thread has less sleep time overall than main)




//Objects of Thread_Class can be used to create new threads (as shown in main)
class Thread_Class implements Runnable
{
    String threadName;
    
    Thread_Class (String name)
    {
        threadName = name;
    }
    
    public void run()           //Since this class implements Runnable, and Runnable ENFOURCES you to create this run method
    {
        System.out.println(threadName + " starting!");
        try
        {
            for (int count = 0; count < 10; count++)
            {
                Thread.sleep(400); 
                System.out.println("In " + threadName + ", count is: " +count);
            }
            
        }
        catch (InterruptedException exc) { System.out.println(threadName +" interuppted");
        
        }
        
        System.out.println(threadName + " is done and has now stopped");            //Whenever a thread returns from its run() method, it ENDS
    }
    
}









public class Creating_Threads_V1 
{    
    public static void main (String[] args)
    {
        System.out.println("Main thread starting!");                                        //All this time, whenever your program starts == the MAIN THREAD would start
        
        //Construct Thread_Creation_Method object; used to MAKE threads, but isn't one
        Thread_Class mt = new Thread_Class("Child #1");
        
        //Make thread using Thread_Creation_Method
        Thread newThread = new Thread(mt);
        
        //START THREAD
        newThread.start();
        
        for (int i = 0; i < 50; i++)
        {
            System.out.println("In main thread");
            try {   Thread.sleep(100);  }
            catch(InterruptedException exc) { System.out.println("Main thread interuppted"); }
        }
        System.out.println("Main thread ending");
        
        
    }
}
