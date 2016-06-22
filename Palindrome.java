import java.util.Scanner;
public class Palindrome
{
 public static void main (String args[])
  {
   int n,t;
   Scanner s1=new Scanner(System.in);
   System.out.println("\nEnter numbers to enter");
   n=s1.nextInt();
   int a[]=new int[n];
  
   for (int i=0;i<n;i++)
    {
     System.out.println("\nEnter "+ (i+1)+ " number");
     a[i]=s1.nextInt();
    }
   for (int i=0;i<n;i++)
    {  int y=a[i];
       int rev_num=0;
      while( y!=0)
       {t=y%10;
        rev_num=rev_num*10+t;
        y/=10;
       }
       
       if(rev_num ==a[i])
         System.out.println( a[i]+ " is a Palindrome number");
       else       
         System.out.println(a[i]+ " is not a Palindrome number");
          
    }  
  }
 
}