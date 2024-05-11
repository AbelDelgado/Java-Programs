package Part_7_Error_Throws;

import java.io.IOException;



public class Method_Throwing 
{
    
    public static char prompt () throws IOException           //If an IO exception occurs, main will have to handle it
    {
        System.out.println("Enter char: ");
        return (char) System.in.read();
    }




    public static void main (String [] args)
    {
        try
        {
            prompt();
        }
        catch (java.io.IOException exc)                     //If I didn't import import java.io.IOException;, I would have to call it like this
        {
            System.out.println("cannot enter this char");
        }
       
       
    }
    
    
    
    
    
    
    void test() throws ArrayIndexOutOfBoundsException
    {
        
    }
    
}
