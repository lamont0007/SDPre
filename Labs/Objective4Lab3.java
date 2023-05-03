
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt();

    currentYear = 2023;

    birthYear = (currentYear - age);

    // I wanted to use an equation to have the current year to automatically update but I didn't know if I was going to far.//

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}