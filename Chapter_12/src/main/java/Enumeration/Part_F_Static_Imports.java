


package Enumeration;

//pg 443
//Tired of making classes and then having to write their long class names when using their methods??
//INTRODUCING:

//static import: combining static and import, you can import the static memebers of a class or interface
//ie: you don't have to write the class name everytime you use a STATIC method 


import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
//import static java.lang.Math.*;

//ROFL DONT DO THIS PLEASE
import static java.lang.System.out;

public class Part_F_Static_Imports 
{
    public static void main (String[] args)
    {
        double a, b, c;

        a = 4;
        b = 1;
        c = -3;
        
        
        //can go from this:
        double x = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / ( 2 * a);      //sqrt and pow are STATIC methods, so you need to call the class name Math

        //to this:
        x = (-b + sqrt(pow(b,2) - 4 *a * c)) / (2*a); //but since we imported those static methods, we can use them without having to use the class name

        out.println("DON'T DO THIS. What is out?! Absolute madness");


    }
}
