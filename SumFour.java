import java.util.*;
import java.io.*;

public class SumFour
{ 
 public static void main(String args[])
  {
    try{
     BufferedReader reader=new BufferedReader (new FileReader("input.txt"));
     int testcases=Integer.parseInt(reader.readLine());
     while(testcases !=0)
     {
      String str1[]=reader.readLine().split(" ");
      int target=Integer.parseInt(reader.readLine());
      testcases--;
      (new SumFour()).sumOfFourIntegers(str1,target);
      
     }
    }
    catch( Exception ie)
    {}
  }
  
  void sumOfFourIntegers(String str[],int target)
  {
   List<List<Integer>> result=new ArrayList<List<Integer>>();
   int a[]=new int[str.length];
   for(int i=0;i<str.length;i++)
   a[i]=Integer.parseInt(str[i]);
   if(a==null||a.length<4)
   {System.out.println("invalid strings");
    return;
    }
    Arrays.sort(a);
    for(int i=0;i<a.length-3;i++)
     { if(i!=0 && a[i]==a[i-1])
            continue;
       for(int j=i+1;j<a.length-2;j++)
        { if(j!=i+1 && a[j]==a[j-1])
                continue;
         int k=j+1;
         int l=a.length-1;
         while(k<l)
          {
           if(a[i]+a[j]+a[k]+a[l]<target)
            k++;
           else if(a[i]+a[j]+a[k]+a[l]>target) 
            l--;
           else
            {List<Integer> t=new ArrayList<Integer>();
             t.add(a[i]);
             t.add(a[j]);
             t.add(a[k]);
             t.add(a[l]);
             result.add(t);
             k++;
             l--;
             while(k<l && a[k]==a[k-1])
              k++;
             while(k<l && a[l]==a[l+1])
              l--;
            } 
          }
        }
     }
    System.out.println(result);
  }
}
