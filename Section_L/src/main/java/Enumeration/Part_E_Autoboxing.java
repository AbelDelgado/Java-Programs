
package Enumeration;

//pg 436




//Autoboxing/autounboxing: converting primitive data types into objects, or vise-versa

//primitive types: hold basic data types supported by the lagnuage
//                 used instead of objects for the sake of performance
//                 do NOT inherit Object, not part of object Hierarchy


//Type Wrapper Classes: Hold a primitive int so you can use it as an object
//                      Classes: Int, Double, String, Byte, etc...
//                      The numeric type wrapper classes inherit the abstract class Numeric


import java.lang.*;

public class Part_E_Autoboxing 
{
    
    //See MAIN for what these methods accomplish
    
    
    
    //This method is looking for an Integer object, but is given a primitive integer in main. Thus, this method autoboxes the primitive int into an Integer Object
    static void m (Integer v)
    {
        System.out.println("m() recived " +v);
    }
    
    //This method returns a primitive int, but the variable in main is of type Integer. Thus, the value is autoboxed in main
    static int m2()
    {
        return 10;
    }
    
    //This method returns an Integer object, but the return has a primitive integer. Thus, it is autoboxed into an Integer Object
    static Integer m3()
    {
            return 99;              //Autoboxes 99 into an Integer object
    }
    
    
    
    public static void main (String [] args)
    {     
       
        Integer integer_Object = 100; //Autoboxing: automatically boxing a primitive integer into an object
        int a = integer_Object;        
        
             
        
        /*
        Why auto? Well before, they had to MANUALLY box primitive types into objects:
        
        Integer int_Obj = new Integer.ValueOf(100);     //boxes an int into an object
        int i = int_Obj.intValue();                     //unboxes the object, and places it into int
        
        */
        
        
        
        m(199);                                       //m() boxes this primitive int into an Integer object
        
        
        Integer integer_Obj = m2();                     //The Type Wrapper Integer autoboxes the primitive integer 10 into an object
        System.out.println("Return value of m2 is "+integer_Obj);
        
        int i = m3();                                   //m3() returns an Integer Object, so here it is autounboxed and storred into a primitive int 
        System.out.println("Return value of m3 is " +i);
        
        
        
                                                        
        integer_Obj = 100;      //100 is autoboxed into an Integer Object
        System.out.println("Square root fo integer_Obj is "+ Math.sqrt(integer_Obj));    //The Math.sqrt(double) is looking for a double, so the integer_Obj is autounboxed and promoted into a double
        
        
        
        
        
        
        
        //Expressions use Autoboxing - pg 441
        
        Integer int_Object1, int_Object2;
        int x;
        
        
        int_Object1 = 99;
        ++int_Object1;  //You cannot "add" an object, so this unboxes the int, adds +1 to it, then autoboxes it back to an object
        
        
        int_Object1 += 10; //unboxed, 10 is added, then autoboxed
        
                     //also unboxed                   
        int_Object2 = int_Object1 + (int_Object1/3); //int_Object1 is unboxed, expression is evaluated, then reboxed
        
        
        
        
        
        //Switch statment using Integer object
        System.out.println("Using a switch statement: ");
        int_Object1 = 1;
        
        switch (int_Object1)        //int_Object1 is unboxed, and its value is obtained
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("error");
                      
        }
 
        
        
        
        System.out.println("");
        
        //!!!!!!WARNING!!!!!!!!!
        //Don't use Integer or Double to replace primitive data
        //While you could go:
     
        Integer ints = 5;
        Double doubles1 = 1.0 , doubles2 = 0.0;
        Double average = 0.0;
        
        average = ((doubles1 + doubles2 + ints) / 3);
        System.out.println("Average is " +average);
        
        
        //This causes unnecessary overhead which could have been avoided had you used primitives
        
        
    }

    
    
    
    
}

