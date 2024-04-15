
package chapter_14;


//pg 491
//LAMBDA: An anonymous unnamed method
//used to implement a method defined by a functional interface 




//Functional Interface: contains only a single abstract method 

interface MyValue  //0 parameters
{
    double getValue();  //A method = ABSTRACT IF it does not have any implementation 
    
}


interface Single_Parameter  //1 parameters
{
    double getValue(double x);  //A method = ABSTRACT IF it does not have any implementation    
}


interface Multi_Parameters  //2 parameters
{
    boolean getValue(double x,double y);  //A method = ABSTRACT IF it does not have any implementation    
}



//THE LAMBDA OPERATOR:        
// () -> 3;
//Left side specifies any parameters required 
//Right side: specifies the action of the lambda expression

// same as:
// int method() { return 3; }


//PARAMETERS:
// (n) -> 1 / n;
//This lambda expression returns the reciprocal of n
//Notice that you don't define the type





public class Part_1_Lambda_Intro 
{
    public static void main (String[] args)
    {
        
        
        //Expression Lambda's: single line definition 
        
        MyValue myVal;
        myVal = () -> 93.3;
        System.out.println("Number is: " +myVal.getValue());
                        
        
        
        
        
        Single_Parameter recipical = (n) -> 1.0 / n; //lambda allows us to transform code segments into an objects (pg 493)
        System.out.println("Number is: " +recipical.getValue(2.0));
        
        
        
        
        
        Multi_Parameters is_Factor = (x,y) -> (x % y) == 0;        
        if (is_Factor.getValue(10.0,2.0))
            System.out.println("10 is a factor of 2");
        
        
        
        

      
        
        Multi_Parameters X_less_Than_Y = (x,y) -> (x < y);                   
        
        if (X_less_Than_Y.getValue(1.0,3.0))
            System.out.println("1 is less than 3");
        
        
        
        
       
        
        
        
        
        
    } 
           
}
