import java.util.Scanner;

public class QuickSort
{ int lm,rm,pivot;
  public static void main(String args[])
 {
   int n,a[];
   System.out.println("Enter numbers of integers to be entered");
   Scanner s1=new Scanner(System.in);
   n=s1.nextInt();
   a= new int[n];
   QuickSort q1=new QuickSort();
   for(int i=0;i<n;i++)
    {System.out.println("Enter "+ (i+1)+" number");
     a[i]=s1.nextInt();
    }
   q1.sort(1,n-1,a[0]);
   System.out.println("Sorted numbers are\n");
   for(int i=0;i<n;i++)
    System.out.println(a[i]);
 }
  void sort(int lm, int rm, int pivot)
 {int lm,rm,pivot;
   
   while(lm>rm)
   {while(lm>=rm)
    {if(pivot>a[lm])
    lm++;
    else if(pivot<a[rm])
     rm--;
    else 
     break;
    }
    int t= a[lm];
    a[lm]=a[rm];
    a[rm]=t;
   }




 }

}
 

 

   