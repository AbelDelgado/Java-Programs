package Section_A_Methods;


  
public class Section_A_Methods 
{
    //____________________________________________________________________
    //  - For-Loop converts i from liters into gallons
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
    public static void gallons_into_liters()
    {                                     
        //For-Loops with only 1 line do not need brackets
        for (int i = 1; i<=5; i++)                   
            System.out.println("There are " +(i * 3.7854)+ " liters in " +i+ " gallons");                    //Java creates a temporary double for this line, and then throws it away        
        System.out.println();
    }    
    //=====================================================================
    
    
    
    
    
    
    //____________________________________________________________________
    //  -   Basic conversions using Floats 
    //  -   Casting Float as a Double
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
    public static void feet_into_meters()
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
    //=======================================================================================
    
    
    
    
    
    
    
    
    
    
    //____________________________________________________________________
    //  - Incremenet, decrement
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                        
    void increment_Decrement()
    {
        int x = 0;        

        x = x + 1; //For n00bs
        x += 1;    //Professional Java Developer        
        //System.out.println(x);



        int a = 0;
        int b = 1;

        a = b++;  //Assign value first, THEN increment
        //System.out.println(a);
        //System.out.println(b);
    }
    //=======================================================================================
    
        
        
        
        
        
        
        
        
    //____________________________________________________________________
    //  - Boolean Examples
    //  - OR, AND, XOR, NOT
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                                   
    void boolean_Example()
    {
        boolean part1 = true;
        boolean part2 = false;

        System.out.println((part1 | part2));  //or
        System.out.println((part1 & part2));  //and
        System.out.println((part1 ^ part2));  //XOR
        System.out.println((part1 != part2)); //NOT
    }
        
    //=======================================================================================
  
        
        
        
        
        
        
       
    //____________________________________________________________________
    //  Conversion
    //  - 
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                                               
    void conversion_Example()
    {
        int i = 0;
        float f = 0;
        
        /*                
        int can fit -2,000,000,000 to 2,000,000,000        
        float number = 3.5f (It’s still 3.5, but you won’t get a huge 0.332324424235 after it like a double would     
        */
        f = i; //note that i = f WILL FAIL because f is waay bigger than an int
        
        
        //------------------------------------------------------------------------                       
        //Weird Byte Behaviour
        
        byte h = 3;
        byte k = 1;
        byte result = 0;
        
        result = (byte)(h*k);  //YOU HAVE TO CAST AS byte because byte x byte creates an int for some reason
        
        
        
       //==========================  Shorthand Expressions =====================================                           
        //Using & or &&, the program will only evaluate the second expression if needed
        
        int part3 = 0;
        
        //if ((part3 != 0) & (1/part3 ==0))  //This will crash the program since a & will always operates both expressions, even if the first means it will fail                            
        
        if ((part3 != 0) && (1/part3 ==0))  //This will NOT crash the program since the first part fails, and && does NOT evaluate anything else
        {
            
        }
    
        
    }

    
    
    
    
    
    
}
