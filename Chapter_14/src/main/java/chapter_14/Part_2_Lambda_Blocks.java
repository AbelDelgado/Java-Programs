package chapter_14;

//instead of a single sentance expression, lambdas can also exsit in 


interface Numeric_Function
{
    int func (int x);
}





public class Part_2_Lambda_Blocks 
{
    public static void main (String[] args)
    {
        Numeric_Function smallest_Factor = (n) ->
        {
            int result = 1;
            n = n < 0 ? -n : n;
            
            for (int i = 2; i <= n/i; i++)
                if ((n % i) == 0)
                {
                    result = i;
                    break;
                }
        
        return result;                                  //this return does NOT end the main program; it only causes a return from the lambda
        };
    
        
        System.out.println(smallest_Factor.func(12));
    }
    
    
    
    
    
}
