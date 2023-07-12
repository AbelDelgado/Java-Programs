
package IO_Streams;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



//Instead of just ascii text, read/write all sorts of data
//YOU CANNOT READ THE TYPE OF DATA it reads/writes to a file (binary format)
//Does not use parameters,creates a file itself 


public class Read_and_Write_From_File_General_Data 
{
    public static void main (String[] args)
    {
        //the data
        
        int i = 11;
        double j = 32.2;
        boolean b = false;
        
        //write some values; unlike other programs, since we are wwrting different types of data, we use this version        
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata")))                         //Create the file data will be saved in a file called testdata
        {
            System.out.println("Writing "+i);
            dataOut.writeInt(i);
            
            System.out.println("Writing "+j);
            dataOut.writeDouble(j);
            
            System.out.println("WRiting "+b);
            dataOut.writeBoolean(b);

            System.out.println("Writing "+12.3 * 1.3);
            dataOut.writeDouble(12.3*1.3);
            
            
        }
        catch (IOException exc) { System.out.println("WRITE error"); }
        
        
        
        
        
        System.out.println("");
        
        
        
        
        //read them from the file TEST DATA
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata")))     //Read from testdata
        {
            i = dataIn.readInt();
            System.out.println("Reading " + i);
            
            j = dataIn.readDouble();
            System.out.println("Reading " + j);
            
            b = dataIn.readBoolean();
            System.out.println("Reading " + b);
                        
             j = dataIn.readDouble();
            System.out.println("Reading " + j);
        }        
        catch (IOException exc) { System.out.println("WRITE error"); }
        

        
    }
    
}
