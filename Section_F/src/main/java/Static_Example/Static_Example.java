
package Static_Example;

class static_Memebers
{
    static int TIMER = 0;
    static void say_Hello(){ System.out.println("HELLO"); }                        
}

public class Static_Example 
{
    public static void main (String[] args)
    {
        System.out.println(static_Memebers.TIMER);
        static_Memebers.say_Hello();               
    }  
    
}
