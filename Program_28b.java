public class Program_28b
{
 public static void main( String[] args ) throws Exception
 {
   int steps_per_second = 10;
  for ( int i=0; i<80; i++ )
  {
   if ( i%16 == 0 )
    System.out.println(" ********                 \r");
   else if ( i%16 == 1 )
    System.out.println("   ********               \r");
   else if ( i%16 == 2 )
    System.out.println("     ********             \r");
   else if ( i%16 == 3 )
    System.out.println("       ********           \r");
   else if ( i%16 == 4 )
    System.out.println("         ********         \r");
   else if ( i%16 == 5 )
    System.out.println("           ********       \r");
   else if ( i%16 == 6 )
    System.out.println("             ********     \r");
   else if ( i%16 == 7 )
    System.out.println("               ********   \r");
   else if ( i%16 == 8 )
    System.out.println("                 ******** \r");
   else if ( i%16 == 9 )
    System.out.println("               ********   \r");
   else if ( i%16 == 10 )
    System.out.println("             ********     \r");
   else if ( i%16 == 11 )
    System.out.println("           ********       \r");
   else if ( i%16 == 12 )
    System.out.println("         ********         \r");
   else if ( i%16 == 13 )
    System.out.println("       ********           \r");
   else if ( i%16 == 14 )
    System.out.println("     ********             \r");
   else if ( i%16 == 15 )
    System.out.println("   ********               \r");

   Thread.sleep(1000/steps_per_second);
  }
  
 }
}