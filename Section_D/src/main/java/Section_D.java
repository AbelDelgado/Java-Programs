//This file has 2 MAINs
//Select which section you want to run (Section_D or Constructor_Main) using the project properties to set a MAIN CLASS

class Section_D 
{                            
    int x = 0;
    
    
    
    public static void main(String args[])
    {
        
        
        //Results for the .THIS example
        testing_Without_This object1 = new testing_Without_This();
        object1.setData(3, 5);
        object1.showData(); //Despite entering a 3 and 5, the reults show 0
        
        testing_Using_This object2 = new testing_Using_This();
        object2.setData(3, 5);
        object2.showData(); //The compiler now knows that 
       
        
        
        
        
        
        
    }
    
    
    
    //used in returning_With_Values method bellow
    int range()
    {
       return 1; 
    }
}

       





//==========================  .this  =====================================     
//  Example from https://www.guru99.com/java-this-keyword.html

//Using .this lets you select the variable from within the class
//This lets set a variable in the class with another parameter with the same name 



class testing_Without_This
{    
    int a;           //#1. We want to set these variables to 3 and 5 respectively
    int b;  

    public void setData(int a ,int b)
    {
        a = a;       //#2. However, since the variables have the same name, this section does NOT 
        b = b;       //    assign the variables in #1. Instead, it uses the parameter varibles.
    }
    public void showData()
    {
        System.out.println("---NOT USING .THIS--------");
        System.out.println("Value of A ="+a);       //#3. Since this class variable were never assigned, these      
        System.out.println("Value of B ="+b);       //    return 0.
    }       
   
}

class testing_Using_This
{
    int a;              //Class variables!
    int b;

    public void setData(int a ,int b)
    {
        this.a = a;                 //.this lets us assign the class variables and not the parameter ones
        this.b = b;                
    }
    public void showData()
    {
        System.out.println("------USING .THIS--------");
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }    
}







 //==========================  Creating objects =====================================          

class chapter4_data 
{
                        
    //Creating Objects
    void creating_Objects()
    {
        
        //While Section_D has no actual methods to use, it does have a single variable x that we can access
        Section_D newObject = new Section_D();
        
        //Same as above. 
        // TYPE         VAR NAME
        //   int            x; 
        // Section_D    newObject;
        
        //Chapter_4 newObject;            //creates a REFERENCE to an object. newObject will never actually be an object, but will just be a REFERENCE. This is like other variables you create
        //newObject = new Section_D();    //FIRST, this creates a new Section_D object, and THEN it assigns its reference to the newObject variable
        
        newObject.x = 5;        
                        
        Section_D newObject2 = new Section_D();
        Section_D newObject3 = new Section_D();
        
        newObject2 = newObject3;         //newObject2 will now directly affect newObject3, which is different from how other variables act. Both variables refer to the same object.                
    }
    
    
    //You can create a method with a return type of the class you created!
    Section_D methods_With_Custom_Object_Type()
    {
        Section_D newObject4 = new Section_D();
        return newObject4;
    }
     
    
    //Doesn't have to have a return. The return statement here just goes back to whatever called it with NADA
    void returning_Method_With_Void_Type()
    {        
        return;
    }
    
    //Receiving a value from a method
    void returning_With_Values()
    {
        Section_D newObject5 = new Section_D();
        int x = newObject5.range();
    }
    
    //This is how a method accepts parameters 
    void method_With_Parameters(int a, int b)
    {
        a *= 3;
        b = a/b;
        if (a < 3)
            return;
        else 
            System.out.println("loll");
    }    
    void method_Sending_Parameters()
    {
        method_With_Parameters(6,3);
    }
                                       
    
 
        
}





//==========================  Constructors =====================================          
//When you have a class and are going to make objects from it, you can save a lot of time by having it create / set variables up for you



class constructor_Example
{
    int x = 0;
    constructor_Example()
    {
        x = 10;
    }
    
    
    //Overloading (seen in Section F)
    //When you have the same name as the previous constructor, BUT it's looking for a variable
    //By default, it will use the constructor above. If you create an object with an int in the parameter, it will come here
    
    constructor_Example(int i) 
    {
        x = i;
    }
    
    
    
}

class constructor_Main
{
    public static void main(String[] args) 
    {
        
        
        constructor_Example object = new constructor_Example();
        System.out.println(object.x);
        
        
        constructor_Example object2 = new constructor_Example();
        object2.x = 3;       //X will now be set to 3, BUT ONLY for this object. Other objects will be set to 10
        System.out.println(object2.x);
        
        constructor_Example object_With_Parameter = new constructor_Example(2);
        System.out.println(object_With_Parameter.x);
    }
}
