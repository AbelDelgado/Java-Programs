
package chapter_14;



//Whereas the static version used class name, instance method uses the OBJECT REFERENCE
//        result = numTest(MyIntPredicates::isPrime, 17);          //This demonstrates how to use static method references
//        IntPredicate ip = myNum::isFactor;                       //This demonstrates how to use instance method references




interface IntPredicate 
{
    boolean test (int n);
}



class MyIntNum
{
    private int v;
    
    MyIntNum (int x) { v = x; }
    
    int getNum () { return v; }
    
    boolean isFactor (int n) { return (v % n) == 0; }
}





public class Part_7_A_Method_Reference_Using_Instance_Methods 
{
    public static void main (String[] args)
    {
        boolean result;
        
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        
        
        IntPredicate ip = myNum::isFactor;          //Method reference
        
        result = ip.test(3);
        if (result) System.out.println("3 is a factor of: "+myNum.getNum());
        
        ip = myNum2::isFactor;
        result = ip.test(3);
        if (!result) System.out.println("3 is not a factor of: " +myNum2.getNum());
    }
    
}
