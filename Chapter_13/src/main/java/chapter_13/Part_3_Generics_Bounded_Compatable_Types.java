
package chapter_13;

//pg 462

//A generic class that takes in 2 parameters, but you want to ensure that both parameters are compatable with each other
//ie Integer,Double,Float,etc.

class Pair<T,V extends T> //this ensures that V will either be the same as T or a subclass of T
                          // <Integer,String> FAILS
{
    T first;
    V second;
    
    Pair (T a, V b)
    {
       first = a;
       second = b;
    }
}

public class Part_3_Generics_Bounded_Compatable_Types 
{
    public static void main (String[] args)
    {
        Pair <Number,Double> pair_Object = new Pair <Number,Double> (3,3.3);
    }
}
