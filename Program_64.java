import java.util.Scanner;

public class Program_64
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println( "Type in a message, and I'll display it five times." );
    System.out.print( "Message: " );
    String message = keyboard.nextLine();
    
    for( int n = 2 ;  n <= 10 ; n+=2 )
      System.out.println( n + ". " + message );
  }
}