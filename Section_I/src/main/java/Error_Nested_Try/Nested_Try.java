
package Error_Nested_Try;







public class Nested_Try 
{
    public static void main (String[] args)
    {
        int x [] = {1,2,3,4};
        int y [] = {1,2,3,4,5};
        int total = 0;                                                    
        double number = 0.0;
        
        total = (x.length > y.length) ? x.length : y.length;       
        
        
        try                                                                         //THis try looks for any out of bounds error. Once found, the program should STOP
        {
            for (int i = 0; i < total; i++)
            {        
                try
                {
                    System.out.println(x[i]+"/"+i);
                    number = x[i]/i;                                
                    x[i] = 0;

                    System.out.println(y[i]+"/"+i);
                    number = y[i]/i;                                           
                    y[i] = 0;              
                    System.out.println("");
                }
                catch(ArithmeticException exc) { System.out.println("1/0 ERROR"); }            //Catches 1/0 error, but the loop keeps going
            }
        }
        catch (ArrayIndexOutOfBoundsException exc){System.out.println("ARRAY OUT OF BOUNDS ");}
    }
    
}
