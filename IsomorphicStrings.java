import java.util.*;
import java.io.*;
public class IsomorphicStrings
 {
  public static void main (String args[])
     {
       try{BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       String s1=reader.readLine();     
       String s2=reader.readLine();
       IsomorphicStrings obj= new IsomorphicStrings();
       if(obj.isomor(s1,s2))
       System.out.println("strings are isomorphic");
       else
       System.out.println("strings are not isomorphic");}
       catch (IOException ie)
       {}       
     }
     
   public boolean isomor(String s1, String s2)
     {
       if(s1==null||s2==null)
       return false;
       if(s1.length()!=s2.length())
       return false;
       else
         {HashMap<Character,Character> map=new HashMap<Character,Character>();
          for(int i=0; i<s1.length();i++)
            {char c1=s1.charAt(i);
             char c2=s2.charAt(i);
             if(map.containsKey(c1))
               {if(map.get(c1)!=c2)
                 return false;
               }
             else
               if(map.containsValue(c2))
                 {if(map.get(c2)!=c1)               
                   return false;
                 }
               else             
                map.put(c1,c2);
             }
           return true;  
         }
     }
 }
 
