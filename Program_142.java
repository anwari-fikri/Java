import java.util.Random;

public class Program_142
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    int [] array1 = new int [10];
    int [] array2 = new int [10];
    
//    System.out.print( "Array 1 : " );
    for ( int a = 0 ; a < 10 ; a++ )
    {
      array1[a] = 1 + r.nextInt(100);
//      System.out.print( array1[a] + " " );
    }
    
//    System.out.print( "\nArray 2 : " );
    for ( int a = 0 ; a < 10 ; a++ )
    {
      array2[a] = array1[a];
//      System.out.print( array2[a] + " " );
    }
    
    array1[9] = -7;
    
    System.out.print( "Array 1 : " );
    for ( int a = 0 ; a < 10 ; a++ )
    {
      System.out.print( array1[a] + " " );
    }
    
    System.out.print( "\nArray 2 : " );
    for ( int a = 0 ; a < 10 ; a++ )
    {
      System.out.print( array2[a] + " " );
    }

  }
}