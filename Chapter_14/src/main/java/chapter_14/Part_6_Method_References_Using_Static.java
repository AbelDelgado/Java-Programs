package chapter_14;




//Method references refer to a method without running it
//This example uses STATIC methids

//The main body contains the code that displays method reference
//similar to lambda examples, method references require functional interfaces



//Functional Interface
interface IntPredicate
{
    boolean test (int n); // we can use this to test an integer against some condition
}





//STATIC methods that take in an int, and test it against a condition

class MyIntPredicates
{
    static boolean isPrime (int n)
    {
        if (n < 2) return false;
    
        for (int i = 2; i <= n/i; i++)
        {
            if ((n % i) == 0)
                return false;    
        }
        return true;
    }
    
    
    static boolean is_Even (int n)
    { 
        return (n % 2) == 0;
    }
            
                
}





public class Part_6_Method_References_Using_Static 
{
    
    //This method uses a functional interface as the first parameter, and the number to use as the second 
    static boolean numTest(IntPredicate object, int v)
    { 
        return object.test(v); 
    }
    
    
    
    public static void main (String[] args)
    {
        boolean result;
        
        result = numTest(MyIntPredicates::isPrime, 17);          //This demonstrates how to use method references
            if (result) System.out.println("17 is prime");
            
        result = numTest(MyIntPredicates::is_Even, 10);    
            if (result) System.out.println("10 is even");                            
    }    
    
    
}
