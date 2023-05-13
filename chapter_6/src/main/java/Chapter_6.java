/*

Package are groups of classes
PRESS CTRL + ? to instantly make a comment! OMG
//
//
//
//
SHIFT + DEL COPYS LINE AND THEN DELETES IT
*/



//--------------------Part 1 - Access Modifiers------------------------------------------------------
//PUBLIC - can be accessed by code outside of class, default setting
//PRIVATE - only methods inside class

class access_Modifiers
{
    
    public int x = 0;
    private int y = 0;
    private int [] array;
    
    
    public access_Modifiers(int size)
    {
        array = new int[size];        
    }
    
    public void method1(int index,int value_Entered_Into_Index)
    {        
        if(!check_If_Valid(index))
        {
            return;
        }
        else
        {
            array[index] = value_Entered_Into_Index;
        }                                                
    }
    
    
    private boolean check_If_Valid(int index)
    {
        if (index >array.length || index < 0)
            return false;
        else return true;
    }
    
    
    
    private void method2()
    {
        System.out.print("HELLO");
    }
    
}


class access_Modifiers_Methods
{
    
    void method1()
    {
        var runProg1 = new access_Modifiers(5);
        runProg1.x = 0;
        runProg1.method1(0, 5);
        //runProg1.y = 0;                   //ERROR, cannot access private member if not in same class
        //runProg1.method2();               //ERROR, cannot run private method if not in same class
    }
    
}






//--------------------Part 2 - Call by reference/value ------------------------------------------------------
//Call by value = method DOES NOT affect variable (Primitive types like ints)
//Call by reference = method CAN affect variable (Objects)


class methods_Looking_For_Objects
{
    int a,b;
    
    public methods_Looking_For_Objects(int x,int y)
    {
        a = x;
        b = y;
    }
    
    
    void call_By_Reference(methods_Looking_For_Objects z)
    {
        System.out.println("Look at object that called the method: "+a);  //prints out the values for X
        System.out.println("Look at object that called the method: "+b);  //prints out the values for X
        
        System.out.println("Object that was passed: "+z.a);  //prints out the values for Y
        System.out.println("Object that was passed: "+z.b);  //prints out the values for Y
    }                     
    
    int call_By_Value(int i)
    {
        int l = 1000;
        i += l;
        return i;
    }
    
}


class passing_Objects_To_Methods_Main
{
    public static void main (String[] args)
    {
        int i = 0;
        
        var x = new methods_Looking_For_Objects(1,2); 
        var y = new methods_Looking_For_Objects(3,4);
        x.call_By_Reference(y); //call by reference because the object Y will be modified 
        x.call_By_Value(i);       //call by value because i will NOT be modified
        
    }
}


//--------------------Part 3 - Initializing Objects with Methods via call by reference------------------------------------------------------
//Before you actaully initialize an object, you can send it uninitalized to a method, and have that method
//initialize it for you. This is due to call by reference.



class modify_Object
{
    public static void main (String [] args)
    {
        creating_Object the_Object;                                                     //Step 1 - create an initialized object
        populate_Object object_To_Use_Method = new populate_Object();                   //Step 2 - create another object that will return the modified object 
        
        the_Object = object_To_Use_Method.method_Initalize_Object(1,"TEST");  //Step 3 - assign the object the initialized value  
    }
}


class creating_Object
{
    int result = 0;
    String messsge;
    
    creating_Object(int number, String response)
    {
        result = number;
        messsge = response;
    }
    
}


class populate_Object
{
    creating_Object method_Initalize_Object(int number, String text)
    {
        return new creating_Object(number,text);                                //KEY TAKEAWAY: you can initialize objects like this / objects can be modified by methods
    }
    
}







//--------------------Part 4 - Overloading------------------------------------------------------
//A class can have two methods and constructors with the same name as long as their parameters are different
//How java supports polymorphism
//Signature = name of method + params

class overload_Methods
{
    
    
    //Overloading Contructors
    int x = 0;
    
    overload_Methods(int x)
    {        
        x = (int) Math.random();        
    }
    
    overload_Methods(overload_Methods obj)  //you can send an object here (that has already been initialized) to have its x to become the new value 
    {
        x = obj.x;                          
    }        
    //overload_Methods prog1 = new overload_Methods(5); //calls the first version
    //overload_Methods prog2 = new overload_Methods(prog1); //calls the second version, which gives it's x the same value
    
    
    
    
    
    
    
    //Overloading Methods    
    void method1()
    {
        
    }
    
    void method1(int i)
    {
        i = 0;
    }
    
    int method2()
    {
        return 0;
    }
    
    /*
    double method2()      //return value being different is NOT enough
    {
        return 3.0;
    }
    */
    
            
    
    
    
    
    //Automatic Type Conversions    
    //If there is a method that matches the parameter type being used, it will always go to that one first
    //Otherwise, it will go to the next best thing if possible
    
    void auto_Conversion()
    {
        //these will all be converted int INTS
        int a = 10;
        byte b = 3;
        short c = 3;        
        ints_Only(a);
        ints_Only(b);
        ints_Only(c);
        
        
        //These will be converted into DOUBLES
        float d = 32;
        double e = 100.2;                    
        ints_Only(d);
        ints_Only(e);
    }
    
    
            
    void ints_Only (int x)
    {
        System.out.println("The value of x is " +x);
    }         
    void ints_Only (double x)
    {
        System.out.println("The value of x is " +x);
    }     
    
}




//--------------------Part 5 - Recursion------------------------------------------------------
//used because apparently some algorithms are more clear using this WOW 

//The classic Factorial (5 -> 5*4*3*2*1)

class recursion_Example
{
    int factorial_Recursion (int number)
    {
        int result = 1;                                        
        if (number == 1) return 1;      //EXIT STATMENT + if use enters 1, it returns 1 
        
        result = factorial_Recursion(number-1) * number;      // result = factorial (4) * 5  ->  ( (factorial (3) * 4) * 5)  ->  ( (factorial(2) * 3) * 4) * 5) ->  ( (1) *2) * 3) * 4) * 5)
        return result;
        
    }
    
    //LOL THIS IS THE SAME THING, kinda...
    int factorial_Iteration (int number)
    {            
        int result = 1;
        if (number == 1) return 1;
        
        for (int i = number; i > 0; i--)
        {
            result = result * i;
        }         
        return result;
        
    }
    
}





//--------------------Part 6 - Static------------------------------------------------------
//Static Variable: global variable that can be shared with every object 
//Static Method: 
//1. Must be called with CLASS_NAME.METHOD_NAME (no object required)
//2. Can only call other static methods in its class
//3. Can only access static variables
//4. Do not use ".this" reference
//Static Blocks: Will always run first before anything else when class is loaded


class static_Class
{
    static int count = 0;      
    int x = 0;
    
    
        
    
    private static void the_Static_Method(int number2) 
    {
        //x = 3;            //cant use non static variables
        //test1();          //cant use non static methods
        number2 = 0;
        
    }
    
    
    //This is really only used as a test. Trying to see if a variable can be modifed from outside this class
    static void call_the_Static_Method(int number1)
    {
        the_Static_Method(number1);
    }
    
    
    void static_Variable()
    {
        //doesnt matter which object calls this, they will all share the same count
        count = 100;
    }
          
          
    //static block will always be the first thing to run
    static
    {
        System.out.println("THIS WILL RUN FIRST");
        count = 0;
    }
    
    
}

class using_Static
{
    void method()
    {
        var obj1 = new static_Class();
        var obj2 = new static_Class();
        
        obj1.count = 5;        
        System.out.println(obj2.count); //all objects share the same static variable
        
        int number = 3;
        static_Class.call_the_Static_Method(number); //note how the static methods is called
        System.out.println(number);                 //NUMBER WAS NOT CHANGED
    }
}








//--------------------Part 7 - THE QUICKSORT------------------------------------------------------
//Aruguably the best general purpose sort out there!!! :O
/*
             The Original Arrays           
    f g e c a d b            10 32 2 6 14 44



1. Select a comparand. The value with the most middle value is the best option, but you can usually jsut select the middle value in the array

                   Comparand
    f g e c a (d) b            10 32 2 6 (14) 44



2. Split array into 2. All values greater than/equal to the comprand on one side, and those lower on the left
    
                   Split Arrays
    f g e -- a c (d) b            10 2 6 -- (14) 44 32




*/


class quickSort_Example
{
            
    static void call_Quick_Sort(char array[])
    {                
        quick_Sort(array,0,array.length-1);
    }
            
    private static void quick_Sort(char[] array, int starting, int last)
    {
        
        char middle_Value = array[(starting+last)/2];  //middle of array for comparand, MAKE SURE THE BRACKETS ARE AROUND THE START+LAST ONLY. If 2 is included, it divides last and 2
        int iterator_first_element = starting;                       //start at first element (array[0])
        int iterator_last_element = last;
        char character_holder;
        
        //                     0   1   2   3   4   5   6   7
        //1. char [] array = {'a','q','d','e','n','f','z','r'};
        //2. char [] array = {'a','q','d','e','n','f','z','r'};
        do
        {
            //Starting from the first element, if that element is less than the comparand AND isn't at the end, go to the next element
            //When it does find a number greater than it, it will stop the loop and HOLD the array element number
            while((array[iterator_first_element] < middle_Value) && (iterator_first_element < last)) iterator_first_element++;   
            
            
            //Starting from the last element, if that element is greater than the comparand AND isn't at the start, go to the next element
            //When it does find a number less than it, it will stop the loop and HOLD the array element number
            while((middle_Value < array[iterator_last_element]) && (iterator_last_element > starting)) iterator_last_element--;        
            
            
            
            //Swaps the elements from the loops above, the proceeds to the next elements
            if (iterator_first_element <= iterator_last_element)                //as long as the search coming from the left isn't the same value as the search coming from the right. If it was, leave this alone
            {
                character_holder = array[iterator_first_element];
                array[iterator_first_element] = array[iterator_last_element];
                array[iterator_last_element] = character_holder;
                
                iterator_first_element++;
                iterator_last_element--;
                
            }
            
        }while (iterator_first_element <= iterator_last_element);           //This will quit ONLY when search coming from left is PAST the right
            
        
        /*
        
          0   1   2   3   4   5   6   7
        {'a','q','d','e','n','f','z','r'};
        
        comparand = 3 (e)        
        iterator_first_element = 1 (q)
        iterator_last_element  = 3 (e)
        SWAP ++ --      
        
          0   1   2   3   4   5   6   7
        {'a','e','d','q','n','f','z','r'};
        
        
        iterator_first_element = 2 (e)
        iterator_last_element  = 2 (e)        
        DO NOTHING  
        
         0   1   2   3   4   5   6   7
        {'a','e','d','q','n','f','z','r'};
        
                */

        //half from the left
        if(starting < iterator_last_element)  quick_Sort(array, starting, iterator_last_element);
        /*
         0   1   2   3   4   5   6   7
        {'a','e','d','q','n','f','z','r'};
        iterator_first_element = 2 (e)        
        iterator_last_element  = 2 (e)
        */
        
        //half from the right
        if(iterator_first_element < last ) quick_Sort(array, iterator_first_element, last);
        
        
    }          
    
}
        








        
//--------------------Part 8 - Nested Classes------------------------------------------------------
//A nested class only exsists inside another class
//The inner class can only access varibles  the outer class has within METHODS!!!!!!!!!!!!!!!!!!!!!!


class nested_Classes_Example1
{
    int x = 0;
    
    void test()
    {
        var prog = new inner_Class();
        prog.method();               
        //y = 3;  //error, cannot access an inner class var without creating the object
    }
            
    class inner_Class
    {
        int y = 30;
        //x = 33; //ERROR, cant access outter class var unless in method
        void method()
        {
            x = 3;                                                
        }        
    }    
    
    
    
}
    

//A class within a block (in this case, a main block)
class nested_Classes_Example2
{
    public static void main (String [] args)
    {
        class inner_Class
        {
            int x = 0;
            
            inner_Class(int number)
            {
                x = number;
            }
                    
            void method()
            {
                System.out.println("Gordon doesn't need to hear all this.");
            }
        }
        //end of class

        var prog1 = new inner_Class(3);
        prog1.method();
        
    }
}

//Can I access the class above if its in a main
class  nested_Classes_Example2_TEST
{
    void method1()
    {
//        var prog1 = new inner_Class(); //ERROR, doesn't exsist outside of its outer class
    }
}
      




//--------------------Part 9 - VarArgs (Variable length arguments = If you don't know many arguments you are expecting!)------------------
//So far, if you know how many arguments are needed beforehand, you can create a method with a set number of parameters or overload methods
//The next was to use an array and store all the arguments in there, and send that array to a method
//Those weren't that great, so lets use varargs which can take 0 or more arguments! 
//it really is an array, just shown differently


    

class varargs_example
{
    
    //accessing varargs is like accessing an array
    void varags(int ... v)
    {
        for (int i = 0; i < v.length; i++)
            System.out.println(v[i]);
    }
    
   
    void using_Varargs()
    {                
        //overloading / extra arrays uneeded!
        varags(1,2);
        varags(3,15,4);
        varags();
    }
           
    
    //can also start with normal params, but MUST end with the varargs and CANT HAVE MORE THAN 1 ...
    void varargs2(String message, int ... v)
    {
        System.out.println(message);
        
    }
    
    void using_varargs2()
    {
        varargs2("HELLO",1,2,34);
    }
    
    
    //Overloading works just as you would expect it to
    
    void overloading_Varargs()
    {}
    
    //Java uses type difference to determine which method is being called
    void overloading_Varargs(int... x)
    {}
    void overloading_Varargs(boolean ... x)
    {}
    
    
    //it takes the first 2 bools, then the rest are put into z
    void overloading_Varargs(boolean x, boolean y, boolean ... z)
    {}
    
    
    //----------------Ambiguous ERRORS------------------------------
    //calling a method with no params WITH NO METHOD to handle an empty param
    /*
    overloading_Varargs(3,3); //OK
    overloading_Varargs();    //ERROR, no method can handle this            
    */
    
    
    
    //If you use 1 argument, the compile doesn't know which method you are looking for
    //overloading_Varargs(3);
    void overloading_Varargs2 (int x, int ... y)        //could just be x = 3, y = nada
    {}
    void overloading_Varargs2 (int ... x)               //could be x = 3, and nothing else
    {}
    
    
    
    
    
    
    

    
}










public class Chapter_6 
{

    public static void main(String[] args) 
    {
                
        
        var runProgram1 = new passing_Objects_To_Methods_Main();
        //runProgram1.main(null);
        
               
        var runProgram2 = new modify_Object();
        //runProgram2.main(null);
        
        
        var runProgram3 = new recursion_Example();
        //System.out.println(runProgram3.factorial_Iteration(2));
        //System.out.println(runProgram3.factorial_Recursion(2));
        
        
        
        var runProgram4 = new using_Static();       
        //int number = 5;
        //static_Class.call_the_Static_Method(number);  //number was NOT changed 
        //System.out.println(number);
        //runProgram4.method();
        
        
            
        
        //Remember, creating arrays = creating objects 
        //So when you send an array in this quicksort example, it will be modified due to call by reference
        //If you were to send a primitive, it would NOT be modified
        char [] array = {'a','q','d','e','n','f','z','r'};        
        char [] array2 = {'z','q','d','a','x','f','s','r'};
        
        quickSort_Example.call_Quick_Sort(array);
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" "+array[i]);
        }
        
        
    }
}
