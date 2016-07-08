import java.io.*;

public class ReverseWordsInString { 
  public static void main(String args[]) {     
   try {
          BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
          String s1=reader.readLine();
          
          //Reverse code
          String splitted[]=s1.split(" ");
        
         String[] reverse=new String[splitted.length];
         for( int i=0,j=splitted.length-1; i<splitted.length; i++, j--) {
            reverse[i]=splitted[j];
        }
        System.out.println(String.join(" ",reverse));
     }
    catch (IOException ie) {
     }
  }
}

