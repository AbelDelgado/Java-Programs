package chapter_14;


import java.io.*;





interface MyIOAction
{
    boolean ioAction (Reader rdr) throws IOException;           
}


public class Part_5_Throw_Exception_In_Lambda 
{ 
    public static void main (String[] args)
    {
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();            //can throw an IO exception
            return true;
        };
    }
        
}
