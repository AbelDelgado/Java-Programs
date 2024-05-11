

package IO_Streams;

import java.io.*;


//The best way to read from the console 

//read from the console until . is entered
//Reads each individual character


public class Character_Streams 
{
    public static void main (String [] args) throws IOException
    {
        character_Stream();
        string_Stream();
    }
    
    
    
    
    
    
    static void character_Stream() throws IOException
    {
        char c;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       //Note: System.in is a byte stream, so we need to wrap it into the bufferReader instead of using it as it is
        System.out.println("Enter characters, use . to quit: ");
        
        
        //read characters
        do
        {
            c = (char)br.read();        //compare this program with Basic_Input_Stream.java
            System.out.print(c);
        }
        while(c != '.');
    }
    
    
    
    
    
    
    static void string_Stream() throws IOException
    {
        String str;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       //Note: System.in is a byte stream, so we need to wrap it into the bufferReader instead of using it as it is
        System.out.println("Enter strings, use 'stop' to quit: ");
        
        
        //read characters
        do
        {
            str = br.readLine();        //returns NULL at end of stream
            System.out.println(str);
        }
        while(!str.equals("stop"));
    }
    
    
    
}
