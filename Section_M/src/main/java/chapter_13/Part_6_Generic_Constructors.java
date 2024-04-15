
package chapter_13;


//pg 471
//Generic COnstructors - Even though the class itself is NOT generic, its constructor CAN BE
//Type parameters entered are before constructor namew
//Since the constructor is bounded by Number, only numbers are accepted; strings will NOT COMPILE

class Summation
{
    private int sum;
    
    <T extends Number> Summation (T arg)
    {
        sum = 0;                
        for (int i = 0; i <= arg.intValue(); i++)
        {            
            sum += i;
        }
        
    }
    
    int get_Sum()
    {
        return sum;
    }
}


public class Part_6_Generic_Constructors 
{
    public static void main (String[] args)
    {
        Summation ob = new Summation(4.0); //->This is the LOWER BOUND (String)
        System.out.println(ob.get_Sum());
        
        
    }
    
     
}
