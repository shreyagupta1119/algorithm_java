import java.io.*;
import java.util.*;
public class ReversePolish
 {
  public static void main (String args[])
  
   { try{
       BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       String input[]=(reader.readLine()).split(" ");
       ReversePolish obj=new ReversePolish();
       System.out.println("output is"+obj.eval(input));
       }
     catch (IOException ie)
      {}
    }
    
   public int eval(String input[])
   {
     Stack<String> stack =new Stack<String>();
     String operators="+-*/";
     for (String s :input)
      {
        if(!operators.contains(s))
          stack.push(s);
        else
         { int a =Integer.parseInt(stack.pop());
           int b =Integer.parseInt(stack.pop());
          switch(s)
           {
             case "+": stack.push(Integer.toString(a+b));      
                       break;
             case "-": stack.push(Integer.toString(b-a));      
                       break;
             case "*": stack.push(Integer.toString(a*b));      
                       break;
             case "/": stack.push(Integer.toString(b/a));      
                       break;                    
                         
           }
           
         }
                
      }
       return(Integer.parseInt(stack.pop()));
     
   }
   
 }
