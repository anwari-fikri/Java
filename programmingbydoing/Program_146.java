import java.util.Scanner;
import java.util.Random;

public class Program_146
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in); 
    Random r = new Random();
   
    
    int [] array = new int [10];
    System.out.print( "Array: " );
    for ( int n = 0 ; n < 10 ; n++ )
    {
      array[n] = 1 + r.nextInt( 50 );
      System.out.print( array[n] + " " );
    }
    
    System.out.println( "\nValue to find: " );
    int findValue = input.nextInt();
    int foundTimes = 0;
    for ( int n = 0 ; n < 10 ; n++ )
    {
      if ( findValue == array[n] )
        foundTimes++; 
    }
    
    if ( foundTimes > 0 )
      System.out.println( findValue + " is in the array." );
    else
      System.out.println( findValue + " is not in the array." );
  }
}