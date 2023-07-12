
package Using_Static;

//To access a method or variable WITHOUT having to make an object for it, use static  

class static_Memebers
{
    static int TIMER = 0;
    static void say_Hello(){ System.out.println("HELLO"); }                        
}


public class using_Static 
{    
    public static void main (String[] args)
    {
        System.out.println(static_Memebers.TIMER);
        static_Memebers.say_Hello();               
    }  
}
