

package IO_Streams;
import java.io.*;

//Using a stream, get input from keyboard, store that data in an array, and then display it


public class Basic_Input_Stream 
{
    public static void main (String args[]) throws IOException
    {
        byte data [] = new byte[10];
        
        System.out.println("Enter something: ");
        System.in.read(data);
        System.out.println("You entered: ");
        for (int i = 0; i < data.length; i++)
        {
            System.out.print((char)data[i]); 
        }
    }
    
}
