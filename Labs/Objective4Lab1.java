import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your fname?");
    String fname = keyboard.nextLine();
   
    System.out.println("What is your lname?");
    String lname = keyboard.nextLine();

    System.out.println("What is your favoriteAnimal?");
    String favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favoriteFood?");
    String favoriteFood = keyboard.nextLine();

    System.out.println("What is your favoriteSong?");
    String favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fname +  lname);
    System.out.println("My favorite animal is the " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("My favorite song is " + favoriteSong);



    

    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}