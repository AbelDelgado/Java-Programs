
package chapter_13;

//pg 469
//This generic method:
//1. Is made inside a NON generic class
//2. Uses its own type parameters (which are usually taken from the generic class declaration)  class Generic_Class_Template_Part2 <T,V>
//





public class Part_5_Generic_Methods 
{
//  static boolean arrays_Equal(T[] x, V[] y) <T extends Comparable <T>, V extends T>  //in generic methods, the type parameters are shown BEFORE the the return type    
    
//  Extending to COMPARABLE means that the objects entered can be ordered (which means that the 2 object CAN be compared)
    
//  V is UPPER BOUNDED to T -> V must either be the same type as T or a subclass of T ( V extends T)
//  LOWER BOUND is the value you put inside the method ( if (arrays_Equal(nums,nums))  nums is lower bound (INTEGER)
    
    static  <T extends Comparable <T>, V extends T>  boolean arrays_Equal(T[] x, V[] y) 
    { 
        if (x.length != y.length)
            return false;
        for (int i = 0; i < x.length; i++)
        {
            if (!x[i].equals(y[i])) return false;
        }
        
        return true;
    }
    
    
    public static void main (String[] args)
    {
        Integer nums [] = {1,2,3,4,5};
        Integer nums2 [] = {1,2,3,4,5};
        Integer nums3 [] = {1,2,7,4,5};
        Integer nums4 [] = {1,2,3,4,5,6};

        Double vals[] = {1.0,2.0,3.0,4.0,5.0};
        
        if (arrays_Equal(nums,nums))        
            System.out.println("nums equals nums");            
               
        
        if (arrays_Equal(nums,nums2))        
            System.out.println("nums equals nums2");            
        
        if (arrays_Equal(nums,nums3))        
            System.out.println("nums equals nums3");            
        
        if (arrays_Equal(nums,nums4))        
            System.out.println("nums equals nums2");            
      
//        if (arrays_Equal(nums,vals))                      //Note how this will NOT compile as Double is NOT the same type OR a subclass of Integer
//            System.out.println("nums equals nums2");            
      
        
        

        
    }
    
}
