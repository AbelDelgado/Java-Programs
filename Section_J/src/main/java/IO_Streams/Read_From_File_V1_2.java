

//Better version as it closes the stream with a finally, so no matter what, the stream will be closed

package IO_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_From_File_V1_2 
{
    public static void main (String [] args)
    {
        int i = 0;
        FileInputStream fin = null;
        
        System.out.println("Contents of "+args[0]+": ");

        //Makes sure a single argument is entered
        if (args.length != 1)
        {
            System.out.println("Argument not entered? Check project properties -> run ");
            return;
        }
    
        
        
        //Opens file, reads characters until EOF, then closes file in FINALLY block
        
        
        try 
        {
            fin = new FileInputStream(args[0]);                                   //if this works, we can set a stream to read whats in the text file           
            do{
                i = fin.read();
                if (i != -1) System.out.print((char)i);
            }while (i != -1);
            
        }                              
                
        
        catch (FileNotFoundException exc){  System.out.println("Error reading file");  }        
        
        catch (IOException exc) {  System.out.println("FILE READING ERROR ");   }       //This catch would normall catch a FILE NOT FOUND error as well, but you can use this way to make it more clear as to what went wrong


        //CLOSE FILE                   
        finally
        {
            try { if (fin !=null) fin.close(); }                            //CLOSE Fin if its not null. If it is null, then it was NEVER OPENED since its value was never changed
            catch (IOException exc) { System.out.println("ERROR CLOSING FILE");}
        }

    }
}
