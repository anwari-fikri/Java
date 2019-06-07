import java.util.Scanner;

public class Program_15
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println( "Give me a word!" );
    keyboard.next();
    System.out.println( "Give me a second word!" );
    keyboard.next();
    
    System.out.println( "\nGreat, now your favorite number?" );
    keyboard.next();
    System.out.println( "And your second-favorite number..." );
    keyboard.next();
    
    System.out.println( "\nWhew!  Wasn't that fun?" );
  }
}