import java.io.*;
import java.util.ArrayList;

public class TwoSum
{
  public static void main(String args[])
   {
      try{BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
      String s1[]=(reader.readLine()).split(" ");
      String s2=reader.readLine();
      TwoSum obj=new TwoSum();
      obj.solution(s1,s2);
      }
      catch (IOException ie)
      {}
    }
   void solution(String s1[], String s2)
   {
     ArrayList<Integer> a=new ArrayList<Integer>();
     
     int[] indices=new int[2];
     try{for(String i:s1)
     a.add(Integer.parseInt(i));
     int target=Integer.parseInt(s2);
     outer:for (int i=0; i<a.size();i++)
      for(int j=i+1; j<a.size(); j++)
       if(a.get(i)+a.get(j)==target)
        {
         indices[0]=i;
         indices[1]=j;
         break outer;
         
        }
        else
        continue;
        
        if (indices[0]==0&&indices[1]==0)
        System.out.println("Invalid Target");
        else
      System.out.println("indices are"+ indices[0] +","+indices[1]);
      }
      catch(Exception ie)
      {System.out.println("either Array is empty or exception thrown");}  
   }
}
