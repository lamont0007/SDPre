import java.util.Scanner;

public class objective5Lab4 {
public static void main(String[] args) {
  Scanner scanner = new Scanner (System.in);
  int userNum;


      System.out.println("Please enter a number.");

      userNum = scanner.nextInt();

      if(userNum % 2 == 0){
        System.out.println( "The number is even.");
      }
      else if(userNum % 2 == 1){
        System.out.println("The number is odd");


      }

      scanner.close();
      }
    }