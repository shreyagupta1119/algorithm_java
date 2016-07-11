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
class IntComparator implements Comparator<Intervals>
{
  public int compare(Intervals i1,Intervals i2)
    {return i1.getm()-i2.getm(); 
    }   
}

public class MergeIntervals
 {
   public static void main(String args[])
    { try{BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
           String s1=reader.readLine();
           int n=Integer.parseInt(s1);
           String s2[]= (reader.readLine()).split(" ");
           MergeIntervals obj=new MergeIntervals();
           obj.merge_function(s2);
         }
       catch (IOException ie)
       {}  
    }
    void merge_function(String s1[])
     {
       ArrayList<Intervals> a=new ArrayList<Intervals>();
       ArrayList<Integer> b=new ArrayList<Integer>();
       Stack<Integer> stack=new Stack<Integer>();
       for(int i=0; i<s1.length;i++)
       a.add(new Intervals(Integer.parseInt(s1[i]),Integer.parseInt(s1[++i])));
     
       Collections.sort(a,new IntComparator());
        for (int i=0; i <s1.length/2; i++)
        System.out.println((a.get(i)).m+","+(a.get(i)).n);
        stack.push((a.get(0)).m);
        stack.push((a.get(0)).n);
        
       for(int i=0;i<(s1.length/2)-1;i++)
        { if(((a.get(i)).n)>((a.get(i+1)).m))
          { stack.pop();
          stack.push((a.get(i+1)).n);
          }
          else
          {
           stack.push((a.get(i+1)).m);
           stack.push((a.get(i+1)).n);
          }
        }   
       System.out.println("Intervals are");      
       for (int i=0; i<stack.size()-1;i++)
       System.out.println("["+stack.get(i) +","+ stack.get(++i)+"]");
      
     }
 }
