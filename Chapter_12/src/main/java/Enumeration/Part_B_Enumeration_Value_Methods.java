package Enumeration;

//pg 426

//values() = returns array of the list of enumeration constants
//valueOf(str) = returns enumeration constant whose value matches str


//a for EACH loop is used



enum Transport_Part_B
{
    PLANE,CAR,BIKE,BUS
}
        
        
        

public class Part_B_Enumeration_Value_Methods 
{
    
    public static void main (String[] args)
    {
        Transport_Part_B tp1;
        
        
        //Print out all the enumeration constants
        Transport_Part_B allTransport[] = Transport_Part_B.values(); //values method returns an array
        for (Transport_Part_B t: allTransport)
        {
            System.out.println(t);
            
        }
        /*
        for (Transport t : Transport.Values())
        {
            System.out.println(t);
        }        
        */

        //Check what the value of the enumeration constant is
        tp1 = Transport_Part_B.valueOf("BUS");
      

        System.out.println("Tp contains "+tp1);
        
    }
    
    
}
