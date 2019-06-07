import java.util.Scanner;

public class Program_17
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print( "First name:" );
    String first_name = keyboard.next();
    System.out.print( "Last name:" );
    String last_name = keyboard.next();
    System.out.print( "Grade (9-12):" );
    int grade = keyboard.nextInt();
    System.out.print( "Student ID:" );
    String student_id = keyboard.next();
    System.out.print( "Login:" );
    String login_name = keyboard.next();
    System.out.print( "GPA (0.0-4.0):" );
    double gpa = keyboard.nextDouble();
    
    System.out.println( "Your information:" );
    
    System.out.println( "     Login:  " + login_name );
    System.out.println( "     ID     :" + student_id );
    System.out.println( "     Name:   " + last_name + ", " + first_name );
    System.out.println( "     GPA:    " + gpa );
    System.out.println( "     Grade:  " + grade );
  }
}