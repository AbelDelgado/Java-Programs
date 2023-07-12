
//  THROWABLE (SUPER CLASS) -> EXCEPTION (SUBCLASS) -> CUSTOM SUBCLASS

//Creating a custom exception = creating a class + extending THROWABLE

package My_Custom_Exception;



class custome_Exception extends Exception
{
    int a;
    int b;    
    
    custome_Exception (int i, int j)
    {
        a = i;
        b = j;        
    }
    
    
    public String toString()                                        //exceptions error messages can be printed with this method
    {
        return "Error " + a + " and " + b + " ";
    }
}

public class Custom_Exception_Subclass_Of_Throwable 
{
    public static void main (String[] args)
    {
        try
        {
            throw new custome_Exception (1,2);
        }
        catch (custome_Exception exc)
        {
            System.out.println(exc);        //This will use the TO STRING method as subclasses of Throwable can print exc, but we made our own version
                    
        }
    }
}
