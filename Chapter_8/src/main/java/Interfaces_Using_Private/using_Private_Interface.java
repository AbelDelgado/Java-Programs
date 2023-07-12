
package Interfaces_Using_Private;



//Nothing to show here; check private interface


public class using_Private_Interface implements private_Interface
{
    public static void main (String[] args)
    {
        private_Interface.static_Method();
        
        
        
        
        
        
        
        
        
        
        
        using_Private_Interface obj1 = new using_Private_Interface();    
        obj1.show_Number();                                             //How to call a default method (1. make object that implements the interface its made in   2. use that object to call the default method
       
    }
  
    
}
