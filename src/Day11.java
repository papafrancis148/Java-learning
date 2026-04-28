import java.util.Random;
import java.util.Scanner;

public class Day11 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // WHILE LOOP = repeat some code forever while some condition remain true
/*        String name = "";

          if (name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        while (name.isEmpty()){ // Replaces whe if statement to prevent users from skipping prompts
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
*/
        // INFINITE LOOP: This a while loop with a condition we can't change from  within the loop.

/*      String reply = "";

        while (!reply.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Enter the letter Q to quit playing!: ");
            reply = scanner.next().toUpperCase();
        }

       System.out.println("You have quit playing the game");
*/
        // ANOTHER EXAMPLE
        int number = 0;

/*        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old.");
 */
        // WITH THE DO WHILE LOOP YOU ENTER THE CODE AT LEAST ONCE THEN CHECK WHILE FOR THE WHILE LOOP IF THE CODE IIS FALSE IT SKIPS IT COMPLETELY WITHOUT CHECKING
/*        do {
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while (age < 0);

        System.out.println("You are " + age + " years old.");
*/
        // ask the user to type a number between a certain range
/*        while (number < 1 || number >10){
            System.out.println("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }
 */
        // Now using the do while loop
/*        do {
            System.out.println("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while (number < 1 || number > 10);
        System.out.println("You picked " + number);
*/
        // NUMBER GUESSING GAME
/*        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10");

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
        }while (guess != randomNumber);
        System.out.println("You have won");
*/
        // GIVING THE USER A CLUE TO KNOW HOW CLOSE HE/SHE IS GETTING TO THE NUMBER
/*        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-10");

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again");
            }
            else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        }while (guess != randomNumber);
*/
        // USING BIG NUMBERS E.G 1-100
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1); //We add + 1 because when using min, max the max is exclusive so we add +1 to include the max
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again");
            }
            else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        }while (guess != randomNumber);

        scanner.close();
    }
}
