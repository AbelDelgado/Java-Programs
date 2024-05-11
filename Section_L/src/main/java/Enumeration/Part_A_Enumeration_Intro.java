
//pg 423
package Enumeration;

//emuneration - coins: penny, nickle, dime...
//emuneration - month: Jan, Feb,


//WARNING!!!!! - Keeping the ENUMERATION name the same (Transport) will interfere with the other classes

//Java uses emuns AS CLASS types
//Previously, classes used new to create object, but enums dont
//Since they are classes (like Object) they also have predefined methods 



enum Transport_Part_A
{
    CAR, TRAIN, PLANE, BOAT // -> enumeration constants
                            // -> public static
                            // -> self typed (in this case, type = Transport_Part_A)
}



public class Part_A_Enumeration_Intro
{
    public static void main (String[] args)
    {
        Transport_Part_A tp1;
        Transport_Part_A tp2;
        tp1 = Transport_Part_A.BOAT;       //variables being qualified using the word "Transport"
        tp2 = Transport_Part_A.CAR;
        
        System.out.println(tp1);
        
        
        if(tp1 == Transport_Part_A.BOAT)
        {
            System.out.println("same");
        }
        
        switch (tp1)
        {
            case BOAT:             //variables being used without being qualified
                System.out.println("dance");
                break;            //if you forget this break, it will do the next cases even if they don't match
            case TRAIN:
                System.out.println("sing");
                break;
        }
        
        
    }
}
