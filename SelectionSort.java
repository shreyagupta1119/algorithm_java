
import java.util.Scanner;
public class SelectionSort

{
 public static void main(String args[])
 {
  int n,a[],t,index,key;
  System.out.println("enter number of integers to input");
  Scanner s1=new Scanner(System.in);
  n=s1.nextInt();
  a=new int[n];
  for (int i=0;i<n;i++)
   {
     System.out.println("Enter "+(i+1)+" number");
     a[i]=s1.nextInt();

   } 
  
  
  System.out.println(" Sorted numbers are\n");
  for(int i=0;i<n-1;i++)
   {index=i;
    key=a[index];
    for(int j=i+1;j<n;j++)
     {if(key>a[j])
      {key=a[j];
       index=j;
      }
     }
    t=a[index];
    a[index]=a[i];
    a[i]=t;
    } 

  for(int i=0;i<n;i++)
  System.out.println(a[i]);
  }

}


