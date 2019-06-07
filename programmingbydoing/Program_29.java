import javax.swing.*;

public class Program_29
{
  public static void main(String [] args)
  {
    String name = JOptionPane.showInputDialog( "What is your name?" );
    
    String input = JOptionPane.showInputDialog( "How old are you?" );
    int age = Integer.parseInt(input);
    
    System.out.print( "Hello, " + name + "." );
    System.out.println( "next year, you'll be " + (age+1) );
    
    System.exit(0);
  }
}