package Enumeration;


//pg 427
//Enum constants are OBJECTS (of type whatever you defined)
//That means that they can have methods, constructors, instance variables
//cant be superclass(and thus cannot be extended, and cannot inherit

enum Transport_Part_C
{
    //These numbers are the arguments for the constructor, and each enumeration constant will have their own value associated with it
    CAR(65),TRUCK(55),AIRPLANE(600), TRAIN(70), BOAT(22); //ends with ; if you have other things in this enumeration block
    
    
    

    //Each enumeration constant has it's own value that is different from the others, which is initialized in the constructor
    private int speed;
    
    
    
    //This constructor is called every time an Enumeration variable is created
    Transport_Part_C (int s) { speed = s;}
    
    
    
    //Each enumeration constant can use this method
    int getSpeed() { return speed; }
    
    
}

public class Part_C_Enumeration_Class_Behaviour 
{
    public static void main (String[] args)
    {
        Transport_Part_A tp; //OBJECT (even though it looks like a primitive type)
        
        //Display number associated with airplane
        System.out.println("AIRPLANE numeration value is: " +Transport_Part_C.AIRPLANE.getSpeed());
        
        //Display ALL enumeration constants
        for (Transport_Part_C t : Transport_Part_C.values())        
            System.out.println(t + " has a value of " +t.getSpeed());

            
    }
}
