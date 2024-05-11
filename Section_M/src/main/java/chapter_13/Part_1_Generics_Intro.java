
package chapter_13;

//pg 452 - Generics


//A generic template that can be used with different types of data
//You don't have to write a different algorithm for different types of data (like using a quicksort)

//Parameterized Types: when creating the object, you specify the type instead of having the class having to determine it



//<Generic_Type> is called a TYPE PARAMETER. It acts as a placeholder. The type is whatever you enter when making an object from this class. You can rename this to anything you want on the line bellow
//Proffesionals use A SINGLE CAPITAL LETTER for type parameters <T>
//You can tell if a class = Generic if its using a type parameter
//CANT USE PRIMITIVE TYPES (int,string,etc)


class Generic_Class_Template <Generic_Type>
{
    
    
    
    //This can hold whatever type of data the object was made with w
    Generic_Type generic_Variable;
    
    
    
    
    
    //Constructor
    //Both "parameter" and "generic_Variable" will both be the same type since both are of type "Generic_Type"
    Generic_Class_Template (Generic_Type parameter)
    {
        generic_Variable = parameter;
    }
    
    
    
    
    
    //Return the variable
    Generic_Type get_Ob()
    {
        return generic_Variable;
    }
    
    
    
    
    //Display the type 
    void show_Type()
    {
        System.out.println("Type of T is: " +generic_Variable.getClass().getName());
    }
}






public class Part_1_Generics_Intro       
{
    public static void main (String[] args)
    {
        
        
        Generic_Class_Template <Integer> integer_Object;
        integer_Object = new Generic_Class_Template<Integer>(88);       //uses autoboxing to put an int into an Integer object
        integer_Object.show_Type();
        
        
        int v = integer_Object.get_Ob();
        System.out.println("Value of V: " +v);
        
        
        
        System.out.println("");
        
        
        
        Generic_Class_Template <String> strOb = new Generic_Class_Template <String> ("Generic Test");
        strOb.show_Type();
                
        String str = strOb.get_Ob();
        System.out.println("Value: " +str);
        
        
                
    }
}

