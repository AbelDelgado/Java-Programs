
package Part_4_Error_Object_Usage;



class create_Error_Obj
{
    void create_Err_Method()
    {
        int [] x = new int [5];
        x[6] = 3;
    }
}

public class Object_Usage
{
    public static void main (String[] args)
    {
        var obj = new create_Error_Obj();
        try
        {
              obj.create_Err_Method();
        }
        catch (ArrayIndexOutOfBoundsException exc)
        {
            System.out.println(exc.toString());        //Uses toString(), becase its an object!, but normally we use the following one...
            System.out.println("");
            System.out.println(exc);                  //Same as above            
            System.out.println("");
            exc.printStackTrace();       

            
            
            
        }
    }
    
}
