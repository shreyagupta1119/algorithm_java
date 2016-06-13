import java.util.Scanner;

public class MergeSort
{ int a[],length;
  void ini(int a[])
 { this.a=a;
   this.length=a.length;
 }
  public static void main(String args[])
 {
   int n,a[],LI,HI;
   System.out.println("Enter numbers of integers to be entered");
   Scanner s1=new Scanner(System.in);
   n=s1.nextInt();
   a= new int[n];
   MergeSort m1=new MergeSort();
   m1.ini(a);
   for(int i=0;i<n;i++)
    {System.out.println("Enter "+ (i+1)+" number");
     a[i]=s1.nextInt();
    }
   m1.doMergeSort(0,n-1);
   System.out.println("Sorted numbers are\n");
   for(int i=0;i<n;i++)
    System.out.println(a[i]);
 }
  void doMergeSort(int LI,int HI)
  { if(LI<HI)
    {int m= LI+(HI-LI)/2; 
     doMergeSort(LI,m);
     doMergeSort(m+1,HI);
     mergeParts(LI,m,HI);
    }
  }
  void mergeParts(int LI, int m, int HI)
   {int temp[]=new int[length];;
    for (int i=LI; i <=HI; i++)
    temp[i]= a[i];
    int i= LI;
    int j=m+1;
    int k=LI;
    while( i<=m &&j<=HI)
     { if(temp[i]<temp[j])
      {a[k]=temp[i];
       i++;
      }
       else
     {
      a[k]=temp[j];
      j++;
     }
      k++;
    } 
    while(i<=m)
    {a[k]=temp[i];
     i++;
     k++;
    }
    while(j<=HI)
    {a[k]=temp[j];
     j++;
     k++;
    }
  }
}
 

 

   