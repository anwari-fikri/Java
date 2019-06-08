import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Program_189
{
  public static void main(String [] args)
  {
    Scanner kb = new Scanner(System.in);
    
    System.out.print("Sentence: ");
    String word = kb.nextLine();
    
    String[] wordArray = word.toLowerCase().split(" ");
    ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(wordArray));
    Collections.sort(wordList);
    
    System.out.println("Sorted: " + wordList);
    
  }
}