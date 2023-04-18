public class Chapter_3 
{    
    
    public static void main(String[] args) throws java.io.IOException
    {        
        
        //System read example
        
        /*
        char ch;
        System.out.println(" Yo press a key");
        //ch = (char) System.in.read();        
        //int a = System.in.read();                       //System.in.read takes in a THE FIRST keyboard key and sets it as an int (unicode character)
        
        //System.out.println(" You entered: " + ch );
        //System.out.println(" You entered: " +(char)a );
        
        
        */
        
        
        
        
        
        //The Switch Case Example        
        
        /*
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
        
        
        */
           
        
        //For loop - Multi variable  
        
        /*
        int z = 0, y = 0;
        boolean result = false;
        for (z = 0,y = 10; z < y; z++, y--)
        {
            System.out.println("z is " +z+ " and y is " +y);
        }
        */
        
        
        
        //For Loop - function for control 
        
        /*
        int i = 0;
        for (i = 0; (char)System.in.read() != 's'; i++)
        {
            System.out.println(" Pass #" + i);
        }
        */
        
        
        //For loop - NO initializer + NO iteration
               
        /*
        int i = 0;  //the initializer is outside the loop
        
        for (; i<10; )   // -> no initializer or iteration
        {
            System.out.println(" Pass #" + i);
            i++;
        }
        */
        
        //For loop - INFINITE
        
        /*
               
        for(;;)
        {
            
        }
        
        
        */
        
       
        
        //Do while - Checks condition at the end (as opposed to at the start where it may not preform body if it fails)
        
        /*
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
        */
        
        
       //BREAK to exit a loop - if you have more than 1 loop, the break will only exit the current loo0p
        
        /*
        int i = 0;
        do
        {
            for (i = 0; i <3;i++)
            {
                if (i == 2)
                    break;                                
            }
                
            System.out.println(i);            
            i++;
        }while (i<100);
           
        */   
        
              
        //BREAK - using labels. In this example, when it gets to 1, it will do every single case, but the important thing to note is that you can control where it wil go
        /*             
              
        for (int i = 1; i <4; i++)
        {
            one:    
            {
                two:        
                {
                    three:                
                    {
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        
                        System.out.println("HEYO");
                    }                    
                    System.out.println("HEYO 1");                    
                }
                System.out.println("HEYO 2");
            }  
            System.out.println("HEYO 3");
        
        }
        */
        
        
        
        
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
        
        
        /*
        done:
        for (int i = 1; i <3; i++)
        {            
            for (int j = 1; j <100; j++)
            {               
                for (int k = 1; k <200; k++)
                {
                    System.out.println("i = "+ i +", j = " + j + ", k = " +k);  //weird, i + j + k does NOT print each one, but adds them all together
                    
                    System.out.println("HEYO");
                    if (i == 1) break done;     // This breaks the loop that done is under control of.
                }
                System.out.println("HEYO 2");
            }                        
            System.out.println("HEYO 3");
        }
        System.out.println("DONE 1");
        System.out.println("");
        System.out.println("");
        
        */
        
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
                         
        
        /*
        
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
        
        */
        
        
        
        
        
        //Continue - can make a loop continue to it's next iteration 
        
        /*
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
        */
        
        /*
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
        
        
        */
        
        char ch,ignore;
        int spaces = 0;
        System.out.println(" Yo press a key");
        
        do{
            ch = (char) System.in.read();        
            do
            {
                ignore = (char) System.in.read();                    
                if (ignore == ' ')
                    spaces++;
            }while (ignore != '\n');
            
            
            System.out.println(" Number of spaces = " +spaces);
            spaces = 0;
            
        }while (ch != '.');
        
        
        
        
        for (int i = 0; i < 10; i++)
        {
            while (true)
            {               
                if ( 1 < 3)
                {
                    break;
                }
            }                
            System.out.println("here");
        }
        System.out.println("herwaease");
        
        
        //int a = System.in.read();                       //System.in.read takes in a THE FIRST keyboard key and sets it as an int (unicode character)
        
        //System.out.println(" You entered: " + ch );
        //System.out.println(" You entered: " +(char)a );
        
        
    }
}
