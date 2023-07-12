
package IO_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



//FASTEST WAY to read data from file, as it reads strings instead of each individual char (read_from_file_v1)



//Needs to be main class 
//no params needed

//Reads an already exisisting file and displays contents


public class Read_From_File_V2 
{
    public static void main (String[] args)
    {
        String s; 
        
        try (BufferedReader br = new BufferedReader (new FileReader("text.txt")))           //auto closes file
        {
            while ((s=br.readLine())!= null)
            {
                System.out.println(s);
            }
        }        
        catch (IOException exc) { System.out.println("IO EXCEPTION"); }
    }
    
}
