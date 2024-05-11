//If using SYSTEM.IN.READ, you need to have " throws java.io.IOException " beside the method name
//STATIC - create only one function/variable that will be used across the entire class



public class Section_C 
{            
    //____________________________________________________________________
    //  - Uses system.in.read();
    //  - Asks for a single letter, press enter
    //‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
    //NOTE: the enter key is still in the buffer
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
            
    
    static void using_Breaks()
    {
       
       //Use BREAK to exit a loop 
       //If you have more than 1 loop, the break will only exit the current loo0p it's currently in and NOT any outer loops

        
       /*
        In this example, we have 2 loops (do-while and for)
        The do-while is the outer loop, and will cycle 10 times       
        The for loop will attempt to go through 1000 times, but is stopped by the break
        The break only applies to the FOR loop, NOT the do-while loop
        The do-while will always complete its count; the for-loop will NEVER complete its full count
       */
        int a = 0;
        do
        {
            for (int b = 0; b < 1000;b++)
            {
                if (b == 2)
                    break;                                
            }
                
            System.out.println(a);            
            a++;
        }while (a<10);
           
    }

   
    static void using_Labels_Example_A()
    {
       
    //BREAK Labels: 
    /*
        1. b = 1
        2. It will go inside the inner most bracket (where the label "three" resides)
        3. It will check each "if" condition
        4. Since b = 1, it will break to where the "one" label is and print out "HEYO 3"
        
        1. b = 2
        2. Same as before, it will still go inside the inner most bracket
        3. It will check each "if" condition
        4. The difference is now that b = 2, it will break to where the "two" label is and print out "HEYO 2" BUT ALSO it will print out "HEYO 3"
            - even though it didn't break at the one label, it will still print out it's section
            - at b = 3, it will print out EVERY option
        
        The important thing to note is that you can control where it will go
        
    */
        
        for (int b = 1; b <5; b++)
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
        
        
        
    }
    
    
    static void using_Labels_Example_B()   
    {
        
        
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
            for (int d = 1; d <10000; d++)
            {               
                for (int e = 1; e <20000; e++)
                {
                    System.out.println("c = "+ c +", d = " + d + ", e = " +e);  //doing (c + d + e) does NOT print each one, but adds them all together
                    
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
        
        
    }
    
    
    
        
    static void using_Labels_Example_C()   
    {
        
        /* 
            In this example, the first for-loop will complete its 2 cycles
            However, the second loop inside the done label will only complete 7 cycles before it breaks
            Once it reaches "break done", the next cycle for the first for-loop starts
            
        */
        
        int i,j;
        
        for (i = 0; i < 2; i++)               
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
    //The loop will only print out numbers that are odd
    static void continue_Example()
    {
        for (int x = 0; x < 20; x++) 
        {                        
            if ((x%2) == 0)     //This is true for EVEN numbers...
            {                      
                continue;       //... and will immediately skip anything under the if statement     
            }      
            System.out.println(x);
        }
                   
    }    
    
    
    
    
    
    
    //If you want to continue the next iteration of a really long loop, use a label
    static void continue_with_Label_Example()
    {
                
        /*
            In this outerloop example, the first outer for-loop will always complete its 5 cycles
            The second inner loop only completes 4 cycles
            Once the inner loop reaches j == 3, it returns to the outerloop label, and continues its next cycle
            IT DOES NOT RESET THE OUTER LOOP! It still maintains its count, but it seems like the inner loop completed
        */
        outerloop:
        for (int i = 0; i < 5; i++)
        {            
            for (int j = 0; j < 1000; j++)
            {
                if (j == 3)
                {
                    System.out.println(j);
                    continue outerloop;
                }
            }
        }               
    }
    
    
    
    
    
    
    static void count_spaces_in_String() throws java.io.IOException
    {
          
        
        char ch,ignore;
        int spaces = 0;
        System.out.println(" Enter a string. Use . to exit");
        
        
        
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
//        using_Breaks();         
//        using_Labels_Example_A();
//        using_Labels_Example_B();
//        using_Labels_Example_C();
//        continue_Example();
//        continue_with_Label_Example();        
        count_spaces_in_String();    
               
        
    }
}
