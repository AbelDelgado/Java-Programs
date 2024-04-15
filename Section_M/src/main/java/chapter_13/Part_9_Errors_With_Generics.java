
package chapter_13;

//The integration of modern generic code had to be done in such a way that still made prexisiting NON generic code work

//SO when JVM compiles your code, it ERASES all the generic stuff, and replaces it with what its going to be
//Type parameters DO NOT EXIST at run time


//Because of this, AMBIGUITY errors can occur


class Generic_Class_10 <T,V>
{
    T ob1;
    V ob2;
    
    
    //Cannot create an instance of type parameter. How does the compiler know which type of object it will be?
//    T ob2 = new T();
    
    
    
    
    //Ambiguity ERROR - pg 484
    //This will not compile because they will all be erased and become: void (Object o)     -> thus making these two methods identical 
    //Or 2 objects of the same type are made. Both T and V become the same, and have the same issue as above
    /*
    
    
    
    void set (T o)
    {
        ob1 = o;
    }
    
    void set (V o)
    {
        ob2 = o;
    }
    
    
    
    
    
    

    //TYPE PARAMETERS: cannot be instantiated. Compiler has NO way of knowing what type of object to create. It's just a placeholder
        
    T ob3;
    Generic_Class_10()
    {
        ob = new T();       //ERROR
    }
    
    
    
    //STATIC: no static member can use a type parameter declared by the enclosing class
    
    static T ob4;           //ERROR
    static T getob()        //ERROR
    {
        return ob4;
    }
   
    
    
    //ARRAYS: 
    
    T vals[]; 
    
    Generic_Class_10(T o, T[] nums)
    {
        vals = new T[10];       //ERROR
    }
    
    public static void main(String[] args)
    {
        Generic_Class_10 <Integer> array = new Generic_Class_10<Integer>[10]; //ERROR CANNOT MAKE AN ARRAY (which is like creating a new object)
    }
    
    
    
    //CANNOT EXTEND THROWABLE
    

class Generic_Class10 <T> extends Throwable     //ERROR
{

}
    
    
    */
    
    
}


public class Part_9_Errors_With_Generics 
{
    
}
