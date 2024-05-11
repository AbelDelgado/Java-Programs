
public class Section_B 
{

    public static void main(String[] args) 
    {
         
    
    
    //____________________________________________________________________
    //  - Incremenet, decrement
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                        
   
        int x = 0;        

        x = x + 1; //For n00bs
        x += 1;    //Professional Java Developer        
        //System.out.println(x);



        int a = 0;
        int b = 1;

        a = b++;  //Assign value first, THEN increment
        //System.out.println(a);
        //System.out.println(b);
    
    //=======================================================================================
    
        
        
        
        
        
    //____________________________________________________________________
    //  - Boolean Examples
    //  - OR, AND, XOR, NOT
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                                   
    
        boolean part1 = true;
        boolean part2 = false;

        System.out.println((part1 | part2));  //or
        System.out.println((part1 & part2));  //and
        System.out.println((part1 ^ part2));  //XOR
        System.out.println((part1 != part2)); //NOT
    
        
    //=======================================================================================
  
        
        
        
        
        
        
       
    //____________________________________________________________________
    //  Conversion 
    //      - evaluate only if needed (Shorthand Expression)
    //      -  
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                                               
   
    
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
    
        
        
            
    //____________________________________________________________________
    //  Returning a double to a variable expecting an int        
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                                               
     
    //Test to see what happens if a method that is supposed to return an int 
    //gets assigned to a variable with type int (IT FAILS)

    // 1. set variable int x = 0;
    // 2. Assign int x to a method that returns a double
    //      x = (test.returnDoubleValue(7);
    // 3. Wont even compile because the return type is double (ignore -> return  (double)(y /= 3.0); ) 


        casting_Double_To_Int test = new casting_Double_To_Int();
        int z = 0;
//        z = (test.returnDoubleValue(7);  //COMPILE ERROR - FAILS because the return is a double, and you can't put that into an int     
//        System.out.println(test.returnDoubleValue(7));
    
      
    
    }
         
}


class casting_Double_To_Int
{
    double returnDoubleValue(int y)
    {            
        return  (double)(y /= 3.0);
    }

}

