package chapter_14;

//We can use the same interface for two differetn types of code
//Since this interface is comparing 2 variables, we don't have to make 2 seperate interfaces, we can just use generics

interface Generic_Interface<T> 
{
    boolean test (T n, T m);
}


public class Part_3_Lambda_Generic 
{
    public static void main (String[] args)
    {
        
        Generic_Interface <Integer> is_Factor = (n,d) -> (n%d) == 0;
        
        if (is_Factor.test(10,2))
            System.out.println("10 is a factor of 2");
        
        
        
        Generic_Interface <String> cotains_String = (n,d) -> n.indexOf(d) != -1;
        String str = "Generic Functional Interface";
        
        if (cotains_String.test(str,"face"))
            System.out.println("CONTAINS FACE");
        
        
        else
            System.out.println("DOES NOT CONTAIN FACE");
        
        
        
    }
}
