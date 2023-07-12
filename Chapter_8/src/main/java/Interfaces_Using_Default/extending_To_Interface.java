
package Interfaces_Using_Default;



public class extending_To_Interface 
{
    public static void main(String[] args)
    {
        class_Using_Interface obj1 = new class_Using_Interface();        
        int x = obj1.show_Number();                                             //This method is using a default interface as no method has been defined in the class_Using_Interface class below
    }
      
}



class class_Using_Interface implements default_interface
{
    public void dance()
    {
        System.out.println("nothing");
        System.out.println(show_Number());                                   //USING show_Number as a DEFAULT method 
    }
    
  
}


