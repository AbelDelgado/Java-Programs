
package IO_Streams;

import java.io.PrintWriter;



//We use System.out.println for debugging purposes
//Real programmers use PrintWriter to write to the console


public class Writing_To_Console 
{
    public static void main (String[] args)
    {
        PrintWriter pw = new PrintWriter (System.out, true);        //Autoflush == true; means that after every time a print method is called, its flushed
        
        int i = 123;
        double d = 3.2;
        
        pw.println(i);
        pw.println(d);
        
        pw.println(i + "+" +d+ "is " +(i+d));
    }
    
}

