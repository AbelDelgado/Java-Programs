
package Part_1_Error_Handling;


//Catches an array out of bounds error
// Catch (ErrorObjectType Object)


public class Error_Handling 
{
   
    
    public static void main (String[] args)
    {
        

        
        
        int [] array = new int [3];
        
        try
        {            
            array[4] = 0;                    
            System.out.println("NEVER DISPALYED");      //When an error occurs, control is TRANSFERED to the catch, and so this is never shown
        }
          
                
        catch (ArrayIndexOutOfBoundsException exc)              //If no error occurs, this is not run
        {
            System.out.println("ARRAY OUT OF BOUNDS");
        }
        
        
        
        
        
        
        
        
        
        
        
//Note that in a try block, if it runs a seperate method, and THAT method causes an error, the catch method will STILL catch it
//Catching errors lets the program continue instead of CLOSING COMPLETELY     
    
        try
        {
            create_Error();
        }
        
        catch (ArrayIndexOutOfBoundsException exc) 
        {
             System.out.println("ARRAY OUT OF BOUNDS");
        }
        
    }    
    
    
    static void create_Error()
    {        
        int [] x = new int [3];
        for (int i = 0; i < 4; i++)
        {
            System.out.println("OKAY");
            x[i] = 3;        
        }
    }
    
    
  
    
    
    
    
}
