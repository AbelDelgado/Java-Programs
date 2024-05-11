
package Part_2_Error_Multiple_Catches;



public class Multi_catches_in_Single_Catch {
    
    public static void main (String [] args)
    {
        try{ 
            System.out.println("Before throw");
            throw new ArithmeticException();                                        //Throw the error yourself!
            
        }
            
        catch (ArithmeticException | ArrayIndexOutOfBoundsException exc)            //catch multiple errors in a single catch statement 
        {
            System.out.println("CATCH");            
        }
    }
    
}
