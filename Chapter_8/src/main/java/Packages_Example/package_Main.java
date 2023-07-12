
package Packages_Example;


//-----------------------------Part 1 - Packages (pg 276)----------------------------------------------------
// Every project uses a default package that has no name
// A. First checks current working directory
// B. You can specify path using CLASSPATH 
// C. Use the -classpath option wiht java or javac



//How to use packages in Netbeans:
//1. In the project window on the left, right click project -> Add package. 
//   New package-folder is made where you saved your stuff on PC
//   Note at the top is (package chpt_8_pkg;). MAKE SURE YOU LEAVE THE CLASS, METHODS + CONSTUCTORS PUBLIC. 
//   Only the class with the same file name can be public; other classes cannot be 

//2. Create object using its FULL NAME (package_name.class_name)
//   This method ONLY WORKS IF that package == same folder as the one you are using

public class package_Main 
{
    
    public static void main(String[] args)
    {
        //Like you were extending from a class
        Packages_Example.package_Methods obj1 = new Packages_Example.package_Methods();                                             //!!!!!!!!!!!!!!!!! METHOD 1 !!!!!!!!!!!!!!!!!!!!!!!!!!!!
        obj1.dance();
                
        
        Packages_Example.class_1.class_1_print();       //These methods are static, and thus do not need an object to be made for it        
        Packages_Example.class_2.class_2_print();
     
    }        
    
}
