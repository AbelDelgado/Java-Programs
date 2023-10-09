//pg 483
//Shortening lines using:
//#1. Local Variable + Type Inference
//#2. Diamond Operator + Type Inference
package chapter_13;


public class Part_9_Shortening_Lines 
{
    public static void main (String[] args)
    {
        
        //whoa thats long
        Gen_9 <Integer,Integer> ob = new Gen_9 <Integer,Integer> (32,12);
        
        //#2. Diamond Operator + Type Inference: Don't have to write it twice, <> is good enough 
        Gen_9 <Integer,Integer> ob_short = new Gen_9 <> (32,12);
        
        
        //#1. wLOCAL VARIABLE STYLE         
        var ob_var = new Gen_9 <Integer,Integer> (32,12);
         
        
        
        
    }
    
}


class Gen_9_2 <T,V>
{
    
    //This can hold whatever type of data the object was made with with
    T ob1;
    V ob2;
    

    //Constructor
    //Both "parameter" and "ob1/ob2" will both be the same type since both are of type "Gen_9"
    Gen_9_2 (T parameter, V parameter2)
    {
        ob1 = parameter;
        ob2 = parameter2;
    }
    
   
    //Display the type 
    void show_Type()
    {
        System.out.println("Type of T is: " +ob1.getClass().getName());
        System.out.println("Type of V is: " +ob2.getClass().getName());
    }
    
    
    //Return the variable
    T get_Ob1()
    {
        return ob1;
    }
    
       //Return the variable
    V get_Ob2()
    {
        return ob2;
    }
   
}
