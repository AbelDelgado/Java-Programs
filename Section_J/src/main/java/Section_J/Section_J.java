//Java programs preform I/O via streams
//All streams work the same, swo methods can be applied to any stream


//There are byte streams and character streams, but today err body uses character streams 


//When done with a file, if you don't close it, you do not free up allocated resources that can be used for another file
//This causes a mem leak


//To run programs with parameters:
//1. Go to the Properties of this package -> Run -> ENTER IN THE PARAMETERS: text.txt
//2. Ensure there is a file called text.txt where this program is located
//3. Make this class the MAIN class (still in project properties), as the parameters are only for MAIN classes




package Section_J;

import java.io.FileInputStream;
import java.io.IOException;

public class Section_J {

    public static void main(String[] args) 
    {
        System.out.println("yo");
    }
}
