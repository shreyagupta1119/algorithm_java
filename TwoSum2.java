import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class TwoSum2
{
  public static void main(String args[])
   {
      try{BufferedReader reader=new BufferedReader(new FileReader("Input.txt"));
      int testcases=Integer.parseInt(reader.readLine());
      while(testcases!=0)
      {String s1[]=reader.readLine().split(" ");
       String s2=reader.readLine();
       TwoSum2 obj=new TwoSum2();
       obj.solution(s1,s2);
       testcases--;
      }}
      catch (IOException ie)
      {}
    }
   void solution(String s1[], String s2)
   { int target=Integer.parseInt(s2);
     int indices[]=new int[2];
     HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
     int a[]=new int[s1.length];
     for(int i=0;i<a.length;i++)
     a[i]=(Integer.parseInt(s1[i]));
     for(int i=0;i<a.length;i++)
     {
       if(map.containsKey(a[i]))
        {indices[0]=map.get(a[i]);
         indices[1]=i;
         break;
        }
       else
        map.put(target-a[i],i);     
     }
    
                if (indices[0]==0&&indices[1]==0)
        System.out.println("Invalid Target");
        else
      System.out.println("indices are"+ indices[0] +","+indices[1]);
      
     
   }
}
