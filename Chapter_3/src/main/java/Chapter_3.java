//If using SYSTEM.IN.READ, you need to have: throws java.io.IOException 
//STATIC - create only one function/variable that will be used across the entire class


public class Chapter_3 
{    
    
    
    
    //System read example - NOTE: the enter key is still in the buffer
    static void system_read_Example() throws java.io.IOException
    {                            
        System.out.println(" Yo press a key");
        char ch = (char) System.in.read();              //System.in.read takes in a THE FIRST keyboard key and sets it as an int (unicode character). Thats why we cast it as a char here
        int a = System.in.read();                       //Since system.in.read sets the input as an int, we dont need to cast it
        
        System.out.println(" You entered: " + ch );
        System.out.println(" You entered: " +(char)a );                                
    }
    
    
    
    
    
    // The Switch Case Example  
    static void switch_Example() throws java.io.IOException
    {                            
        System.out.println("Select an option");
        System.out.println("1. If");
        System.out.println("2. Switch");
        System.out.print("Enter choice: ");
        
        //int b = System.in.read();                       //System.in.read takes in a keyboard key and sets it as an int (unicode character), so if you enter 9 it will be set as the UNICODE for 9 (57)
        //int enter = System.in.read();  
        
        char b = (char) System.in.read();                  //Number or character, this will take w/e you put in as save it as a char instead of int, but your cases cannot but use actual ints to match this
        //char c = (char) System.in.read();                //If you entered 12345, the 1 is placed in b, 2 is put into c, and the rest are still stored in a buffer
        
        
        System.out.println("You entered: " + b);
        //System.out.println("You entered: " + c);
        switch (b)
        {
            case '1':
                System.out.println("Why'd you pick if? CHOOSE SWITCH");
                break;
            case '2':       
                System.out.println("Yeee the cool option");
                break;
            default:
                System.out.println("Can you not read");               
        }                                                                   
    }
    
    
    
    
    
     
    static void for_loops_Example() throws java.io.IOException
    {
        
        
        //For loop - Multi variable 
        int z = 0, y = 0;
        boolean result = false;
        for (z = 0,y = 10; z < y; z++, y--)
        {
            System.out.println("z is " +z+ " and y is " +y);
        }
        
        
              
        //For loop - INFINITE                
        
//        for(;;)
//        {            
//        }   
        
       


        //For Loop - function for control                 
        int i = 0;
        for (i = 0; (char)System.in.read() != 's'; i++)
        {
            System.out.println(" Pass #" + i);
        }
        
        
        
        
        
        //For loop - NO initializer + NO iteration                       
        int a = 0;  //the initializer is outside the loop
        
        for (; a<10; )   // -> no initializer or iteration
        {
            System.out.println(" Pass #" + a);
            a++;
        }
        
                       
    }
    
    
    
    
    
    //Do while - Checks condition at the end (as opposed to at the start where it may not preform body if it fails)    
    static void do_while_Example() throws java.io.IOException
    {
           
  
        char ch, ignore;
        
        do
        {
            System.out.println("Type a letter: ");
            ch = (char) System.in.read();
            
            //Makes sure the only thing that is taken is the first letter, and no enter or leading characters are taken
            do
            {
                ignore = (char) System.in.read();                    
            }while (ignore != '\n');
           
        } while (ch != 'q');
        
        
    }
            
    
    static void using_Labels()
    {
        
       //BREAK to exit a loop - if you have more than 1 loop, the break will only exit the current loo0p
        
        
        int a = 0;
        do
        {
            for (a = 0; a <3;a++)
            {
                if (a == 2)
                    break;                                
            }
                
            System.out.println(a);            
            a++;
        }while (a<100);
           
         
        
              
        
        
        //BREAK - using labels. In this example, when it gets to 1, it will do every single case, but the important thing to note is that you can control where it wil go
                    
              
        for (int b = 1; b <4; b++)
        {
            one:    
            {
                two:        
                {
                    three:                
                    {
                        if (b == 1) break one;
                        if (b == 2) break two;
                        if (b == 3) break three;
                        
                        System.out.println("HEYO");
                    }                    
                    System.out.println("HEYO 1");                    
                }
                System.out.println("HEYO 2");
            }  
            System.out.println("HEYO 3");
        
        }
        
        
        
        
        
        
        //BREAK - using labels. In this example, we can end several nested loops with a break label. Imagine the done label as a folder. Everything iniside it is skipped if the done break calls it        
                                
        
        /*_________________________        
        /        done:              \___________________________________
        |             
        |
        |for (int i = 1; i <3; i++)
        |{            
        |    for (int j = 1; j <100; j++)
        |    {               
        |      for (int k = 1; k <200; k++)
        |      {
        |           System.out.println("HEYO");
        |           if (i == 1) break done;          
        |        
        */
        
        
        
        done:
        for (int c = 1; c <3; c++)
        {            
            for (int d = 1; d <100; d++)
            {               
                for (int e = 1; e <200; e++)
                {
                    System.out.println("c = "+ c +", d = " + d + ", e = " +e);  //weird, c + d + re does NOT print each one, but adds them all together
                    
                    System.out.println("HEYO");
                    if (c == 1) break done;     // This breaks the loop that done is under control of.
                }
                System.out.println("HEYO 2");
            }                        
            System.out.println("HEYO 3");
        }
        System.out.println("DONE 1");
        System.out.println("");
        System.out.println("");
        
        
        
        /*____________________________________       
        /    for (int i = 1; i <3; i++)       \___________________________________
        |done:  {            
        |    for (int j = 1; j <100; j++)
        |    {               
        |      for (int k = 1; k <200; k++)
        |      {
        |           System.out.println("HEYO");
        |           if (i == 1) break done;          
        |        
        */
                         
        
        
        
        int i,j;
        
        for (i = 1; i <3; i++)               
        done:{   
            for (j = 0; j <100; j++)
            {                               
                System.out.println("i = "+ i +", j = " + j);                                         
                if (j > 5) break done;     // This breaks the loop that done is under control of.                               
            }                        
            System.out.println("HEYO 3");
        }
        System.out.println("done");                        
        
        
    }
    
    //Continue - can make a loop continue to it's next iteration         
    static void continue_Example()
    {
        
        
        
        
        outerloop:
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                if (j == 3)
                {
                    System.out.println(j);
                    continue outerloop;
                }
            }
        }
        
        
        
        for (int i = 0; i < 5; i++) //LOOP A
        {
            for (int j = 0; j < 100; j++) //LOOP B
            {            
                System.out.println(j);
                if (j == 5)
                {      
                    continue;              //NEXT LOOP B ITERATION
                }                
            }
        }
        
        
        
    }
    
    static void count_spaces_in_String() throws java.io.IOException
    {
          
        
        char ch,ignore;
        int spaces = 0;
        System.out.println(" Yo press a key");
        
        
        
        //This will go through each individual character
        do{
            ch = (char) System.in.read();        
            do
            {
                ignore = (char) System.in.read();                    
                if (ignore == ' ')                  //if a space is detectedw
                    spaces++;
            }while (ignore != '\n');                //if the enter key is detected (basically, at the end of the line)
            
            
            System.out.println(" Number of spaces = " +spaces);
            spaces = 0;
            
        }while (ch != '.');
        
        
        
    }
    
    
    public static void main(String[] args) throws java.io.IOException
    {        
        
//        system_read_Example();
//        switch_Example();
//        for_loops_Example();
//        do_while_Example();               
//        using_Labels();
//        continue_Example();
        count_spaces_in_String();    
               
        
    }
}
