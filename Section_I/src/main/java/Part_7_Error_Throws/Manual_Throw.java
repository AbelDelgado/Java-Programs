
package Part_7_Error_Throws;



public class Manual_Throw 
{
    public static void main (String[] args)
    {
        try{ 
            System.out.println("Before throw");
            throw new ArithmeticException();                    //Throw the error yourself!
            
        }
            
        catch (ArithmeticException exc)
        {
            System.out.println("CATCH");            
        }
        
        System.out.println("AFTER THROW");
    }
    
    
    
    
    
    
    
    
    
    void try_And_Throw_Method()
    {
        try{
            throw_exception();
            
        }
        
        catch (ArithmeticException exc)
        {
            System.out.println("CATCH");            
        }
    }
    
    
    void throw_exception()
    {
         System.out.println("Before throw");
            throw new ArithmeticException();       
    }
}
