
package IO_Streams;

import java.io.IOException;
import java.io.RandomAccessFile;



//Instead of accessing data from a file in a sequencial order, you can specify which section of the file you want to read

//This program does NOT USE parameters

public class Random_Access 
{
    public static void main (String[] args)
    {
        double data[] = {1.3,2.3,13.1,321.3};
        double d;
        
        
        //open awnd use RANDOM access
        try (RandomAccessFile raf = new RandomAccessFile("random.txt", "rw"))       //This is only made if this program is made the MAIN program in project properties
        {
            //write values to file; still using bytes 
            for (int i = 0; i < data.length; i++)            
                raf.writeDouble(data[i]);
            
            //read back SPECIFIC values
            //seek sets the file pointer            
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First value is "+d);
            
            raf.seek(8);                                //a single double is 8 bits long
            d = raf.readDouble();
            System.out.println("second value is "+d);
            
            raf.seek(8*3);
            d = raf.readDouble();
            System.out.println("Fourth value is "+d);
            
            
            System.out.println("");
            
            
            
            
        }
        
        catch (IOException exc) { System.out.println("IO error"); }
        
        
    }
    
}
