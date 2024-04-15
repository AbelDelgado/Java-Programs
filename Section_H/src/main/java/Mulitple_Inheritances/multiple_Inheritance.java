
package Mulitple_Inheritances;

//CANNOT extend/inherit multiple classes 
//Class can maintain state info (via instance variables); interfaces CANNOT


//CAN implement multiple instances
//Couldn't we use DEFAULT methods from various instances and then just implement them in a single class? 
//Book says dont do that...but here's an example




public class multiple_Inheritance implements interface_Alpha,interface_Beta
{
    public void interface_Method()
    {
        System.out.println("CLASS");
    }
    
    public static void main (String[] args)
    {
        multiple_Inheritance obj1 = new multiple_Inheritance();        
        obj1.interface_Method();
    }
    
}


//ORDER OF PRIORITY:
//1. If a class implemements multiple interfaces + overrides their default method = CLASS METHOD WINS
//2. If a class implemements multiple interfaces, but does NOT override their default method = ERROR
//3. When an interface extends to another AND both define the same default method, then the one extending will have its method used
//   -if you want to use the superclass's method: SUPER_CLASS_NAME.super.METHOD_NAME
