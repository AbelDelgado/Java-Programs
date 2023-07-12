
package IO_Streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


//you need to make this class the main class in project properites for it to write a file


public class Type_Text_to_file_with_FileWriter 
{
    public static void main(String[] args)
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Use 'stop' to quit");
        
        try (FileWriter fw = new FileWriter("fileWriter.txt"))
        {
            do
            {
                System.out.println(": ");
                str = br.readLine();
                
                if(str.compareTo("stop") == 0) break;
                
                str = str + "\r\n"; //add new line
                fw.write(str);                
            }
            while (str.compareTo("stop") != 0);
        }        
        catch (IOException exc) { System.out.println("IO Exception"); }                    
    }
}
