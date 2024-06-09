# Table of Contents
https://github.com/AbelDelgado/Java-Programs/blob/main/Table%20of%20Contents.md

# Deleting Lines
`SHIFT + DEL` = _Copies line and then deletes it_   
  
`CTRL + DEL` = _delete current word OR all blank spaces_    

# Formating 
`CTRL + ?` = _instantly make a comment! OMG_  

`CTRL + C` = _copies current line without having to highlight it_  
  
`CTRL + SHIFT + UP/DOWN` = _duplicate line AND paste above/below_      
  
`ALT + SHIFT + UP/DOWN` = _move a line up or down_  
  
`CTRL + SHIFT + -/+` = _minimize/maxmimize all functions_  
  
`CTRL + SPACE` = let netbeans try to AUTOFILL YOUR REQUUEST  

`CTRL + UP / DOWN` = _scroll up or down_  
    

    
`CTRL + CLICK CLASS` = takes you to that class    
  
### Bookmarks
`CTRL + SHIFT + M` = _makes a bookmak, so you don't have to scroll ALLLL the way to main_  
`CTRL + SHIFT + .` or `CTRL + SHIFT + ,` = _toggles between the bookmarks you've made_
  
### Breakpoint
Click on one of the numbers to set a breakpoint (Must be on VALID line and not a blank or bracket).  
You could also right click and select toggle break point  

Then, if you use DEBUGGER (beside the compile button), it will stop wherever you set it.  
You can then use STEP INTO to go line by line in your program  
Watch out when stepping into System.out.println as it will go through ALL the backend stuff. Use STEP OVER instead  
   
# Multiple public static void Mains (String[] args)  
See Section E - Queues example (Part 6)  
  
Think of it like running a function called main  
ie. runProgram2.main(null);  

If you have 2 classes with main in them, you can select which one the PROJECT will run by selecting it as the MAIN CLASS in the project properties (see error "Project Failing to Run" below on how to set main class)

NOTE: If you right-click and run NOT from the project, but from the file itself, it will ALWAYS run the main with the same name, regardless of how many mains you have  

# Easy System.out.println("");
typing "sout" and then pressing tab creates a System.out.println("");    
  
    
  
# Using COMMAND LINE ARGUMENTS in netbeans 
Example in Section E - Part 6  
In the Projects tab, right click the top main folder, and click properties  
Click run, select the main class and add your arguments there  
arguments are saved as:  
  
'This is an argument'  
  
public static void main (String [] args)  
args = { "This", "is", "an", "argument"};  
           0       1    2       3  
  
           
           
           
If using SYSTEM.IN.READ, you need to have: throws java.io.IOException 
STATIC - create only one function/variable that will be used across the entire class
Packages = simply groups of classes  

-----------------------------




  
GITHUB HELP:  
- Visit: https://www.markdownguide.org/basic-syntax/ for basic markdown/html structure
- To make a new line, put 2 empty spaces at the end of a sentance  
- To make a blank line, use `<br/><br/>`
- Type `&nbsp;` to add a single space
- Type `&ensp:` to add 2 spaces
- Type `&emsp:` to add 4 spaces
- To write symbols like `<br/><br/>`, put ` quotes around them (NOT SINGLE QUOTES)
- Use `#` to make titles; adding more makes it bigger  
# test  
## test  
### test  
#### test  
-----------------------------





# Netbeans Errors

### Project Failing to Run  
If you change change the name/refactor a default file.java and then try to run the Project, it will FAIL because the project will be looking for the old name  
To fix this, right click the project, and select properties. In the run section, set the main class as the new file.java you renamed.  



