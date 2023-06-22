/*
BOOKMARKS ARE COOL!
CTRL+SHIFT+M makes a bookmak, so you don't have to scroll ALLLL the way to main
CTRL+SHIFT+. or CTRL+SHIFT+, toggles between them
















Breakpoint
<----Click on one of these numbers to set a breakpoint
Then, if you use DEBUGGER (beside the compile button), it will stop wherever you set it.
You can then STEP through your program


Multiple public static void Mains (String[] args)
See Queues example (Part 6)
ie. 
runProgram2.main(null);


Using COMMAND LINE ARGUMENTS in netbeans  (pg 165)
<--- in the Projects tab, right click the top main folder, and click properties
Click run, select the main class and add your arguments there
arguments are saved as:

'This is an argument'

public static void main (String [] args)
args = { "This", "is", "an", "argument"};
           0       1    2       3


*/


class arrays_Structures
{         
    //--------------------------------------------------------------------------------------------------------------------------------
    //PART ONE - Declaring arrays
    //Creating arrays are just like creating objects:
    //1. creating the reference variable  (ie int example[]) 
    //2. allocate memory for the array  AND THEN assign a reference point to that space in memory to the variable        
    //
    //This also means that like objects, they have their own methods you can use 
    //        OBJECT:                   ARRAY:
    //  (chapter_5.method1();    testArray1.length();
        
            
    
               
    //--------------------------------------------------------------------------------------------------------------------------------
    //PART TWO - Errors with creating array    
    //At the time of this writting, I'm not sure why you cannot create an array AS SHOWN BELLOW outside of a method 
       
    
    
    //This section demonstrates spliting the creation of an array OUTSIDE of a method fails
    
    //int test[];               
    //test = new int[10];       //----------> THIS FAILS
    
    //int test1[] = new int[10]; //----------> THIS is okay    
    
     


            
    //--------------------------------------------------------------------------------------------------------------------------------
    //PART THREE - Code for creating arrays
    //Try to associate "new" with allocating space in memory!                    
    //Declaring an array inside a method seems to allow the seperation of steps (doesn't seem useful)
    
    void create_Array()
    {
        
        //Standard way
        int testArray[] = new int[10];
        
        
        int test2[];            //Note that there is no physical object yet
        test2 = new int[10];
                
        
        //Copying an array
        //Can be used when creating a new object with the array                
        int [] nums = {1,2,3,4};
        int [] copy;
        copy = nums;
        
        /*
        class test
        {
            int [] array_Copy;        
            test(int [] x)
            {
                array_Copy = x;
            }                
        }        
        
        */

        
        
        
        //What happens if you create an array, but then use NEW to make it again?
        int [] new_Array = {1,2,3,4,5};        
        System.out.println("What is inside arrayTest3[0]"+new_Array[0]);        
        new_Array = new int [3]; //DELETES PREVIOUS ENTRIES
               
        
        
        //You can also declare an array this way  
        int test3[] =  {1,2,3};
        int test4[][] = {   {1   ,  2   ,  3},    {1    ,  2}    ,  {1}  ,   {0}    };
        //                [0][0]  [0][1] [0][2] [1][0]   [1,1]    [2][0]    [3][0]
        
        int test5[][][] = {   {         {1    ,    2}         ,     {1}       , {0}     }    ,    { {1,3,5},{1,5} }     };
        //                          [0][0][0]   [0][0][1]        [0][1][0]   [0][2][0]    
        
        int test5a[][][] = 
        {
            {
                {1,2},{1},{0} 
            },
            {
                {1,3,5},{1,5} 
            }
        };
    
        System.out.println("PRINT OUT FOR test5: " +test5[0][0][1]);
        
        
        
        //Multidimensional Arrays
        int table [][] =  new int [1][5];                                  
        int table2 [][] =  new int [1][];                          
        int table3 [][][] = new int [1][][];                                         
        //Note that you do NOT have say how many elements are in either dimension!
        //Multi-dimensional arrays only need to have first array dimension set
        
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        /*As long as you initialize the first element, you can initialize the other sections separately, and they don't have to be the same!
        i.e. 
        int table3 [][][] = new int [3][][];                                 
                                       /\/\
                                       ||||
        
        If no number is put here, then [3][a][b] a or b can be ANY number. There is no set one
        int table3 [][][] = new int [3][3][1];                                                   
        int table3 [][][] = new int [3][1][1];                                 
        */
        
        
        //To initialize the remaining arrays:        
        int table4[][][][] = new int [3][][][];         
         table4[0] = new int [4][2][1];
         table4[1] = new int [4][2][1];
         table4[2] = new int [4][2][1];
         //table4[3] = new int [4][2][1];      //RUNTIME ERROR: Remember, the number inside the array CAN NEVER BE ACCESSED 
         
         
         //Both the following enter the arrays the same way...
         int table5_1[][]=  
         {
             {1,2,3},
             {1,2,3},
             {1,1,3},
             {1,0,0,4,5,6}             
         };         
         System.out.println("PRINT OUT FOR TABLE5: " +table5_1[0][2]);
         
         int table5_1a[][] = new int[4][6];
         //ONLY ENTERING FIRST ELEMENT
         table5_1a[0][0] = 1;
         table5_1a[0][1] = 2;
         table5_1a[0][2] = 3;  
         //...however, this second method has a limit. The first method DOES NOT                           
         
                                                                                        
         
         
         
         //These two are the same thing, but...
         int table6_1[][] = new int [3][];
         int[][] table6_2 = new int [3][];                  
         
         //...sometimes you want to create multiple arrays of the same dimension         
         int[][] table6_a,table6_b,table6_c;
         //SAME AS:
         int table6_a1[][],table6_b1[][],table6_c1[][];                         
         
         //!!!!!!!!!IMPORTANT!!!!!!!!!!!!
         //This shorthand is used when you create a method that returns an array                           
    }                   
        
    int[] method_Returns_Array()
    {
        int x[] = new int[1];
        int y[] = new int[1];
        
        return x;
    }
    
    
    
    
                      
    
    
    //--------------------------------------------------------------------------------------------------------------------------------
    //PART FOUR - Array Assignment/Manipulation
    //Unlike manipulating variables, assigning an array to another will change the reference, not the values
    /*
    
    int x = 10;
    int y = 999;
    
    x = y;    
    print(y);  y = 10    
    x += 4;    
    print(y);  y = 10
    
    
    
    
    int array1[] =  {1,2,3};
    int array2[] =  {9,99,999};    
    
    
    
    array2 = array1;            
    print(array2); {1,2,3}
    
    array1[0] = 99;
    print(array2); {99,2,3}
    
    array1 and array2 NOW REFERENCE SAME THING!!
    
    */
    
    void manipulating_Arrays()
    {
        
        
        //********************Section 1 - Assigning one array to another*********************************
        System.out.println("\n\n\n\n");
        System.out.println("MANIPULATING ARRAYS:");
        System.out.println("");
        
        
        int test1[] = {111,222,333,444,555};
        int test2[] = {99,1,3,4};
        
        
        System.out.print("PRINT OUT FOR test1: " );
        for (int i = 0; i < test1.length; i++)
            System.out.print(" "+test1[i]);   
        
        System.out.println("");
        
        System.out.print("PRINT OUT FOR test2: " );
        for (int i = 0; i < test2.length; i++)
            System.out.print(" "+test2[i]);                        
        
        
        //RESULTS:        
        //PRINT OUT FOR test1:  111 222 333 444 555
        //PRINT OUT FOR test2:  99 1 3 4
       
        
        
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //Unlike other primitive data types (int, float, double, etc), array references work differently
        //Chainging test2 WILL ALSO change test1
        
        test1 = test2;  
        
        
        System.out.println("");
        System.out.print("PRINT OUT FOR test1: ");
        for (int i = 0; i < test1.length; i++)
            System.out.print(" "+test1[i]);   
        
        test2[0]=99999;
        System.out.println("");
        
        System.out.print("PRINT OUT AFTER test1: ");
        for (int i = 0; i < test1.length; i++)
            System.out.print(" "+test1[i]);  
        
        //RESULTS:        
        //PRINT OUT FOR test1:  99 1 3 4
        //PRINT OUT FOR test1:  99999 1 3 4
        
        
        
        System.out.println("\n\n\n\n");  
        
        

        
        
        //************************Section 2 - Increment Dimension in one step**********************
        System.out.println("*********Section 2 - Increment Dimension in one step************");  
        int i = 0;
        int [] arrayTest3 = new int [3];           
                
        
        arrayTest3[i++] = 'x';
        //The above statement is the same as:           
        //arrayTest3[i] = 'x';
        //i++;                        
        
        System.out.println("Inside arrayTest3[0]: "+arrayTest3[0]); //The character x = 120
        System.out.println("i: "+i); //i was incremented AFTER the assignment
     
        
        //*********************Section 3 - Entering values into a multi-dimension array*************
        int[][] array2 = new int [3][5];
        for(int x = 0; x <array2.length;x++)            
        {
            for(int j = 0; j <array2[i].length;j++)
            {
                array2[i][j] = j;
            }
            
        }
        
    }
    
    
    //--------------------------------------------------------------------------------------------------------------------------------
    //PART FIVE - Array.length()
    
    void array_Length()
    {
        int [] arrayTest1 = new int[2];                
        System.out.println("arrayTest1: " +arrayTest1.length); //2
        
                
        int [][] arrayTest2 = new int [5][3];        
        //If you don't put in a dimension for multidimension arrays, it will assume the first element
        System.out.println("arrayTest2: " +arrayTest2.length);  //5
        System.out.println("arrayTest2: " +arrayTest2[4].length);  //Regardless of which element is entered[0-4], its all 3
        
        
        System.out.println("GARBAGE: " +arrayTest1);
        System.out.println("arrayTest1: " +arrayTest1.length); //ERROR, array not initialized
        
        
       
        //  5   
        // [ ] [ ] [ ] 
        // [ ] [ ] [ ] 
        // [ ] [ ] [ ] 
        // [ ] [ ] [ ] 
        // [ ] [ ] [ ] 3       
        
    }                   
}






//--------------------------------------------------------------------------------------------------------------------------------
//PART SIX - Stacks (of Plates) and Queues (of people in a line)

//QUEUES:
//1. Once an elemenet has been retrieved, it cannot be retrieved again
//2. queue can get full or empty .... lol
// Circular - reuses slots that are empty
// However, this example is Non-circular - does NOT reuse slots, gets exhausted                             

class queue_Example_Methods
{
    char q[];     
    int putloc,getloc;
    
    
    //Constructor that creates an array with the size specified
    queue_Example_Methods(int size)
    {
        q = new char[size];
        putloc = getloc = 0;        
    }
    
    //put a character in the queue
    void setter(char ch)
    {
        if (putloc==q.length) //Putloc is incremeneted everytime a character is entered. If that number == the max size of the queue, then it's full
        {
            System.out.println("QUEUE FULL");
            return;
        }
        else
        {
            q[putloc++] = ch; //increment of putloc happens AFTER the assigment
        }        
    }
    
    //get character from the queue
    char getter()            
    {
        if (getloc==putloc)
        {
            System.out.println("QUEUE EMPTY");
            return (char)0; //while this method normally sends back the character in the queue, the 0 in this case is needed for the if statement inside the method that calls this
        }
        return q[getloc++];    
    }         
    
    int length()
    {
        return q.length;
    }
}


class queue_Example_Data_Input
{
    public static void main(String args[])
    {
        queue_Example_Methods bigQ = new queue_Example_Methods (100);
        queue_Example_Methods smallQ = new queue_Example_Methods (4);

        char ch;
        int i;
        
        //Adding characters to queue
        System.out.println("Storing alphabet into bigQ");        
        for (i = 0; i < 26; i++)
            bigQ.setter((char)('A' + i));
        
        //Displaying characters in queue
        System.out.println("Printing out bigQ:");        
        for (i = 0; i <26; i++)
        {
            ch = bigQ.getter();
            System.out.println(" " +ch);           
        }
        
        
        
        //Printing out errors
        System.out.println("Length of SmallQ: "+smallQ.length());
        for (i = 0; i < 5; i++)
        {
            System.out.println("Placing " +(char)('Z'-i)+ " into smallQ["+i+"]" );  
            smallQ.setter((char)('Z'-i));
        }               
        System.out.println("");
        
        
        //We want to see what happens once it passes the limit, so we take how big it is and add 1
        System.out.println("Conetents of smallQ");
        for (i = 0; i < smallQ.length()+1;i++)
        {
            ch = smallQ.getter();            
            if (ch != (char)0) //once the queue hits the end, it will return a (char)0
            {
                System.out.print(ch);
            }                     
        }
    }
    
    
}



//--------------------------------------------------------------------------------------------------------------------------------
//PART SEVEN - For Each Loop: DO FOR EACH ELEMENT
//Book uses them for ARRAYS, but can be used for other stuff
//A for loop that goes through EVERY element
//This class shows how to get the sum of every element
class for_Each_Loops
{    
    void regular_For_Loops()
    {
        
        //********************Single Dimension Array*************************
        int [] array = {1,2,3,4}; //sum = 10
        int total_Sum_Of_Array = 0;

        for (int i = 0; i <array.length; i++)        
            total_Sum_Of_Array += array[i];        
        
        System.out.println("Sum of Single Dimension array: " +total_Sum_Of_Array); //10
        
        
                
        //********************Multi-Dimension***********************************
        int array2[][] = { {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5} }; //sum = 45
        total_Sum_Of_Array = 0;
                
        //System.out.println("Array Length Dim 1:" +array2.length);
        //System.out.println("Array Length Dim 2:" +array2[0].length);
        
        for (int i = 0; i <array2.length; i++)             //Array2.length gives the FIRST dimension [x][]                
            for (int j = 0; j <array2[i].length; j++)      //Doesn't really matter which [x][] to use, since they are all the same
            {                
                //System.out.println("i = "+i+" j = "+j+" Array Length Dim:" +array2_1[i][j]);
                total_Sum_Of_Array += array2[i][j];        
            }                                
        System.out.println("Sum of Multi Dimension array: " +total_Sum_Of_Array); //45
        
    }
    
    
    
    
    
    
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //There is no value for the iterator. The int i in the for loop (int i:array) is just the value (array[i]) and therfore you cannot change the array using a for each loop
    void for_Each_Loop()
    {
        System.out.println("\n\n\n\n");  
     
        
        
        
        System.out.println("******************SINGLE-DIMENSION*********************");
        //Single Dimension Array
        int [] array = {10,5,15,20};
        int total_Sum_Of_Array = 0;
        
        for (int i: array) total_Sum_Of_Array += i;   //i being the value of whats in array[i]        
        System.out.println("Sum of Single Dimension array: " +total_Sum_Of_Array); 
        

        
        
        
        
        System.out.println("\n\n");  


        
        
        
        
        System.out.println("******************MULTI-DIMENSION*********************");        
        //Multi-Dimension Array
        int array2[][] = { {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5} }; //sum = 45
        total_Sum_Of_Array = 0;
            
        for (int[]x: array2)        //The x iterator is a reference for each array   System.out.println(x) results in the reference
        {                               
            for (int y: x)          //Y is the VALUE of whats inside the second array. The first array doesnt have values to add
            {
                total_Sum_Of_Array += y;
            }
        } 
        System.out.println("Sum of Multi Dimension array: " +total_Sum_Of_Array); //45
        
        
        
        
        
        System.out.println("\n\n");  
        
        
        
        
        
        System.out.println("********************Breaking out of a For-Each Loop******************");
        int [] array3 = {1,2,3,4,5,6};
        int sum = 0;
        for (int x: array3)
        {
            System.out.println("Is "+x+ " the same as 4? "+(x==4));                //Prints out the value of whats inside the array            
            if(x == 4)                             
                break;                    //if the value inside the array is 4, it QUITS THE LOOP                                        
            
            sum += x;            
            System.out.println(array3[x]);       
        }
    }
    
    
}








//---------------------------------------------------------------------------------------------------------------------------------------------------
//PART EIGHT - Strings 
//Creating a Strings == creating objects!!
//Once a string has been created, you cannot modify it
/*
    String s = "1";  
    s.concat("2");//concat() method appends the string at the end  
    System.out.println(s);//will print "1" because strings are immutable objects  
    
    "1" and "12" are both inside S, but only 1 is referenced. You can always:

    s = "2"; //this changes the reference
    
*/
//But you 

//If you need to make a change, make a new string with the new change

class strings_Example
{
    void using_Strings()
    {
        
        //Creating Strings
        String example = new String("Hello"); //str2
        String example2 = new String(example);//str3
        
        String str = new String();        
        str = "1 2 3 4 5 HELLO";
        String str2 = "Hello";
        String str3 = "Helloe3333333333333333333333333333";               
        String str4 = "Hello there";
        System.out.println("Strings:\n1. "+str+"\n2. "+str2+"\n3. "+str3+"\n4. "+str4+"\n");
        
                       
        
        //String Functions
        
        
        //------sting.equals(string)----------
        //Checks if two strings are equal
        System.out.println("Is 1 the same as 2? Answer: "+str.equals(str2));  //false
        System.out.println("Is 2 the same as 3? Answer: "+str2.equals(str3)); //true
                
        System.out.println("\n");
        
        
        //------Length----------------- ;)
        System.out.println("How big is 1: "+str.length());
        System.out.println("How big is 3: "+str3.length());
        
        
        System.out.println("\n");
        
        
        //------Returns character looking at specified character index------------
        System.out.println("What is the character for 1 at index 0?: "+str.charAt(0));
        
        
        System.out.println("\n");
        
                
        //------Compares characters, returns number depending on which string is bigger----------
        //a.compareTo(b)                
        //- means a < b
        //+ means a > b
        //0 means a == b
        System.out.println(str.compareTo(str2));              
        
        
        //-----indexOf, searches a string using a string, returns index when first used, -1 on fail----
        //             12345678901234
        String str5 = "One two three four five six";
        System.out.println("What index does the string \"four\" appear in for str5? "+ str5.indexOf("four") );
       
        //----lastIndexOf(str),  searches a string using a string, returns index of when its last used, -1 on fail----
        String str6 = "One two three four five One";
        System.out.println("What index does the string \"One\" appear in for str6? "+ str6.lastIndexOf("One") );
        
        
        //----SubString, takes a part of a string from a starting point -> end point
        String original = "I don't think I am a string!";
        String new_String = original.substring(14,original.length());
        System.out.println(new_String); //I am a string!
                                                      
    }
    
    
    void string_Arrays()
    {
        //Array of Strings
        String [] string_Array = {"This","is","not a","test","four","Really long string that has a random work like beans in it"};
        for (String s: string_Array)
        {
            System.out.println(s.indexOf("beans"));            
            if(s.indexOf("beans")>=0)           //searches a string using a string, returns index when first used, -1 on fail  
            {
                System.out.println("FOUND \"beans\"");            
                break;
            }
            
        }
        string_Array[3] = "stop"; //change the 4th string
        for (String s:string_Array)
            System.out.println(s); //print out array of strings
            
    }
    
    
    
    //ONLY USE STRINGS IN A SWTICH IF THE SELECTION YOU ARE GETTING IS A STRING. OTHERWISE, USE NUMBERS. Its more effecient!
    void switch_Statement_Stings()
    {
        String choice = "dance";
        
        switch(choice)
        {
            case "connect":
                System.out.println("CONNECTING");
                break;
            case "dance":
                System.out.println("DANCING");
            default:
                break;
        }
            
    }
    
}







//---------------------------------------------------------------------------------------------------------------------------------------------------
//PART NINE - Inference Variables
//A variable whose type is infered by the compiler
//Honestly, it looks like the main reason to use it is to make things shorter?

class type_Inference_Variables
{
    void using_Var_Variable()
    {
        var example1 = 12.3323;
             
        //var arrays NEVER HAVE brackets on right side
        //var [] example2_1 = new int[10];
        //var example2_2 []= new int[10];
        var example2 = new int[10];
        
        
        //var in loops
        for (var x = 1.0; x < 4.0; x*=2) break;
        
        int [] array = {1,2,3};        
        for (var x:array) break;
        
        
        
        //Both are the same, but one is shorter
        //really_Long_Class_Name_That_Takes_Up_A_Lot_Of_Space_LOL newClass = new really_Long_Class_Name_That_Takes_Up_A_Lot_Of_Space_LOL();
        var newClass = new really_Long_Class_Name_That_Takes_Up_A_Lot_Of_Space_LOL();
        
        
        
        //RESTRICTIONS
        //var myArray = {1,2,3}; //cant use var as an array initializer
        //var notNull = null //cant use null
        //var x,y = 1;//ONLY 1 variable can be declared at a time                        
    }
    
}

class really_Long_Class_Name_That_Takes_Up_A_Lot_Of_Space_LOL
{
                               //HADOKEN
    /*
    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⣴⣶⣿⣿⣿⣿⣿⣶⣤⣄⣀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⡿⠛⣿⣿⡿⢻⣿⡿⠿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⣹⣿⣟⣸⣟⣀⠠⠿⣥⣤⣾⣿⡀⠀⠈⢻⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢻⣿⣿⡋⠀⣠⣴⣾⣿⣯⣁⠈⠻⣷⣤⡀⣉⢿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⢿⣿⣿⡆⠈⠙⠿⣿⠓⠛⠃⠀⢹⡿⢫⠾⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣻⠃⠀⠀⠀⠈⠀⠀⠀⠀⠈⠁⣻⣷⣽⣷⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⡶⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⠏⠌⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⡥⠤⢄⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⠀⠐⠘⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣿⣿⣷⡀⠀⠀⠀⠀⢀⣴⣿⣿⠟⠸⢿⠀⢠⡇⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣧⣀⣀⣠⣶⣿⣿⣿⡏⠀⠀⢸⣴⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⢬⣿⣶⣦⣀⡀⢀⣀⠸⢷⡶⢦⣴⣶⣿⣷⣿⣿⣿⣿⣿⡟⠿⣿⣿⣿⣿⣿⣿⣿⢻⡇⠀⠀⣞⢿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣾⣿⣷⣿⣶⣍⢈⢻⣿⡿⣌⠙⠻⣕⠈⠐⠌⠻⢿⣿⣿⣿⠇⢸⡇⠀⠀⣿⣷⣍⠢⣀⣀⣀⡠⡇⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠰⠾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠷⡈⠳⣄⠈⠳⣤⡀⠀⠀⠙⣿⣿⣆⢸⡇⢀⠀⣿⣿⣿⣷⣌⢆⡑⠤⣌⣉⠁⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣠⣤⣿⣿⣿⣿⡿⠛⠉⠙⠻⢿⣿⣿⣶⣄⠀⠀⠀⠈⠳⣦⡈⢻⡂⡀⠀⠘⠿⣿⣿⣇⣸⣾⣿⣿⣿⣿⣿⣧⡹⣦⠘⢿⣧⡀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠐⣲⣽⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠈⠉⠙⠛⢷⣤⡀⠀⠀⠀⠘⢿⡄⠹⣮⡢⡀⠀⠈⠻⣿⣿⠉⠉⠉⠉⠙⠻⣿⣷⡸⣧⠈⢤⡑⠌⠙⠓⣾⡀⠀⠀⠀⠀⠀
⠀⠀⠀⣽⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⢛⣿⣠⠀⠀⠀⠈⢷⠀⠸⡟⢌⢀⠀⠀⠈⢿⠋⠁⠀⠀⠀⠀⢼⣿⣇⠹⡄⠀⠙⠂⠸⢝⡋⢿⢆⠀⠀⠀⠀
⠀⠀⢼⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⡀⠀⠀⠀⠀⠀⢉⣿⣿⠀⠀⠀⠀⠈⠀⠀⢳⠀⠣⡠⠀⠀⢀⢳⠀⠀⠀⠀⠀⠀⢹⣿⡄⠷⠀⠀⠀⠀⢠⣵⠈⠎⢆⠀⠀⠀
⠀⠘⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣠⣾⣧⠀⠀⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⡄⠀⣷⡀⠱⡡⠀⠀⢀⢡⠀⠀⠀⠀⠀⠀⢿⣇⠰⠀⠀⠀⢻⡌⢿⡄⠀⠘⡆⠀⠀
⠀⢀⣴⣿⣿⣿⣿⣿⡿⠻⢿⣿⣿⣿⣿⣦⣤⣀⣤⣾⣿⣯⣤⣤⡀⠀⠀⢀⣤⣷⠀⠸⣷⠀⢣⠱⡀⠀⢃⢣⠄⠀⠀⠀⠀⣸⣿⠀⡇⠀⠀⠀⢻⣾⢷⣄⠀⣷⡀⠀
⣶⣿⣿⣿⣿⣿⣿⠋⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⢀⣿⣿⠇⠀⠀⢿⡇⠘⣧⠰⠀⠀⢂⢧⠀⠀⠀⠙⣿⣿⠀⢸⠀⠀⠀⠀⢿⣿⣿⣇⡿⢷⡀
⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠈⣿⢿⣿⣿⣿⣿⣿⣿⣿⡿⠃⢀⣀⣴⣿⣿⠏⠀⠀⠀⢸⡇⠀⢻⢁⢡⠀⠈⠌⢆⠀⢀⣴⣿⣿⡇⠘⡀⠀⠀⠀⠘⣿⣿⣿⡇⠀⢳
⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⢼⠁⠀⠘⠀⠂⢂⠀⠈⡘⣾⣿⣿⣿⣿⡇⠀⡇⠀⠀⢸⣤⣿⣿⣿⣇⠀⠈
⢸⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⣀⠀⢰⣿⡿⢿⢿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠁⠀⠀⠀⡆⠘⠈⡄⠀⠰⠹⣿⣿⣿⣿⠇⠀⠃⠀⠀⢸⣿⡟⡟⠙⣿⠀⠀
⠀⣿⣿⣿⣿⣿⣷⣠⣶⠀⠀⠰⣿⣤⣿⡿⠁⠀⣾⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠃⠰⠀⠀⢁⢹⣿⣿⣿⠀⠀⢰⣤⣴⣾⣿⡇⢃⠀⠈⠀⠀
⢀⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢀⣿⣿⡿⠁⠀⢰⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠀⠀⡇⠀⠸⠀⠆⠀⠈⡄⢻⣿⡿⠀⠀⠊⣿⣿⣿⣿⣿⠸⠀⠀⠀⠀
⢸⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢸⣿⣿⠁⠀⡄⣾⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⢀⣴⡇⠀⠀⡇⠀⠀⠃⠘⠀⠀⢰⠸⣿⡇⠀⠀⣤⣿⣿⣿⣿⣿⣧⣇⠀⢀⡀
⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢸⣿⣿⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣄⣀⣠⣴⣿⡿⠀⠀⠀⣷⠀⠀⢸⠀⡆⠀⠀⡆⡿⠀⠀⢸⣿⣿⡿⠋⠉⢿⣿⣿⣶⣾⣇
⢻⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⣿⠀⠀⠀⡆⠡⠀⠀⣱⠇⠀⠀⣾⣿⡇⠀⠀⠀⠈⣿⣿⣿⣿⣿
    */
}







//---------------------------------------------------------------------------------------------------------------------------------------------------
//PART TEN - Operators
//For A LOT more info, check Page 172 

class operators_Class
{
    void using_Operators()
    {
        //Turning lowercase character into Uppercase using AND
        char lowerCase = 'a';    
        char upperCase = (char)((int)lowerCase & 65503);       
        System.out.println(upperCase);                
    }            
}



//---------------------------------------------------------------------------------------------------------------------------------------------------
//PART 11 - ?
//??????????????????????
/*

????????            
??    ???
     ????                   
    ??
    ??
    
    ??                                 


*/
class question_Mark_Class
{    
    int x, result;
    
    question_Mark_Class()
    {
        x = 0;
        result = 0;
    }
    
    
    //This method always sets 'x' to a postive value and stores it into result
    void question_Mark_Method()
    {        
        x = -4;
    
        System.out.println("This is X:" +x+ "\nThis is result: "+result);
        if (x < 0)
            result = -x;
        else
            result = x;

        //==SAME AS==

        result = (x < 0) ? -x : x;
        System.out.println("This is X:" +x+ "\nThis is result: "+result);
    }

    
}














//This example uses arrays to demonstrate the bubble sort
class bubble_Sort_Example_Class
{                    
    /*
    It works by grabbing the first element in the array...
        { 13   ,   5342    ,   2    ,  332}           
          /\ 
          ||    
    ...and comparing that number to EVERY single element until it reaches the end!                
    Once that's done, it moves onto the next element and repeats the process until it finishes. 
        { --   ,   5342    ,   2    ,  332}           
                    /\ 
                    ||        
    Once an element has been compared, bubble sort no longer compares them in future comparisons.
    Kinda obs when you think about it.
    
    */

    void bubble_Sort_Method() 
    {
        int nums[] = {1,2,32,4,3,65132,2,-2};
        int a,b,t;
        
        //Set the size of the array 
        int size = nums.length;        
       
        
        
        
        //Original array
        System.out.println("Original array is: ");
        for (int i = 0; i < size;i++)
        {
            System.out.println(" " +nums[i]);
        }
        
        
        
        System.out.println("");
    
        
        
        //The bubble sort 
        for(a=1; a < size; a++)
        {
            for (b = size - 1;b >= a; b-- )
            {
                if (nums[b-1] > nums [b])
                {
                    t = nums[b-1];
                    nums[b-1] = nums [b];
                    nums[b] = t;
                }
            }

        }                
                
        //Display sorted array
        System.out.println("Sorted array is: ");
        for (int i = 0; i < size;i++)
        {
            System.out.println(" " +nums[i]);
        }
              
        
        
        
    }           
}

    

public class Chapter_5 
{
            
    public static void main(String[] args) 
    {
        
        
        //Check top of project on how to set cmd line arguments 
        //System.out.println("ARGS: "+args[0]);
        
        String msg = "asd";
        msg = "STOP";
        System.out.println("msg= "+msg);
        
        
       //*******Array Structure Class******************
       arrays_Structures runProgram1 = new arrays_Structures();
       //runProgram1.create_Array();                  
       //runProgram1.manipulating_Arrays();
       //runProgram1.array_Length();
       
       
       //*******Queue Example**************************                                          PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!! PART SIX!!
       queue_Example_Data_Input runProgram2 = new queue_Example_Data_Input();
       //runProgram2.main(null);
       
       
       ////*******For Each Loop************************
       for_Each_Loops runProgram3 = new for_Each_Loops();
       //runProgram3.regular_For_Loops();
       //runProgram3.for_Each_Loop();
       
       
       
       ////*******Strings Example**********************
       strings_Example runProgram4 = new strings_Example();
       //runProgram4.using_Strings();
       //runProgram4.string_Arrays();
       
       
       
       ////******?????????????????????**********************       
       var runProgram5 = new question_Mark_Class();
       //runProgram5.question_Mark_Method();
              
       
       
       
       //*******The Bubble Sort Example Class**********
       bubble_Sort_Example_Class runProgram6 = new bubble_Sort_Example_Class();
       //runProgram2.bubble_Sort_Method();                
    }
}

