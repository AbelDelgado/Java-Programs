
package Interfaces_Using_Static;


//IN INTERFACES, static methods exist independantly. do NOT need an object to be referenced. Still need body
//interface_name.static_method

//WARNING - static methods are NOT inherited by extending/implementing

public class using_Static implements static_Interfaces
{
    public static void main (String[] args)
    {
        static_Interfaces.static_Hello();              
    }
}
 