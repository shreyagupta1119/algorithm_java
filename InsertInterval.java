import java.io.*;
import java.util.*;

class Intervals
{
  public int m,n;
  
  public Intervals(int m , int n)
  {
   this.m=m;
   this.n=n;
  }
  public int getm()
  {return m;
  }
}
public class InsertInterval
 {
   public static void main(String args[])
    { try{BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
           String s1[]= (reader.readLine()).split(" ");
           String s2[]= (reader.readLine()).split(" ");
           InsertInterval obj=new InsertInterval();
           obj.merge_function(s1,s2);
         }
       catch (IOException ie)
       {}  
    }
    void merge_function(String s1[],String s2[])
     {
       ArrayList<Intervals> a=new ArrayList<Intervals>();
       ArrayList<Intervals> result=new ArrayList<Intervals>();
       for(int i=0; i<s1.length;i++)
       a.add(new Intervals(Integer.parseInt(s1[i]),Integer.parseInt(s1[++i])));
       Intervals newinterval= new Intervals(Integer.parseInt(s2[0]),Integer.parseInt(s2[1]));
       for (Intervals interval:a)
       { if(newinterval.n<interval.m)            
          {result.add(newinterval);
           newinterval=interval;        
          }
         else if(interval.n<newinterval.m)  
           result.add(interval);
         else
          newinterval=new Intervals(Math.min(interval.m,newinterval.m),Math.max(interval.n,newinterval.n));          
       }
       result.add(newinterval);
       for(Intervals interval:result)
       System.out.println("["+interval.m+","+interval.n+"]");
       
    }
  }     
     
