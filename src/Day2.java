import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name =scanner.nextLine();

        System.out.print("Enter your age: ");
        int age =scanner.nextInt();

        System.out.print("What is your grade: ");
        double grade = scanner.nextDouble();

        System.out.print("Are you a good friend? (true/false): ");
        boolean friend = scanner.nextBoolean();

        System.out.println("\nHello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You got " + grade + " in Mathematics");
        System.out.println("Friend: " + friend);

        if (friend){
            System.out.println("Your friends are lucky");
        }
        else {
            System.out.println("You need to change");
        }


        // COMMON ISSUES

        System.out.print("\nEnter your number: ");
        int number =scanner.nextInt();
        scanner.nextLine(); //TO AVOID THE ISSUE OF YOUR NUMBER IS 23 APPEARING ON ENTER YOUR FAVORITE SNACK

        System.out.print("Enter your favorite snack: ");
        String snack = scanner.nextLine();

        System.out.println("\nYour number is " + number);
        System.out.println("Your favorite snack is  " + snack);


        // Calculate the area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;


        System.out.print("\nEnter the variable of width: ");
        width = scanner.nextDouble();


        System.out.print("Enter the value of height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The value is: " + area + "cm\u00B2");

        //MAD LIBS GAME

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("\nEnter an adjective (description): ");
        adjective1 = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter a noun (person or animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a verb (ends with ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("It turns out " + noun1 + " are actually big.");
        System.out.println("The " + noun1 + " at the time were " + verb1 + " because they were " + adjective2 + ".");
        System.out.println("I also visited a " + adjective3 + " exhibition.");

        scanner.close();

    }
}
