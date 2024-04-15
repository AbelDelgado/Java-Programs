
package Protected_Variables;




//PROTECTED VARIABLES
//Protected can be accessed by:
//- its own package (only by extending a subclass to a superclass, as you would normally do to access variables in another class)
//- classes that extend to it

public class protected_Variables extends Protected_Variables_Data.defining_Protected_Vars                                                        //!!!!!!!!!!!!!!!!! METHOD 2 !!!!!!!!!!!!!!!!!!!!!!!!!!!!           
{
    void method()
    {
        a = 3;          //accessing a PROTECTED variable here is okay since this class extends to that package...
        System.out.println(a);        
    }
}

class not_extending
{
    
    void method2()
    {                
        protected_Variables obj2 = new protected_Variables();
//        obj2.a = 3;           //Fails since A is protected; this class did NOT extend to it
        obj2.method();          //Works since the protected variable is not directly accessed by this class
    }
}
