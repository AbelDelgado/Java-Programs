
package IO_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//See Section E on how to use command line arguments



//try (resource) - using this version of 'try' will automatically close the stream after its done
//Once try finishes, the resourse  is released, no need to use a finally close



//Out of all the read/write programs where you need to close the stream, this method is the BEST ONE
//This needs paremeters depending on which function you want to run

public class Auto_Close_ReadAndWrite_Stream 
{
    public static void main (String[] args)
    {        
        if (args.length == 1)
            single_Stream_AutoClose(args);
        if (args.length == 2)
            double_Stream_AutoClose(args);
        
        if (args.length > 2 || args.length == 0)
            System.out.println("ERROR, invalid parameters");                
    }
    
    
    static void single_Stream_AutoClose(String[] args)
    {
        int i; 
        
        System.out.println("Reading " +args[0]);
            
        try (FileInputStream fin = new FileInputStream(args[0]))        //fin is local to this try block; so when try is finished, fin is auto CLOSED (note: you can also use var here lol) 
        {
            do
            {
                i = fin.read();
                if (i != -1) System.out.print((char)i);
            }    
            while (i != -1);            
        }        
        
        catch (IOException exc){ System.out.println("IO ERROR"); }        
    }
    
    
    
    // Read from file, then write contents to a destiniation file; closes both streams
    //NOte: much shorter than previous versions of reading/writing to a file
    
    
    static void double_Stream_AutoClose(String[] args)
    {
        
        int i;             
        
        System.out.println("Copying " +args[0]+ " into " +args[1]);
        
        try (FileInputStream fin = new FileInputStream(args[0]);            //using TWO STREAMS: fin/fout are local to this try block; so when try is finished, fin/fout are both auto CLOSED (note: you can also use var here lol) 
             FileOutputStream fout = new FileOutputStream(args[1]))        
        {
            do
            {
                i = fin.read();
                if (i != -1) fout.write(i);     
            }    
            while (i != -1);           
            
        }        
        catch (IOException exc){ System.out.println("IO ERROR"); }
        
    }
    
}


//reasons why to use old way(explicity use close();
//1. old code
//2. code using older versions of java