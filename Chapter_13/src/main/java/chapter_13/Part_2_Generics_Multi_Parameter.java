//pg 458

package chapter_13;

class Generic_Class_Template_Part2 <T,V>
{
    
    
    
    //This can hold whatever type of data the object was made with with
    T ob1;
    V ob2;
    
    
    
    
    
    
    //Constructor
    //Both "parameter" and "ob1/ob2" will both be the same type since both are of type "Generic_Type"
    Generic_Class_Template_Part2 (T parameter, V parameter2)
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


public class Part_2_Generics_Multi_Parameter 
{
    public static void main (String[] args)
    {
        Generic_Class_Template_Part2 <Integer,String> double_Object = new Generic_Class_Template_Part2(88,"Hola");
        
        
        double_Object.show_Type();
        int x = double_Object.get_Ob1();
        String a = double_Object.get_Ob2();
        
        System.out.println("X is: " +x);
        System.out.println("a is: " +a);

        
    }
    
}
