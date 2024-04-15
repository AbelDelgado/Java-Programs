
package Packages_Import;



//The idea is that in a single package, you have your main class (the title of the file) and other classes that will NOT be imported
//Every package imports a large number of standard classes (Java API  (Application Programming Interface))

//Example:
//import java.lang => contains System



//        PACKAGE NAME     CLASS NAME
import Packages_Example.package_Methods;          //the name of the file name in that package                           //!!!!!!!!!!!!!!!!!METHOD 2!!!!!!!!!!!!!!!!!!!!!!!!
//import Packages_Example.class_1;           //cant just import any class in the package
//import Packages_Example.*;



public class importing_Packages 
{    
    public static void main (String[] args)
    {
        var obj1 = new package_Methods();
        obj1.dance();    
        
    }               
}
