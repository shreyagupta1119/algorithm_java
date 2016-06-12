
import java.util.Scanner;
// new code
public class InsertionSort

{
 public static void main(String args[])
 {
  int n,a[],b[],key,j;
  System.out.println("enter number of integers to input");
  Scanner s1=new Scanner(System.in);
  n=s1.nextInt();
  a=new int[n];
  b=new int[n];
  for (int i=0;i<n;i++)
   {
     System.out.println("Enter "+(i+1)+" number");
     a[i]=s1.nextInt();

   }
   System.out.println(" Sorted numbers are\n");
b[0]=a[0];
   for( int i=1;i<n;i++)
    {key=a[i];
     for(j=i;j>0;j--)
     { if(b[j-1] > key)   
       b[j]=b[j-1];
       else
      break;
          
     }   
       b[j]=key;
         }

     for(int i=0;i<n;i++)
     System.out.println(b[i]);
  }

}


