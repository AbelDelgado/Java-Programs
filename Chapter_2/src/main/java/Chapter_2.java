/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Mirzado 2.0
 */
public class Chapter_2 {

    public static void main(String[] args) 
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
        
        
        
        boolean part1 = true;
        boolean part2 = false;
        
        System.out.println((part1 | part2));  //or
        System.out.println((part1 & part2));  //and
        System.out.println((part1 ^ part2));  //XOR
        System.out.println((part1 != part2)); //NOT
                      
        //Conversion
        int i = 0;
        float f = 0;
        
        /*                
        int -2,000,000,000 to 2,000,000,000        
        float number = 3.5f (It’s still 3.5, but you won’t get a huge 0.332324424235 after it like a double would     
        */
        f = i; //note that i = f WILL FAIL because f is waay bigger than an int
        
        
        //Weird Byte Behaviour
        
        byte h = 3;
        byte k = 1;
        byte result = 0;
        
        result = (byte)(h*k);  //YOU HAVE TO CAST AS byte because byte x byte creates an int for some reason
        
        
        /*Shorthand Expressions:        
        Will only evaluate the second expression if needed*/
        
        int part3 = 0;
        
        //if ((part3 != 0) & (1/part3 ==0))  //This will crash the program since a & will always operates both expressions, even if the first means it will fail                            
        
        if ((part3 != 0) && (1/part3 ==0))  //This will NOT crash the program since the first part fails, and && does NOT evaluate anything else
        {
            
        }
            
    }
}
