import java.io.*;
	
public class setb1 {
	
	   public static void main(String arg[]) throws Exception
	   {
	   int sum=0;
	   for(int i=0;i<arg.length;i++)
	   {
	      try{
	      sum=sum+Integer.parseInt(arg[i]);
	      }
	      catch(NumberFormatException e)
	      {
	      System.out.println(arg[i]+" invalid integer !!!");
	      }
	   }//for
	   System.out.println("Sum of valid integer numbers=>"+sum);
	   }
	  
	  }


