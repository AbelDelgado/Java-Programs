
package chapter_13;

//pg 479
//The main method shows how to deal with the transition from legacy code with current code regarding generics

class Gen_8 <T>
{
 
    T generic_Variable;

    Gen_8 (T o)
    {
        generic_Variable = o;
    }

    T get_Ob()
    {
        return generic_Variable;
    }

    void show_Type()
    {
        System.out.println("Type of T is: " +generic_Variable.getClass().getName());
    }
}



//DO NOT USE THIS IN NEW CODE, ONLY FOR LEGACY CODEE
//DO NOT USE THIS IN NEW CODE, ONLY FOR LEGACY CODEE
//DO NOT USE THIS IN NEW CODE, ONLY FOR LEGACY CODEE



//Old code cant handle NEW generic code
//Use RAW data to support legacy code

//DO NOT USE THIS IN NEW CODE, ONLY FOR LEGACY CODEE
//DO NOT USE THIS IN NEW CODE, ONLY FOR LEGACY CODEE
//DO NOT USE THIS IN NEW CODE, ONLY FOR LEGACY CODEE
public class Part_8_Legacy_Code_Raw_Types  
{
    public static void main (String[] args)
    {
        Gen_8 <Integer> iOb = new Gen_8<Integer>(88);
       
        


        //THIS IS HOW YOU SUPPORT OLD CODE
        Gen_8 raw_Variable = new Gen_8(98.6);   
        //Notice how there is NO TYPE. This is actually creating an "Object" type
        
        //How does it know which type of data this is? To prevent errors, you need to specify
        
        
        double x = (Double) raw_Variable.get_Ob(); //Casting to ensure it knows what type of data
        
//        int y = (Integer) raw_Variable.get_Ob(); //FAILS at RUNTIME. CANNOT cast INTEGER into DOUBLE


        
    }
    
}
