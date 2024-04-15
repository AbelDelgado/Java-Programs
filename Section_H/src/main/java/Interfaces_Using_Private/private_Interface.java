
package Interfaces_Using_Private;



//Using private inside interface is RARE
//use PRIVATE methods/variables only when you're going to use them inside this interface and NO WHERE ELSE

public interface private_Interface 
{
    //This method is only used HERE
    private int return_Number()
    {
        return 1;
    }
    
    
    
    
    
    
    
    default void show_Number()
    {
        System.out.println(return_Number());        
    }
    
   
    
    static void static_Method()
    {
        System.out.println("STATIC");
    }
    
}
