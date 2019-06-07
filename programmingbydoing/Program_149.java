import java.util.Scanner;
import java.util.Random;

public class Program_149
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in); 
    Random r = new Random();
   
    
    int [] array = new int [10];
    System.out.print( "Array: " );
    for ( int n = 0 ; n < 10 ; n++ )
    {
      array[n] = 1 + r.nextInt( 100 );
      System.out.print( array[n] + " " );
    }
    
    int max = array[0];
    int maxSlot = 0;
    for ( int n = 1 ; n < 10 ; n++ )
    {
      if ( max < array[n] )
      {
        max = array[n];
        maxSlot = n;
      }
        
    }
    System.out.println( "\n\nLargest value is " + max );
    System.out.println( "It is in slot " + maxSlot );
  }
}