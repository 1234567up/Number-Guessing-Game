import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    System.out.print("\nPlease Type your username!: ");
    
    Scanner NameAsker = new Scanner(System.in);
    String UserName = NameAsker.nextLine();

    System.out.println("\nHello " + UserName + "!");
    
    int LoopStarter = 1;

    System.out.println("Lets Play a Number Guessing Game!\n");

    while (LoopStarter == 1) {
      
      Scanner NumberScanner = new Scanner(System.in);
      Random randomNum = new Random();
      
      int hi = randomNum.nextInt(10);
      //System.out.println(hi);
  
      System.out.print("\nType the Number you think it is: ");

      int Ask1 = NumberScanner.nextInt();

      if (Ask1 == hi) {
        System.out.print("You guessed the right number " + UserName + "!\n");
      } else {
        System.out.print("\nTry Again " + UserName + "! The Number was: " + hi + "\n");
      }
  
    }

  }
}