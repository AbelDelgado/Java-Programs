
package Interfaces_Example;





//Like abstract classes, any class that implements an interface contain ALL of the interface's methods,w but can also add their own methods 
//The main idea = when new a method makes changes to old methods, it's not an issue 


public class interface_Main
{
      
    public static void main (String[] args)
    {
        using_Interface obj = new using_Interface();
        obj.dance();        
        int x = obj.show_Number();
    }
    
}

class using_Interface implements interface_Example
{
    public void dance(){System.out.println("DANCE");}
    public void sing(){System.out.println("SING");}
    
    
    public int show_Number(){return ONE;}                           
    
    
    
    public void new_method(){System.out.println("NEW!");}       //Can include methods not inside interface
}

