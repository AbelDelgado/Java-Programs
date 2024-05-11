
package My_Protected_Variables_Example;


public class protected_Variables_Examples {
    
}





//OK LOOK. The following example is all probably VERY redundent (probably), BUT let me explain why I tried this



//Below is an abstract class + an abstract method(from Section G) + includes a protected variable
abstract class abstract_class
{    
    protected int a = 0;      
    int method_Return(){return 1;}   
    
    
    abstract void method_Abstract(); //ALWAYS BLANK, but ensures all subclasses have one
    
}



class test extends abstract_class
{               
    
    void method_Abstract(){}            //needed ONLY if extending to ABSTRACT_CLASS. They DEMAND you have their methods included one way or another 




    void method()
    {
     
        
//This section demonstrates that despite being an abstract class, you can still create an arary of that type (you cannot make objects from abstract classes)
//However, the arrays are NOT initalized, and so while it may compile, you cannot use that object to access the abstract class protected variable + method
        
   
//        abstract_class obj2 = new abstract_class;         //This fails, cannot make abstract object
   
        abstract_class obj[] = new abstract_class[3];       //remember how objects CANNOT be made from abstract classes? This shows that arrays aren't really making the object yet. They all must first be initialized
//        int x = obj[0].method_Return();                     //while these 2 lines compile, you'll get a runtime error due to it NOT being intialized; not because you're making an abstract object
//        obj[0].a = 1;

          //The example above is THE EXACT SAME as below. Both "compile", but fail at run time since they weren't initialized
//        int [] x = new int [5];
//        System.out.println(x[0]);
//        int sum = 1 + x[0];
                
        
        

//So lets initialize one. This is where I got stuck. Initailize it to what class? If I initialized it to the class I'm currently in (test), that would solve the issue of a NON abstract class
        test obj2 = new test();                
//        obj[0] = new test();                //This does NOT work though
//The problem is that you cannot assign a class to another without extending first 




//So then I extended this class to abstract_class (and fulfilling the method required) and assigned the array element to this class, and I could access the protected variable...
        //class ... extends abstract_class
        //....
//         obj[0] = new test();     //now this works after extending
//        int x = obj[0].a;         //now I can access this protected variable
        
// but that wasn't the reason why it worked. It worked because, like any other class extentsion, the moment you extend to another class, you can access their variables (protected or not)

//URGH DONE
 

        
               
    }
    
   
}





