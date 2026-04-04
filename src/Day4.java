import java.util.Random;
import java.util.Scanner;

public class Day4 {
    public static void main(String [] args){
        // IF STATEMENT = PERFORMS A BLOCK OF CODE IF ITS CONDITION IS TRUE
/*        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;
        System.out.print("What is your name?: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false)" +
                ": ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("Oops you forgot to type in your name: ");
        }
        else {
            System.out.println("Hello " + name);
        }

        //GROUP 2
        if (age >= 65) {
            System.out.println("You are a senior.");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
        }
        else if (age < 0) {
            System.out.println("You have not been born yet");
        }
        else if (age == 0) {
            System.out.println("You are a baby");
        } else {
            System.out.println("You are a child");
        }

        //GROUP 3

        // if (isStudent == true) instead of using this
        if (isStudent){ // the shortcut is this as the if statement recognizes the boolean statement
            System.out.println("You are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }
        scanner.close();

 */
        Random random = new Random();

        int number1;
//      int number2;
//      int number3;
//      double number;
        boolean isHeads;

//      number = random.nextDouble();
//      number1 = random.nextInt(1, 101);
//      number2 = random.nextInt(1, 101);
//      number3 = random.nextInt(1, 101);

        isHeads = random.nextBoolean();

        if (isHeads){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

//      System.out.println(number);
//      System.out.println(number1);
//      System.out.println(number2);
//      System.out.println(number3);
//      System.out.println(isHeads);
    }
}
