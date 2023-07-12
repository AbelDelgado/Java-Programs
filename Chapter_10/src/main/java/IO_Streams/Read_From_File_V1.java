
package IO_Streams;


//To run this program:
//1. Go to the Properties of this package -> Run -> ENTER IN THE PARAMETERS: text.txt
//2. Ensure there is a file called text.txt where this program is located
//3. Make this class the MAIN class (still in project properties), as the parameters are only for MAIN classes



//command in a cmd should look like:
//java Read_From_File text.txt

//command in NETBEANS should look like:
//text.txt

//files need the FULL PATH NAME OR set the current working directory to where the file is stored


//Need to MANUALLY close the stream




import java.io.*;

public class Read_From_File_V1 {
 
    public static void main (String[] args)
    {
        int i = 0;
        FileInputStream fin;
        
        System.out.println("Length: "+args.length);
        System.out.println("Contents of "+args[0]+": ");

        if (args.length != 1)
        {
            System.out.println("Argument not entered? Check project properties -> run ");
            return;
        }
    
        
        
        
        try { fin = new FileInputStream(args[0]); }             //if this works, we can set a stream to read whats in the text file        
        catch (IOException exc)
        {
            System.out.println("File not found");
            return;                    
        }
 
        
        
        try
        {
            do{
                i = fin.read();
                if (i != -1) System.out.print((char)i);
            }while (i != -1);
                
        }
        catch (IOException exc)
        {
            System.out.println("Error reading file");
            return;                    
        } 
        
        
        
        //CLOSE FILE
        try{ fin.close(); }
        catch (IOException exc)
        {   
            System.out.println("ERROR CLOSING??");
        }
        
    }
    
}
