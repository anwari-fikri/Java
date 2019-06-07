import java.util.Random;

public class Program_141
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    int[] values = new int [1000];
    int x = 0;
    int row = 0;
    
    while( x < 1000 )
    {
      for ( int col = 0 ; col < 20 ; col++ )
      {
        row = 0;
        for ( row = 0 ; row < 50 ; row ++ )
        {          
          values[x] = 10 + r.nextInt(89);
          System.out.print( values [x] + "  " );
          x++;
        }
      }
    }
    
  }
}