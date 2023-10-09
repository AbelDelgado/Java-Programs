
package chapter_14;


interface MyFunc 
{   
    MyClass func (String s);
}


class MyClass 
{
    private String str;
    
    MyClass (String s) { str = s;}
    MyClass () { str = "";}
    
    String getStr() { return str; }
}




public class Part_7_C_Constructor_Reference 
{
    public static void main (String[] args)
    {
        MyFunc myClassCons = MyClass::new;
        
        MyClass mc = myClassCons.func("Testing");
                
        System.out.println("str is : " +mc.getStr());
        
    }
    
}
