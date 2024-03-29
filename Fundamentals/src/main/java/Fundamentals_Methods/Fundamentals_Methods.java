
package Fundamentals_Methods;



public class Fundamentals_Methods 
{
    static void gallons_into_liters()
    {                                     
        for (int i = 1; i<=5; i++)                   
            System.out.println("There are " +(i * 3.7854)+ " liters in " +i+ " gallons");                    //Java creates a temporary double for this line, and then throws it away
        
        System.out.println();
    }
    
    static void feet_into_meters()
    {        
        float feet = 0.0f;                                                                                    //Floats are like doubles, but with less precision. Don't let the f scare you, it's just to show that this number is a float
        float meters = 0.0f;
        
        //There is 0.3048m in 1'
        feet = 6.0f;        
        meters = feet * 0.3048f;        
        
        System.out.println("Someone 6 feet tall is " + meters + " meters tall");
        
        
        double feet2 = 0.0;
        double meters2 = 0.0;
        
        feet2 = 6.0;        
        meters2 = feet2 * 0.3048;
        
        System.out.println("Someone 6 feet tall is " + meters2 + " meters tall");
        System.out.println("Someone 6 feet tall is " + (float) meters2 + " meters tall");                     //Casting a double as a float                   
    }
}
