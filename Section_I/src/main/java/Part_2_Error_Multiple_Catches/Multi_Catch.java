package Part_2_Error_Multiple_Catches;


//This program creates 2 errors:
//1. Divide by zero
//2. Out of bounds array


public class Multi_Catch 
{
    public static void main (String[] args)
    {
        int x [] = {1,2,3,45};
        int y [] = {11,321,32,111,2};
        int total = 0;                                                    
        double number = 0.0;
        
        total = (x.length > y.length) ? x.length : y.length;        //If x is greater, then its the result, otherwise its y
        
        for (int i = 0; i < total; i++)
        {        
            try
            {
                number = x[i]/i;                                //The first time this is run, you will get x/0
                x[i] = 0;

                number = y[i]/i;                                //The first time this is run, you will get x/0                    
                y[i] = 0;                
            }

            catch(ArithmeticException exc)                           //Catches things like 1/0. As soon as an error occurs, it does not continue to run and comes straight here. It does not go back 
            {
                System.out.println("Cannot divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException exc)       //out of bounds array error
            {
                System.out.println("OUT OF BOUNDS");
            }
        
        }
    }
}
