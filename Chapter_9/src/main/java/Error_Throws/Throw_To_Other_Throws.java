
package Error_Throws;


//A throw from one method is sent to another throw in another method

public class Throw_To_Other_Throws 
{
    public static void main (String [] args)
    {
        try
        {
            Error_Class.error_Method();
        }
        catch (ArrayIndexOutOfBoundsException exc)
        {
            System.out.println("FATAL ERROR; ARRAY OUT OF BOUNDS CLOSING PROGRAM");
        }
    }
}



class Error_Class
{
    public static void error_Method()
    {
        int[] x = {1,2,3,4,0};
        double num = 0;
        
            for (int i = 0; i < 6; i++)
            {
                try
                {
                    System.out.println(x[i]+"/"+i);
                    num = x[i]/i;
                }
                catch (ArithmeticException exc)
                {
                    System.out.println("cannot divide by 0...continuing");
                }
                catch (ArrayIndexOutOfBoundsException exc)
                {
                    throw exc;                                                      //THROWING THE EXCEPTION BACK TO MAIn
                }
                
            }                                
        
    }
}
