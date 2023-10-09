//pg 460

//need a way to prevent AWNYTHING other than number values for this generic class



package chapter_13;

class Numbers_Only_Class <T extends Number> //by extending to Numbers, only subclasses can be used for this generic class
{
    T num;
    
    Numbers_Only_Class(T n)
    {
        num = n;         
    }
    
    double reciprocal()
    {
        return 1 / num.doubleValue();
    }
    
    
    double fraction()
    {
        return num.doubleValue() - num.intValue(); //cute way of getting only the decimal number
    }
    
}

public class Part_3_Generics_Bounded_Types 
{
    public static void main (String[] args)
    {
        Numbers_Only_Class <Integer> integer_Object = new Numbers_Only_Class<Integer>(5);
        System.out.println("Recipricol is: " +integer_Object.reciprocal());
        System.out.println("fraction is: " +integer_Object.fraction());

        Numbers_Only_Class <Double> double_Object = new Numbers_Only_Class<Double>(54.25);
        System.out.println("Recipricol is: " +double_Object.reciprocal());
        System.out.println("fraction is: " +double_Object.fraction());
        
        
    }
    
}
