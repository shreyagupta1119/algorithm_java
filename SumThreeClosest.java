import java.util.*;
import java.io.*;

public class SumThreeClosest
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
      (new SumThreeClosest()).solution(str1,target);
      
     }
    }
    catch( Exception ie)
    {}
  }
  
  void solution(String str[],int target)
  {
   int result=0;
   int a[]=new int [str.length];
   int min=Integer.MAX_VALUE;
   for(int i=0;i<str.length;i++)
   a[i]=Integer.parseInt(str[i]);
   if(a==null||a.length<3)
    {System.out.println("invalid strings");
    return;
    }
    Arrays.sort(a);
    outer:for(int i=0;i<a.length-2;i++)
     {
      int j=i+1;
      int k=a.length-1;
      while(j<k)
       {
        int sum=a[i]+a[j]+a[k];
        int diff=Math.abs(target-sum);
        if(diff==0)
        break outer;
        if(diff<min)
         {min=diff;
          result=sum;
         }
        if(target<=sum)
        k--;
        else
        j++;
       }
     }
    System.out.println(result);     
   }
 }  
