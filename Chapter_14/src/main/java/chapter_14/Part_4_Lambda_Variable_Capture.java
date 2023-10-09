 
package chapter_14;

//You can use variables made outside a lambda block, but you cannot modify them


interface variable_Capture
{
    int func(int n);
}

public class Part_4_Lambda_Variable_Capture 
{
    
    public static void main (String[] args)
    {
        
        int num = 10;

        variable_Capture my_Lambda = (n) -> {
            int v = num + n;
            //num = 2;                                                  //any attempts to modify num will cause an error. Since the value can never be changed for a lambda block to work, this line, and any other line that modifies num, would cause an error
            return v;
        };
        
        
        System.out.println(my_Lambda.func(8)); 
        
        //num = 2;
        
        
    }

    
}
