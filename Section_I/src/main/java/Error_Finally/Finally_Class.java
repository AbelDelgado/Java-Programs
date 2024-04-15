
package Error_Finally;

//After a try/catch statement, you may want to close a connection that was opened instead of closing program suddenly
//Use final



class Use_Finally
{
    public static void create_Error(int choice)
    {
        int x [] = new int [3];
        try
        {
            switch (choice)
            {
                case 0:
                    int a = 1/0;
                    break;
                case 1:
                    x[6] = 3;
                    System.out.println("ARRAY OUT: WILL I APPEAR?");
                    break;
                case 2:
                    return;             //leave try/catch blocks and go to FINALLY
            }
        }
        
        catch(ArithmeticException exc)
        {
                    System.out.println("DIVIDE BY 0 ERROR");
                    return;
        }
        
        catch (ArrayIndexOutOfBoundsException exc)
        {
            System.out.println("ARRAY OUT OF BOUNDS");               
        }
        
        finally
        {
            System.out.println("LEAVING THE TRY STATEMENT");
        }
        
    }
}

public class Finally_Class extends Use_Finally
{
    public static void main (String [] args)
    {        
        for (int i = 0; i < 3; i++)
        {
            create_Error(i);
        }
    }
    
}
