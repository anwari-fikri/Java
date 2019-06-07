import java.util.Scanner;
import java.util.Random;

public class Program_143
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    Random r = new Random();
    
    System.out.print( "Name (first last): " );
    String name = input.nextLine();
    
    int [] array = new int [5];
    for ( int n = 0 ; n < 5 ; n++ )
    {
      array[n] = r.nextInt(100);
    }
    
    System.out.println( "Here are your randomly-selected grades (hope you pass): " );   
    for ( int n = 0 ; n < 5 ; n++ )
    {
      System.out.println( "Grade " + (n+1) + ": " + array[n] );
    }
    
  }
}