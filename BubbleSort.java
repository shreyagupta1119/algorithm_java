import java.util.Scanner;

public class BubbleSort
{ 
 public static void main(String args[])
 {
  int n,temp;
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter number of integers to sort");
  n=s1.nextInt();
  int a[]=new int[n];
  
  for(int i=0;i<n;i++)
  {System.out.println ("Enter "+(i+1)+ "number");
   a[i]= s1.nextInt();
  }
  for(int i=0;i<n-1;i++)
  for(int j=0;j<n-i-1 ;j++)
  { if(a[j]>a[j+1])
     {temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp; 
  } }
   System.out.println ("\nnumbers after sorting");
  for(int i :a)
  {System.out.println ("\n"+ i);
   
  }
 }
}

