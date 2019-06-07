import java.util.Scanner;

public class Program_51
{
 public static void main( String[] args )
 {
  Scanner keyboard = new Scanner(System.in);

  System.out.println( "Type in a message, and I'll display it several times." );
  System.out.print( "Message: " );
  String message = keyboard.nextLine();
  System.out.println( "How many times?" );
  int n = keyboard.nextInt();
  
  int i = 0;
  while ( i < n )
  {
   System.out.println( (10+i*10) + ". " + message );
   i++;
  }

 }
}