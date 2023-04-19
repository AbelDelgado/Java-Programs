
class Chapter_4 
{                                    
    public static void main(String args[])
    {
        //Results for the .THIS example
        testing_Without_This object1 = new testing_Without_This();
        object1.setData(3, 5);
        object1.showData(); //Despite entering a 3 and 5, the reults show 0
        
        testing_Using_This object2 = new testing_Using_This();
        object2.setData(3, 5);
        object2.showData(); //The compiler now knows that 
        
        
        
        
        //Results for the "Returning a double to a variable expecting an int"
        //Test to see what happens if a method that returns an int gets assigned to a variable with type int (IT FAILS)
        casting_Double_To_Int test = new casting_Double_To_Int();
        int x = 0;
        // x = (test.returnDoubleValue(7);  FAILS because the return is a double, and you can't put that into an int
     
        //System.out.println(test.returnDoubleValue(7));
    }                  
}

       

//Example from https://www.guru99.com/java-this-keyword.html
//.this Example
class testing_Without_This
{    
    int a;
    int b;

    public void setData(int a ,int b)
    {
        a = a;
        b = b;
    }
    public void showData()
    {
        System.out.println("Value of A ="+a);
        System.out.println("");
        System.out.println("Value of B ="+b);
    }       
   
}

class testing_Using_This
{
    int a;
    int b;

    public void setData(int a ,int b)
    {
        this.a = a;
        this.b = b;
    }
    public void showData()
    {
        System.out.println("Value of A ="+a);
        System.out.println("");
        System.out.println("Value of B ="+b);
    }    
}








//Returning a double to a variable expecting an int
//Test to see what happens if a method that returns an int gets assigned to a variable with type int (IT FAILS)
class casting_Double_To_Int
{
    double returnDoubleValue(int y)
    {
        return (double) (y /= 3.0);
    }
    
}



class chapter4_data 
{
    
    
    
    
    
    
    //Creating Objects
    void creating_Objects()
    {
        
    
        Chapter_4 newObject = new Chapter_4();
        
        //Same as above. 
        // TYPE         VAR NAME
        //   int            x; 
        // Chapter_4    newObject;
        
        //Chapter_4 newObject;            //creates a REFERENCE to an object. newObject will never actually be an object, but will just be a REFERENCE. This is like other variables you create
        //newObject = new Chapter_4();    //FIRST, this creates a new Chapter_4 object, and THEN it assigns its reference to the newObject variable
        
        newObject.x = 5;        
                        
        Chapter_4 newObject2 = new Chapter_4();
        Chapter_4 newObject3 = new Chapter_4();
        
        newObject2 = newObject3;         //newObject2 will now directly affect newObject3, which is different from how other variables act. Both variables refer to the same object.                
    }
    
    
    //You can create a method with a return type of the class you created!
    Chapter_4 methods_With_Custom_Object_Type()
    {
        Chapter_4 newObject4 = new Chapter_4();
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
        Chapter_4 newObject5 = new Chapter_4();
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


