

package chapter_13;

//pg 472

//This interface assumes that the class that will use it has 1 or more values to determine if a specified value is contained in it
//If an interface is generic, then that usually means the class using it will be generic. Otherwise, you would not be able to pass stuff to the contains method


//class MyClass implements Containment<T> -> WRONG, no way to know if the object you are making is supported. Pg 473 explains this
// MyClass<Integer> ob = new MyClass<Integer>(x);


//class MyClass implements Containment<Double> -> GOOD as long as you know what type of data you are taking in


interface Containment<T>
{    
    boolean contains (T o);
}




class MyClass<T> implements Containment<T>
{
    T[] arrayRef;
    
    MyClass(T[] o)
    {
        arrayRef = o;
    }
    
    public boolean contains(T o)
    {
        for (T x: arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
    
            
}


public class Part_7_Generic_Interfaces 
{
    public static void main (String[] args)
    {
        Integer x[] = {1,2,3};
        String y[] = {"1","2","3"};
        
        MyClass<Integer> ob = new MyClass<Integer>(x);
        MyClass<String> ob2 = new MyClass<String>(y);
        
        
        if (ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");
        
        if (ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");
        
        
        
        if (ob2.contains("2"))
            System.out.println("2 is in ob STRRING");
        else
            System.out.println("2 is NOT in ob");
        
        /*
        if (ob.contains(5.9))                   //fails because ob was made with INTEGER
            System.out.println("5 is in ob");
        */
        
        
    }
    
}
