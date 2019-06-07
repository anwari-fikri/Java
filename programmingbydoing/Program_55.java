import java.util.Scanner;

public class Program_55
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    int num = 0;
    int sum = 0;
    
    System.out.println( "I will add up the numbers you give me." );
    
    System.out.print( "Number: " );
      num = input.nextInt();
      sum = sum + num;
      System.out.println( "The total so far is " + sum );
    
    while ( num != 0 )
    {
      System.out.print( "Number: " );
      num = input.nextInt();
      if ( num != 0 ){
        sum = sum + num;
        System.out.println( "The total so far is " + sum );
      }
      
    }
    
    System.out.println( "The total is " + sum );
  }
}