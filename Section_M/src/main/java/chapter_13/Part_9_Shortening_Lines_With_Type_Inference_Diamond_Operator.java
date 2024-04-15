
package chapter_13;

//pg 482
//shortening the way you create a generic object. ONLY LOOK AT MAIN







public class Part_9_Shortening_Lines_With_Type_Inference_Diamond_Operator 
{
    public static void main (String[] args)
    {
        
        //whoa thats long
        Gen_9 <Integer,Integer> ob = new Gen_9 <Integer,Integer> (32,12);
        
        //Don't have to write it twice, <> is good enough
        Gen_9 <Integer,Integer> ob_short = new Gen_9 <> (32,12);
         
        
        
        
    }
}


//This generic class requires TWO objects from PART_2

class Gen_9 <T,V>
{
    
    //This can hold whatever type of data the object was made with with
    T ob1;
    V ob2;
    

    //Constructor
    //Both "parameter" and "ob1/ob2" will both be the same type since both are of type "Gen_9"
    Gen_9 (T parameter, V parameter2)
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
