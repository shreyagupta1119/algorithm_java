import java.io.*;
class MatrixInput
{
 public static void main (String args[])
  {
    try{BufferedReader bf=new BufferedReader(new FileReader("input.txt"));
    int testcases=Integer.parseInt(bf.readLine());
    int m=0,n=0;
    int[][] a={{0}};
    while(testcases!=0)
     {
       String str[]=bf.readLine().split(" ");
       m=Integer.parseInt(str[0]);
       n=Integer.parseInt(str[1]);
       a=new int[m][n];
       for(int i=0;i<m;i++)
        {
         String s1[]=bf.readLine().split(" ");
         for(int j=0;j<n;j++)
         a[i][j]=Integer.parseInt(s1[j]);
        }
       testcases--;
     }
     SpiralMatrix obj=new SpiralMatrix();
     obj.printSpiral(a,0,m-1,0,n-1);
     
    }
    catch(IOException ie)
    {}  
  }
}

public class SpiralMatrix
 {
  void printSpiral(int[][] a, int startr, int endr , int startc,int endc)
   {
    if(startr<endr||startc<endc)
    {
    int i=startr;
    int j;
    for(j=startc;j<=endc;j++)
       System.out.print(a[i][j]+" ");
      j--; 
      i++;
      for(;i<=endr;i++)
    
      System.out.print(a[i][j]+" ");
     
     i--;
     j--;
     for(;j>=startc;j--)
     {
      System.out.print(a[i][j]+" ");
     }
     j++;
     i--;
     for(;i>startr;i--)
     {
       
       System.out.print(a[i][j]+" ");     
     } 
     i++;
     j++;
     printSpiral(a,startr+1,endr-1,startc+1,endc-1);
    }
    else
    return;  
   }
  
 }
