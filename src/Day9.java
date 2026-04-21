import java.util.Scanner;

public class Day9 {
    public static void main(String[] args){
        // TEMPERATURE CONVERSION
        // Celsius to Fahrenheit

      Scanner scanner = new Scanner(System.in);
/*
        double celsius;
        double fahrenheit;
        int choice;

        System.out.println("Temperature Conversion:");
        System.out.println("1: Convert from Fahrenheit to Celsius");
        System.out.println("2: Convert from Celsius to Fahrenheit");
        System.out.print("Which temperature do you wish to convert?: ");
        choice = scanner.nextInt();
         if (choice == 1){
             System.out.print("Enter the value in Fahrenheit: ");
             fahrenheit = scanner.nextDouble();
             celsius = (fahrenheit - 32) * 5/9;
             System.out.printf("The temperature is %.2f degrees Celsius", celsius);
         } else if (choice == 2) {
             System.out.print("Enter the value in Celsius: ");
             celsius = scanner.nextDouble();
             fahrenheit = (celsius * 9/5) + 32;
             System.out.printf("The temperature is %.2f degrees Fahrenheit", fahrenheit);
         }else {
             System.out.println("Invalid input!");
         }
*/
        // This is another way to convert using the Ternary Operator

/*      double temp;
        double newTemp;
        String unit;

        System.out.print("Enter a temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase(); // We use the next method to get the next character. NB The .toUpperCase is known as method chaining it helps to convert anthing the user types to uppercase the same can be done for lowercase

        // (condition)? ifTrue : ifFalse
        newTemp = (unit.equals("C")) ?(temp - 32) * 5/9 : (temp * (5/9)) + 32; // N.B When using the Ternary operator for string you use .equals not ==.

        System.out.printf("the temperature is %.2f°%s", newTemp, unit);
*/
        // SWITCHES = This a replacement to using many else-if statements
        // ENHANCED SWITCHES = This ia a Java 14 feature that does the work of switches

        System.out.print("Enter a day of the week: ");
        String day;
        day = scanner.nextLine();
/*       // There are too many else-if statements
        if (day.equals("Monday")){
            System.out.println("It is a week day😫");
        }
        else if (day.equals("Tuesday")) {
            System.out.println("It is a weekday");
        }
        else if (day.equals("Saturday")) {
            System.out.println("It is a weekend😁");
        }
        else {
            System.out.println("This is not a day of the week");
        }
*/
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday😫");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend😁 ");
            default -> System.out.println(day + " is not a day"); // Behaves similar to your else statement if no above conditions are true then you will do this
        }
        scanner.close();
    }
}
