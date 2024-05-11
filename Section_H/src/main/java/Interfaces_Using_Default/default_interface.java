
package Interfaces_Using_Default;



//When adding a new method to an interface, you don't want to write a new method for each program that implements it
//By using the default keyword to create a method in the interface, you can provide a body for that method to use if it's called
//This means every class that implemenets this interface may end up with methods they don't really need



//class vs. interface
//class can maintain info, interfaces cannot

public interface default_interface
{
    int ONE = 1;                                     //CONSTANT
    public void dance();                             //NORMAL
    default public int show_Number(){  return 1;  }  //DEFAULT implemtation           
    default int show_Number2(){return 2;}
}
