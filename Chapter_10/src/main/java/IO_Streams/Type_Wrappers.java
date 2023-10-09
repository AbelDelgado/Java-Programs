
package IO_Streams;

import java.io.*;



//Type Wrappers = lets you take primitive types and WRAP them into an object 
//number = Integer.parseInt(str); Integer is the type wrapper, and with it you can use primitive types LIKE OBJECTS!!


//Recieve NUMBER inputs, calculates average
//Converts string into an INT


public class Type_Wrappers 
{
    public static void main (String[] args) throws IOException
    {
        
        String str;
        int number; 
        double sum = 0.0;
        double avg, t;
        
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        
        System.out.println("How many numbers will you enter?");
        str = br.readLine();
        
        //Take the string input and converts it into an int
        try
        {
            number = Integer.parseInt(str);  //Using the Integer type wrapper, CONVERTS STRING into INT                        
        }
        catch(NumberFormatException exc) 
        { 
            System.out.println("Number format error"); 
            number = 0;
        }
        
        
        
        
        
        
        System.out.println("Enter " +number+ " number values:");
        for (int i = 0; i < number; i++)
        {
            System.out.print(":");
            str = br.readLine();
            try
            {
                t = Double.parseDouble(str);            //Using the Double type wrapper, CONVERTS STRING into DOUBLE     
            }
            catch (NumberFormatException exc) 
            { 
                System.out.println("Number format error");
                t = 0.0;
            }              
            
            sum += t;
        }
        
        
        
        
        
        avg = sum / number;
        System.out.println("Average is: " +avg);
            
        
    }
}
