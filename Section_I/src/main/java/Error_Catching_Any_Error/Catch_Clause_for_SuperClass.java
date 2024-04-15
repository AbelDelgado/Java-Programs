
package Error_Catching_Any_Error;


//Same as the Multiple catches, but notice the Throwable exc catch block
//If you put that first, then any catch statements after it will NOT BE CAUGHT as the throwable catch block will catch EVERY ERROR



public class Catch_Clause_for_SuperClass 
{
    
   public static void main (String[] args)
    {
        int x [] = {1,2,3,45};
        int y [] = {11,321,32,111,2};
        int total = 0;                                                    
        double number = 0.0;
        
        total = (x.length > y.length) ? x.length : y.length;       
        
        for (int i = 0; i < total; i++)
        {        
            try
            {
                number = x[i]/i;                                
                x[i] = 0;

                number = y[i]/i;                                           
                y[i] = 0;                
            }

            
            catch(ArrayIndexOutOfBoundsException exc)      
            {
                System.out.println("OUT OF BOUNDS");
            }
            
            catch(Throwable exc)                                    //Will catch ANY ERROR
            {
                System.out.println("Error found");
            }
        
        }
    }
    
}
