
package Threads;



//pg 409
//synchronized methods allow us to use: 
//Using wait() and notify() allows us to control threads


//The order in which thread runs first is ALWAYS the first one you call
//even though it may seem like another thread will run first (not really true)
//see Synchronization_V2, search for line that reads  System.out.println(name);

class display_Text_Sequentially
{
    String state;
    
    synchronized void tick_Method(boolean running)
    {
        if (!running)               //STOPS THE CLOCK after 5 true
        {
            state = "ticked";
            notify();               //Notifies any threads
            return;
        }
        
        System.out.print("Tick ");
        
        state = "ticked";
        
        notify();                   //Lets TOCK run
        try
        {
            while (!state.equals("tocked"))
                wait();                                 //The call to wait causes this tick method to be suspended until ANOTHER thread calls notify()
                  
        }
        catch (InterruptedException exc ) { System.out.println("Thread interrupted"); }                
    }
    
    
    synchronized void tock_Method(boolean running)
    {
        if (!running)
        {
            state = "tocked";
            notify();
            return;
        }
        
        System.out.println("Tock");
        
        state = "tocked";
        
        notify();
        try
        {
            while (!state.equals("ticked"))
                wait();
                  
        }
        catch (InterruptedException exc ) { System.out.println("Thread interrupted"); }         
    }
    
    
    
}

class Thread_Class_Clock implements Runnable
{

    Thread thread_Variable;
    display_Text_Sequentially dis_txt_Obj;
    
    Thread_Class_Clock (String name, display_Text_Sequentially object)
    {
        thread_Variable = new Thread (this, name);
        dis_txt_Obj = object;
        
    }
    
    public static Thread_Class_Clock create_And_Start(String name, display_Text_Sequentially object)
    {
//        System.out.println(name);
        Thread_Class_Clock my_Thread = new Thread_Class_Clock(name,object);
        my_Thread.thread_Variable.start();
        return my_Thread;               
    }
    
   
    public void run()
    {
      
        //System.out.println("NAME OF THREAD: " +thread_Variable.getName() );
        if (thread_Variable.getName().compareTo("Tick") ==0)
        {
            for (int i = 0; i < 5; i++) { dis_txt_Obj.tick_Method(true); }
            
            dis_txt_Obj.tick_Method(false);
        }
        
        else 
        {
            for (int i = 0; i < 5; i++) { dis_txt_Obj.tock_Method(true); }
            dis_txt_Obj.tock_Method(false);
        }
    }
    
}

public class Synchronization_Methods        
{
    public static void main (String[] args)
    {
        display_Text_Sequentially object1 = new display_Text_Sequentially();
        Thread_Class_Clock thread1 = Thread_Class_Clock.create_And_Start("Tick", object1);
        Thread_Class_Clock thread2 = Thread_Class_Clock.create_And_Start("Tock", object1);
        
        try
        {
            thread1.thread_Variable.join();
            thread2.thread_Variable.join();
        }
        catch (InterruptedException exc) { System.out.println("Main thread interrupted"); }
    }
    
}
