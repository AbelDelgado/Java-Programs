/*
Inhertitance - create a general class that other classes can use
Superclass - when a class gets inheritied, that class is a SUPER CLASS (top of the order)
Subclass - the class that imports another class, has all variables and methods of superclass

CTRL + SPACE = let netbeans try to AUTOFILL YOUR REQUUEST

typing "sout" and then pressing tab creates a 
System.out.println("");
(only where aplicable)



CTRL + UP / DOWN = scroll up or down


CTRL + SHIFT + UP = duplicate line AND paste below


CTRL + CLICK CLASS = takes you to that class

*/








//---------------------Part 1 - Inheritance------------------------------------ 
//Inheritance lets you export methods / variables to another class
//Private variables/methods are still locked to the single class that contains it
//What if both Super and sub classes have constructors? Which is used when an object is made?

//the SUPER keyword was always entered by default when extending classes, but you can explicity use it if superclass has paramters





class the_Super_Class
{
    //The super class SHOULD have private variables
    //They shouldn't really needed to be accessed outside without methods
    
    private double result;
    private double height;       
    private double width;
    private String style; 
    
    void showVariables()
    {
        System.out.println("");
        System.out.println(height);
        System.out.println(width);                        
    }
    
    double showResult()
    {
        result = height * width;
        return result;                
    }
    
    void setWidth(double w){  width = w;}        
    void setHeight(double h){ height = h;}
    
    double getWidth(){  return width;}        
    double getHeight(){ return height;}
    
        
}

class the_Sub_Class extends the_Super_Class
{
       
//    result = 0; // FAILS - cannot access private variables, even though IT EXTENDED

    
    //Default constructor that uses methods from other class
    public the_Sub_Class(double w, double h) 
    {             
        setWidth(w);
        setHeight(h);
    }
                    
    double area()
    {
        return getWidth() * getHeight();
    }
}


class using_Inheritance
{        
    
    void method()
    {                
        var sub_Class_Obj = new the_Sub_Class(3,4);
        sub_Class_Obj.setWidth(3);
        sub_Class_Obj.setHeight(2);        
        sub_Class_Obj.showVariables();
        
    }
    
}







//---------------------Part 2 - Super------------------------------------ 


//Things to note:
//1. Subclass can call a constructor from the superclass using the SUPER keyword. Used to seperate variables to their specific class
//2. Subclasses can directly access methods AND variables (non private) from Superclasses
//3. You use superclasses to keep all your gerenal variables seperated in it's own unique group. THEN you create specfic subclasses to inherit the superclass
//4. WHOA. If using the super keyword, it must be the first thing in the contstructor. HOWEVER, even if you don't use super BUT still extend classes, the DEFAULT constructor of the superclass is still run!

class Super_Class
{
    private int x;
    
    private int height;
    private int length;
        
    int test_super_SUPER = 0;
    
    Super_Class(int height, int length)
    {
        this.height = height;               //chapter 4 talks about how using .this lets you have the same name for the variable + parameter
        this.length = length;
    }
    
    Super_Class()
    {
        x = 0;
        System.out.println("SUPER CLASS");
    }
    
    void method_used_in_Sub_class()
    {
        System.out.println("IM IN THE SUPER");
    }
        
}

//This class has 2 constructors that call on the superclasses' constructors, depending on what parameters were sent to it from the main class

class Sub_Class extends Super_Class
{
    private String name = "";
    int test_super = 0;
    
    Sub_Class(int height, int length, String name)
    {
        super(height, length);        

        
//        Remember, .this specifies the variable IN THIS CLASS, and not some parameter
//        System.out.println("NAME variable: " +this.name);
//        System.out.println("NAME parameter: " +name);
        
        this.name = name;
        
//        System.out.println("NAME variable: " +this.name);
//        System.out.println("NAME parameter: " +name);
    }
            
    Sub_Class()
    {        
        super();     
        System.out.println("SUB CLASS");        
    }
    
    
}


//If you call super here, which constructor will be chosen?
//It will only look at the constructor of the super class. However, if the superclass is also a subclass and has super in it, then it will also go to it's superclass as well
class Sub_Sub_Class extends Sub_Class
{    
    Sub_Sub_Class()
    {
        super();
        super.test_super_SUPER = 2;                                         // You can access the variables of superclasses as long as they are not private
        super.test_super = 2;                                        
        System.out.println("SUB sSUB CLASS");        
        
    
    }
}






//---------------------Part 2_1) Super implicitly used ------------------------------------ 
//even tho super is not written down, it is still USED
//Order is from the very top (A) to bottom (C)

class Top 
{
    Top()
    {
        System.out.println("CLASS A");
    }
}

class Middle extends Top
{
    Middle()
    {
        System.out.println("CLASS B");
    }
    
}

class Bottom extends Middle 
{
    Bottom()
    {
        System.out.println("CLASS C");
    }
}





//---------------------Part 2_2 - Referencing / assigning objects that extend---------------------------

//Even tho Reference A and B are pretty much the same, you cannot create a "B" object and then assign it to an A object since they are different types (reference_a(ie. string) is one type and reference_b is another(ie. int))...

class Reference_A
{
    int a;
    Reference_A(int i) 
    {
        a = i;
    }    
}

class Reference_B
{
    int b;
    Reference_B(int i) 
    {
        b = i;
    }    
}


class using_A_and_B
{
    public static void main (String[] args)
    {
        Reference_A a = new Reference_A(0);
        Reference_A a_1 = new Reference_A(55);               
        
        a_1 = a;    //same type
        
        Reference_B b = new Reference_B(0);        
        
//        b = a;                //error
    }
}





//...UNLESS, you extend the classes, in which case, the object types "become" the same! (int and int). Remeber
//
//   SUPERCLASS 
//     | |
//    _| |_  can be ASSIGNED to 
//    \   /
//     \ /
//   SUBCLASS

//              SUPERCLASS 
//                  ||
//    no idea about variables in
//                  ||
//              SUBCLASS





class Reference_C
{
    int c;
    Reference_C(int i) 
    {        
        c = i;
    }    
}

class Reference_D extends Reference_C
{
    int d;
    Reference_D(int i) 
    {
        super(i);
        d = i;
    }    
}

class using_C_and_D
{
    public static void main (String[] args)
    {
        Reference_C c = new Reference_C(0);
        Reference_D d = new Reference_D(55);
        
        
        //This shows that a SUPERCLASS object can be assigned to its subclass objects
        c = d;
        c.c=1;
        //The superclass object only knows about its superclass variables. bellow fails
//        c.d=2;
        
        //The subclass that extends to the SUPERCLASS cannot be assigned to a superclass object
     
//      d = c;                          

    }
}

//We have the ability to assign superclasses into subclasses (as shown above) to allow us to make copies

class TwoDShape
{
    private double hieght = 0.0;
    private double width = 0.0;
         
    TwoDShape(double width, double hieght)
    {
        this.width = width;
        this.hieght = hieght;
    }
    
    TwoDShape(TwoDShape ob)     //LOOK HERE WHEN READING THE COMMENT IN SHAPES. SEE? ITS LOOKING FOR A TWODSHAPE, BUT IS SENT A TRIANGLE
    {
        width = ob.width;
        hieght = ob.hieght;
    }
    
}

class Triangle extends TwoDShape
{
    private String style;    
    
    Triangle(String style,double width,double hieght)
    {
        super(width,hieght);
        this.style = style;
        
    }
    Triangle(Triangle ob)
    {
        super(ob);
        style = ob.style;
    }
}


class Shapes
{
    
    //Make standard object
    Triangle t1 = new Triangle ("outlined",8.0,12.0);
    
    //Make COPY of that object (which apparently is only possible due to the above scenario.
    //In TwoDShape, the contstuctor that is called is LOOKING FOR A TWODSHAPE, but is given a triangle object instead
    Triangle t2 = new Triangle (t1);
    
}



//---------------------Part 3 - Method Overrideing ---------------------------
//NOT THE SAME AS overloading (methods with same name but different parameters)
//Overrriding is when a method in the superclass is not used due to a method with the same signature in the subclass
//Use super to use methods in superclass with same name

//IMPORTANT: You can create a superclass object, then assign it to other subclass objects in order for you to use their own version of a method (see Overrride_Example)
//Note that even though you may never use the method with the same name as those in the subclasses, the superclass method version needs to be there as a general form. Otherwise, the subclasses cannot OVERRRIDE and their methods cannot be used
//
class A
{

    void show()
    {
        System.out.println("I'm not used :( ");   
    }
    
    void show2()
    {
        System.out.println("I'm used :) ");   
    }
    
    void show3()
    {
        System.out.println("I don't have a method in the subclass, so you can call me normally");
    }
           
    void class_show()
    {
        System.out.println("Grr");
    }
            
            
}

class B extends A
{
    void show() //this method overrrides the one in class A
    {
        System.out.println("IM USED");
    }
    
    
    void show2()
    {
        super.show2();
    }
    
    void class_show()
    {
        System.out.println("Grr");
    }
}

class C extends A
{
    void show()
    {
        System.out.println("example");
    }
    
    void class_show()
    {
        System.out.println("Grr");
    }
}
        
       
       

class override_Example
{
    public static void main (String[] args)
    {
        B ob1 = new B();
        ob1.show();        //The show in class A is overrriden, and B's show is used        
        ob1.show2();       //To use methods in Class A, use super (in the subclasses method, not here, see show2() in class B)
        ob1.show3();       //This method is in the superclass, but since no method in the subclass has the same name, it can be used directly
        
        
        
        //The power of PoLyMoRpHiSm
        
        //Note that this not creating an OBJECT, but an ARRAY of type A (very important)
        A superClass[] = new A[2];
        
        
            //Using this one superclass object, we will assign it to the subclasses, and that lets us use their methods without having to make new objects
            //Note that which class_show() method is only determine by the object being reffered at the time of the call, NOT what type of object multiObject_POWER is (which is type A object)
        
            
        superClass[0].class_show(); //the method from the superclass that will be overridden in the next examples
        
        superClass[1] = new B();
        superClass[1].class_show(); //even tho its a superclass object, the new reference to B (which is determined at run time) overrrides the superclass method
        
        superClass[2] = new C();        
        superClass[2].class_show();    
        
                                       
        
        
    }
}







//---------------------Part 4 - Abstract-------------------

//In part 3, the subclasses overridded the superclass method, but to ensure that new sub classes
//also have these methods, we use abstract classes/methods

//To understand this, comment out the method in subclass to see abstract ENFORCMENT


//Abstract methods require the abstract classes
abstract class super_Class
{      
   abstract void method_Abstract(); //ALWAYS BLANK, but ensures all subclasses have one
   
   //Can have other non abstract methods
   void method1(){}
   
   void meth()
   {
       
   }
   
}

class sub_Class extends super_Class
{
//    This method MUST OVERRIDE the superclass's
    void method_Abstract(){}
    
   
}

class abstract_Example
{
    void main()
    {
//        super_Class obj_test = new super_Class;          //Abstract classes cannot be made into objects     
        
        super_Class obj1[] = new super_Class[2];          //pg 262 - making an array of type super class lets you assign the subclasses to it
                                                          // however, note that each array is still unassigned
        
//        obj1[0] = new super_Class();                  //Abstract classes cannot be assigned into objects               
//        obj1[0].method_Abstract();                      //While this will COMPILE, this does NOT work because it was not initialized. While it was a type of super_Class, it was made as an array, and therefore not initalized
        
        obj1[0] = new sub_Class();                       
        obj1[0].method_Abstract();
        
        
                
    }
}



//---------------------------------Part five - FINAL -----------------------------------
//In superclass methods, prevents overriding (if the superclass method initializes control of device, dont want that method to be OVERRIDEN)


class super_Class_Fin{
    final void method(){}
}

class sub_Class_Fin extends super_Class_Fin{  
//    void method(){}       //error, cannot override final methods
}




//Final Classes cannot be inherted
final class super_Class_Fin2{
}

//class sub_Class_Fin1 extends super_Class_Fin2{  }     //Error cannot inherit final class




//Final variables = CONSTANTS
class var_Example
{
    final int ZERO =550;          
}










//---------------------------------Part six - Big O - Object---------------------------------


//Object is inherited by default to EVERY SINGLE CLASS
class the_Big_O 
{
    //Note that there is no mention of Object in this entire Project, and yet...
    void main()
    {
        Object test = new Object();        //NOT NEEDED...
        test = new var_Example();         //...but you can create an object from Object
               
    
        //Object has a bunch of cool methods you can use, and since everyone inherits Object, you can use them too!
        var test2 = new var_Example();     
        
        test2.equals(test);
        System.out.println(test2.toString());
        test.equals(test2);
    }
    
}






public class Chapter_7 
{

    public static void main(String[] args) 
    {
                
        
        //Part 1 - Inheritance
        var prog1 = new using_Inheritance();
//        prog1.method();
        
        
        
        //Part 2 - Super
//        var prog2 = new Sub_Class();
//        var prog2_1 = new Sub_Class(3,3,"Bold");
        
//        var prog2_2 = new Sub_Sub_Class();
//        prog2_2.method_used_in_Sub_class(); //didn't have to do anything to refernce superclass, I can just use its method
        


        //Part 2 - small super example
//        var prog2_3 = new C();
        

        //Part 4 - Abstract
        var prog4 = new abstract_Example();
        prog4.main();
                


    }
}
