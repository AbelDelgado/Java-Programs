
package Enumeration;

//pg 429
//Forbidden from inherting(extending), but..
//ALL enumerations inherit from java.lang.Enum, which contains several useful functions

//Ordinal value: the position a constant is in

enum Transport_Part_D
{
    //0   1   2    3    -> ordinal value
    BIKE,BUS,CAR,PLANE
}

public class Part_D_Enumeration_Inherit 
{
   public static void main (String[] args)
   {
       Transport_Part_D tp1, tp2, tp3;
       
       System.out.println("Ordinal Values: ");
       for (Transport_Part_D t : Transport_Part_D.values())           //For every value in transport
           System.out.println(t + " " + t.ordinal());   //Print out its ordinal value
       
       
       tp1 = Transport_Part_D.PLANE;
       tp2 = Transport_Part_D.BUS;
       tp3 = Transport_Part_D.PLANE;
       
       
       
       if (tp1.compareTo(tp2)<0)
           System.out.println(tp1 + " comes before " +tp2);
       if (tp1.compareTo(tp2)>0)
           System.out.println(tp1 + " comes after " +tp2);
       if (tp1.compareTo(tp3) == 0)
           System.out.println(tp1 + " equals " +tp3);
       
        
   }
           
    
}
