
package Enumeration.Multithreading_Synchronization;

//pg 431




enum Traffic_Light_Color
{
    RED,GREEN,YELLOW
}





//This class encapsulates the traffic light simulation

class Traffic_Light_Class implements Runnable
{
    private Traffic_Light_Color enum_Variable;
    private boolean stop = false;
    private boolean changed = false;

    Traffic_Light_Class(Traffic_Light_Color initial_Value) 
    {
        enum_Variable = initial_Value;
    }
    
    Traffic_Light_Class()
    {
        enum_Variable = Traffic_Light_Color.RED;
    }
    
    //Start the light
    public void run()
    {
        while (!stop)
        {
            try
            {
                switch(enum_Variable)
                {
                    case GREEN:
                        Thread.sleep(10000); //green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000); //yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(12000); //red for 12 seconds
                        break;
                }
            }
            catch (InterruptedException exc) { System.out.println(exc); }
            
            
            change_Color();
                                                
                       
        
        }
    }

    //change color
    synchronized void change_Color()
    {
        switch(enum_Variable)
        {
            case RED:
                enum_Variable = Traffic_Light_Color.GREEN;
                break;
            case YELLOW:
                enum_Variable = Traffic_Light_Color.RED;
                break;
            case GREEN:
                enum_Variable = Traffic_Light_Color.YELLOW;               
        }
        
        changed = true;
        notify();
    }
    
    
    //wait until a light change occurs
    
    synchronized void wait_For_Change()
    {
        try
        {
            while (!changed)
            {
                wait();
            }
            changed = false;            
        }
        catch (InterruptedException exc) { System.out.println(exc); }
        
    }
    
    
    
    
    //Return current color    
    synchronized Traffic_Light_Color get_Color() { return enum_Variable; }
    
    //Stop traffic light
    synchronized void cancel() { stop = true; }
        
 
}


class Traffic_Light 
{
    public static void main (String[] args)
    {
        Traffic_Light_Class object_1 = new Traffic_Light_Class(Traffic_Light_Color.GREEN);
        Thread thread = new Thread (object_1);
        
        thread.start();
        
        
        for (int i = 0; i < 9; i++)
        {
            System.out.println(object_1.get_Color());
            object_1.wait_For_Change();
        }
        
        object_1.cancel();
        
    }
}