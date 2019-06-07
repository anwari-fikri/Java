import java.util.Scanner;

public class Program_151
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    
    String [] name = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
    double [] grade = { 99.5, 78.5, 95.6, 96.8, 82.7 };
    int [] id = { 123456, 813225, 823669, 307760, 827131 };
    
    System.out.println( "Values:" );
    for ( int i = 0 ; i < name.length ; i++ )
      System.out.println( "\t" + name[i] + " " + grade[i] + " " + id[i] );
    
    System.out.print( "ID number to find: " );
    int idFind = input.nextInt();
    
    int result = 0;
    for ( int i = 0 ; i < name.length ; i++ )
    {
      if ( idFind == id[i] )
      {
        System.out.println( "\nFound in slot " + i );
        System.out.println( "\tName: " + name[i] );
        System.out.println( "\tAverage: " + grade[i] );
        System.out.println( "\tID: " + id[i] );
        result++;
      }
    }
    if ( result == 0 )
      System.out.println( "\nCould not find ID" );
  }
}