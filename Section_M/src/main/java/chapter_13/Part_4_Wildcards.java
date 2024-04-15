
package chapter_13;

//pg 463
//WiLdCaRdS

class Numbers_Only_Class <T extends Number>
{
    T num;
    
    Numbers_Only_Class (T n)
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
    
    
    //USING WILDCARDS
//  boolean absEqual (Numbers_Only_Class <T> ob)  //This will compile, but there's a problem:
    
    
//  Numbers_Only_Class <Integer> integer_Object = new Numbers_Only_Class <Integer> (6);  //When we made this object, it was type Integer, which means:

    
//  class Numbers_Only_Class <T extends Number>  -> when creating this class, T = Integer, so if the method looked like this:
//  boolean absEqual (Numbers_Only_Class <T> ob)  //then T is also integer, and can ONLY ACCEPT OTHER INTEGERS
    
    
//  integer_Object.absEqual(double_Object)  -> but when we call the method here, we are passing a Double to ob, and ob can only accept Integers
//  Since that is not always the case, the answer is to use WILDCARD 

//   Final point: While <?> can techinically accept w/e, Numbers_Only_Class objects are still restricted to Number
    
    
    
    boolean absEqual (Numbers_Only_Class <?> ob)
    {
        
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))   
        {
            return true;
        }
            
        return false;
            
    }
    
     
}


public class Part_4_Wildcards        
{
    public static void main (String[] args)
    {
        Numbers_Only_Class <Integer> integer_Object = new Numbers_Only_Class <Integer> (6); 
        Numbers_Only_Class <Double> double_Object = new Numbers_Only_Class <Double> (-6.0);
        Numbers_Only_Class <Long> long_Object = new Numbers_Only_Class <Long> (5L);

        
        System.out.println("Testing int and double: ");
        if (integer_Object.absEqual(double_Object))
            System.out.println("Absolute values are equal");
        else
            System.out.println("Absolute values are NOT equal");
        
        System.out.println("");
        
        System.out.println("Testing int and long: ");
        if (integer_Object.absEqual(long_Object))
            System.out.println("Absolute values are equal");
        else
            System.out.println("Absolute values are NOT equal");
        
        
        
        
        
            
        /*
        Integer x = new Integer (3);
        Double y = new Double(-3.0);
        if (Math.abs(x.doubleValue()) == Math.abs(y.doubleValue()))   
        {
            System.out.println("SAME");
        }
        */
              
    }
    
    
}
