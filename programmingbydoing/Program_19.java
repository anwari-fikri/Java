/*What is your first number? 1.1
What is your second number? 2.2
What is your third number? 5.5

( 1.1 + 2.2 + 5.5 ) / 2 is... 4.4*/

import java.util.Scanner;

public class Program_19
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println( "What is your first number?" );
    double num1 = input.nextDouble();
    System.out.println( "what is your second number?" );
    double num2 = input.nextDouble();
    System.out.println( "what is your third number?" );
    double num3 = input.nextDouble();
    
    double ans = ( num1 + num2 + num3 ) / 2;
    
    System.out.printf( "( %f + %f + %f ) / 2 is... %f", num1, num2, num3, ans );
  }
}