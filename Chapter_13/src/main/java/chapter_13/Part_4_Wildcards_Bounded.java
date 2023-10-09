
package chapter_13;

//pg 466




//Class A is the superclass of B and C
//You want to make the method called "test" that can take any Gen object as long as its parameter class is a subclass of A (A,B,C; D SHOULD FAIL)

class A 
{
    
}

class B extends A
{
    
}

class C extends A
{
    
}

class D
{
    
}



class ASD<T>
{
    T ob;
    
    ASD (T o)
    {
        ob = o;
    }
}
      


public class Part_4_Wildcards_Bounded 
{
    static void test (ASD<? extends A> o) 
    {
        
    }
    public static void main (String[] args)
    {
        
        //#1
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        //#2
        ASD<A> w = new ASD<A>(a);
        ASD<B> w2 = new ASD<B>(b);
        ASD<C> w3 = new ASD<C>(c);
        ASD<D> w4 = new ASD<D>(d);
        
        //#3
        test(w);
        test(w2);
        test(w3);


        
        //Order:
        //#1 - Make an object of A (or its subclass)
        //#2 - Using object made in #1, create a Generic object
        //#3 - call test using the Generic Class objects
        //Notew that test(w4) WILL FAIL as test only accepts generic objects whose type parameter is a subclass of A
        
    }
    
}
