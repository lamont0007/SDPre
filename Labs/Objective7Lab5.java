import java.util. Scanner;


public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner. nextInt ();



  if (selection == 1) {
  System.out.println("Hello World");
}   

  else if (selection == 2) {
  System.out.println("My favorite foods are apples, bananas, and cocnuts.");
}   
  else if (selection == 3) {
break;
}   

  else
  System.out.println("This is not a valid entry, please try again.");
      



        scanner. close();
      }
        }
          }


