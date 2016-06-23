import java.util.Scanner;
public class ArrayRotate
{
 public static void main (String args[])
  {
   int n,k,t,j;
   Scanner s1=new Scanner(System.in);
   System.out.println("\nEnter numbers to enter");
   n=s1.nextInt();
   int a[]=new int[n];
  
   for (int i=0;i<n;i++)
    {
     System.out.println("\nEnter "+ (i+1)+ " number");
     a[i]=s1.nextInt();
    }
   System.out.println("\nEnter places by which it shift");
   k=s1.nextInt();

   //main code
  
   for(int i=0; i<k;i++)
   { t=a[n-1];
     for (j=n-1; j>0;j--)
     {a[j]=a[j-1];
      
     }
      a[j]=t;
   }

   //shifted numbers are
    for (int i=0;i<n;i++)
   System.out.println("\n"+a[i]);
    
 }
}
   