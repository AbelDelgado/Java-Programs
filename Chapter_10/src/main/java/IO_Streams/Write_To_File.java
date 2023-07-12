
package IO_Streams;


import java.io.*;

//Reads data from one text file and copies to another text file
//If destination.txt does not exist, one is made!
//If destination.txt does exists, then it is DESTROYED and a new one is made

//Parameters: 
//text.txt destination.txt
                
public class Write_To_File       
{
    public static void main (String[] args)
    {
        int i;  
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        
        //ensure 2 parameters have been entered
        if (args.length != 2)
        {
            System.out.println("Paremeter error");
            return;
        }
            
        try
        {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);               //CREATES destination.txt, if one already exists, then it is DESTROYED and a new one is made
            
            do
            {
                i = fin.read();
                if (i != -1) fout.write(i);                
            }
            while (i != -1);
            
        }        
        catch (IOException exc)
        {
            System.out.println("IO ERROR");
        } 
        
        
        //Makes sure that after everything is done, to CLOSE all the streams
        
        finally
        {
            //Close input stream
            try {   if(fin != null) fin.close();    }                                       //as long as fin != null, then that means that it was open at some point and needs to be closed            
            catch (IOException exc) {   System.out.println("error closing INPUT file");   }
                
            //Close output stream
            try {   if(fout != null) fout.close();  }
            catch (IOException exc) {   System.out.println("error closing OUTPUT file");   }

        }
        
        
        
        
    }    
}
