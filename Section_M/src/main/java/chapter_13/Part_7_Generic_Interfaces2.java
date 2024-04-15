
//pg 474

//Bounded interfaces limit which kind of data can be used



package chapter_13;


interface Containment<T extends Number>
{    
    boolean contains (T o);
}


//Also require the class implementing it to EXTEND as well


class MyClass<T extends Number> implements Containment<T>
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






public class Part_7_Generic_Interfaces2 
{
    public static void main (String[] args)
    {
        Integer x[] = {1,2,3};
        String y[] = {"1","2","3"};
        
        MyClass<Integer> ob = new MyClass<Integer>(x);
//        MyClass<String> ob2 = new MyClass<String>(y);     //needs to be able to extend to string
        
        
        if (ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");
        
        if (ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");
        
        
   /*     
        if (ob2.contains("2"))
            System.out.println("2 is in ob STRRING");
        else
            System.out.println("2 is NOT in ob");
        
   
        if (ob.contains(5.9))                   //fails because ob was made with INTEGER
            System.out.println("5 is in ob");
        */
        
        
    }
    
}
