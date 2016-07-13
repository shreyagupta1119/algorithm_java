import java.io.*;
public class SpiralMatrix2
{
 public static void main (String args[])
  {
    try{BufferedReader bf=new BufferedReader(new FileReader("input.txt"));
    int testcases=Integer.parseInt(bf.readLine());
    int n=0;
    
    int[][] a={{0}};
    while(testcases!=0)
     {      
       n=Integer.parseInt(bf.readLine());
       a=new int[n][n];
       Solution obj=new Solution();
       obj.printSpiral(a,n,0,n-1,0,n-1);
       for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
         System.out.print(a[i][j]+ " ");
         System.out.println("");
        } 
       bf.close();
       testcases--;
     }
    }
    catch(IOException ie)
    {}  
  }
}
 class Solution
  { public static int temp=1;
   void printSpiral(int[][] a,int n,int startr,int endr, int startc, int endc)
    { 
         if(startr<endr||startc<endc)
         {
          int i=startr;
          int j;
          for(j=startc;j<=endc;j++)
           a[i][j]=temp++;
          j--; 
          i++;
          for(;i<=endr;i++)
           a[i][j]=temp++;
          i--;
          j--;
          for(;j>=startc;j--)
           a[i][j]=temp++;
          j++;
          i--;
          for(;i>startr;i--)
           a[i][j]=temp++;     
          i++;
          j++;
          printSpiral(a,n-2, startr+1,endr-1,startc+1,endc-1);
        }
        else
         return;  
   }
}
   
