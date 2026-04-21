import java.util.Scanner;

public class Day10 {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        // SIMPLE CALCULATOR WITH JAVA
        // +, -, *, /, ^ operators for solving equations
/*
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2) ;
            default -> {
                System.out.println("Invalid operator!");
                validOperation = false;
            }
        }

        if (validOperation){
            System.out.println(result);
        }
*/
        // LOGICAL OPERATORS: They allow us to check or modify more than one condition
        // && = AND (Used to check if a value falls within a certain range)NB: ALL conditions must be true
        // || = OR (With this operator only one condition needs to be true)
        // ! = NOT (Used to check if a condition is not true)

        // AND OPERATOR (&&)
/*
        double temp = 20;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is SUNNY outside ☀️");
        }
*/
        // NOT OPERATOR (!)
/*        double temp = 20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is SUNNY outside ☀️");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) { //N.B If something is normally false using the NOT logic operator it becomes true and vice versa
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is CLOUDY outside☁️");
        }

 */
        // OR OPERATOR (||)
/*        double temp = -20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is SUNNY outside ☀️");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) { //N.B If something is normally false using the NOT logic operator it becomes true and vice versa
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is CLOUDY outside☁️");
        }
        else if (temp > 30 || temp < 0){
            System.out.println("The weather is BAD😫");
        }

 */
        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 and 12 characters!");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain space or underscores");
        } else {
            System.out.println("Hello " + username);
        }
        scanner.close();
    }
}
