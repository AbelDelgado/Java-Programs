
package Threads;

//This program has 2 threads running, but only 1 thread can use total_sum()


//V1: assumes you created/have direct access to the method that will be synced


//Access to all objects in Java are controlled by MONITORS
//MONITORS uses lOcK: when an object is lOcKeD by a thread, no other thread can access it until thread ends


//When it's used:
//When 1 thread is writing to a file, you cannot let another thread write to it at the same time
//If one thread is waiting for the result of another thread, it should wait






class Sum_Array
{
    private int sum;
    
    //synchronized: Once a thread uses this, it becomes lOcKeD; only 1 thread can use this at any given time!!
    //if another thread tries to use this while it's locked, it enters a waiting state
    synchronized int total_Sum (int nums[])                  
    {
        sum = 0;
        for (int i = 0; i < nums.length;i++)
        {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is: " +sum);
            try { Thread.sleep(10); }                                                                       //If this method was NOT synchronizable, then the moment thread 1 went to sleep, thread 2 could have started here
            catch (InterruptedException exc) { System.out.println("Thread Interrupted"); }
        }
        
        return sum;
    }        
}



class Thread_Class_Sync implements Runnable
{
    Thread thread_Variable;
    
    static Sum_Array sum_Array_Obj = new Sum_Array();
    int a[];
    int answer;
    
    
    
    //Constructor
    Thread_Class_Sync (String name, int nums[])
    {
        thread_Variable = new Thread (this,name);     //this means that I want to create an object from the current class (Thread_Class) 
                                                     //Instead of making an object and then referecing it here, just use THIS
        
        
        //Thread td = new Thread ( Object created from a class that implements Runnable, Thread Name)
        
        //This was used in Creating_Threads_V1:
        //Thread td = new Thread( Object created from a class that implements Runnable)  
        
       a = nums;
    }
    
    
    
    //FACTORY METHOD??
    //pg 388 - Lets you make an object, set its state (start it), and return it
    public static Thread_Class_Sync create_And_Start(String name, int nums[])
    {
        Thread_Class_Sync my_Thread = new Thread_Class_Sync(name, nums);
        
        my_Thread.thread_Variable.start();               //once my_Thread obj is created, a thread is made. WE can access it like a variable. Remember, using start -> run();
        
        return my_Thread;                        
    }
    
                    
    
    
    
    
    public void run()           //Since this class implements Runnable, and Runnable ENFOURCES you to create this run method
    {
        int sum;
        System.out.println(thread_Variable.getName() + " starting!");
                
        answer = sum_Array_Obj.total_Sum(a);
        System.out.println("Sum for " + thread_Variable.getName() + " is " +answer);
        
        System.out.println(thread_Variable.getName() + " is done and has now stopped");            //Whenever a thread returns from its run() method, it ENDS
    }
    
}






class Synchronization_V1
{
    public static void main (String[] args)
    {
        int a[] = {1,2,3,4,5};
        
        Thread_Class_Sync mt1 = Thread_Class_Sync.create_And_Start("Child #1", a);
        Thread_Class_Sync mt2 = Thread_Class_Sync.create_And_Start("Child #2", a);
       
        try
        {
            mt1.thread_Variable.join();
            mt2.thread_Variable.join();
        }
        catch (InterruptedException exc ) { System.out.println("Main threa interrupted"); }   
    }
}
