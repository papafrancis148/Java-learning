import java.util.Scanner;

public class Day5 {
    public static void main(String[] args){
        //MATH OPERATORS USED IN JAVA
/*        //System.out.println(Math.PI);
        //System.out.println(Math.E);
         double result;

        result = Math.pow(2, 3);  // N.B the M in Math must be in capital letters
        result = Math.abs(-3);
        result = Math.sqrt(4);
        result = Math.round(4.534);
        result = Math.ceil(4.534);
        result = Math.floor(4.99);
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        System.out.println(result);

 */
        // HYPOTENUSE OF A RIGHT TRIANGLE c = Math.sqrt(a^2 + b^2)

/*        Scanner scanner = new Scanner(System.in);

        String triangle;
        double height;
        double width;
        double Hypotenuse;

        System.out.print("What is the value of height?: ");
        height = scanner.nextDouble();
        System.out.print("What is the value of width?: ");
        width = scanner.nextDouble();

        Hypotenuse = Math.sqrt((Math.pow(height, 2)) + (Math.pow(width, 2)));

        System.out.println("\nThe hypotenuse of the triangle is " + Area + "cm²");

        scanner.close();
 */
        // CIRCUMFERENCE OF A CIRCLE/SPHERE = 2 * Math.PI * radius;
        // AREA OF A CIRCLE/SPHERE = Math.PI * Math.pow(radius, 2);
        // VOLUME OF A SPHERE = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

/*        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * (Math.PI * radius);
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

//      System.out.println("The circumference of the circle is " + circumference + "cm.");
//      System.out.println("The area of the circle is " + area + "cm²");
//      System.out.println("The volume of the sphere is " + volume + "cm³");

        //IF YOU DO NOT WANT IT TO DISPLAY ALL THE NUMBERS AFTER THE DECIMAL POINT REPLACE println() with printf()
        // ADD %.1f the . after the percent is to round it up to 1 decimal place it can vary from .1 - .infinity
        // ALSO YOU USE A COMMA e.g (,) NOT A PLUS SIGN (+) FOR PRINTF STATEMENTS
        System.out.printf("The circumference of the circle is: %.1fcm", circumference);
        System.out.printf(" \nThe area of the circle is: %.1fcm²", area);
        System.out.printf("\nThe volume of the sphere is: %.1fcm³", volume);

        scanner.close();
*/
        // PRINTF() = IS A METHOD USED TO FORMAT OUTPUT
        // %[FLAGS][WIDTH[.PRECISION][SPECIFIER-CHARACTER]
        //SPECIFIER-CHARACTER: This is the first letter of the variable of the data type we're trying to insert e.g(String its specifier-character is 's' N.B it is always in small letter
        // % is a placeholder and comes before the specifier-character
        // PRECISION: This is used to set a limit on the amount of digits that display after a decimal
/*        String name = "John";
        char firstLetter = 'J';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter); // When dealing with printf() statements you ave to manually insert new line characters e.g \n otherwise the output will all be on the same line
        System.out.printf("You are %d years old\n", age); //For int and double the specifier-characters are d and f respectively
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age); // This is how you insert multiple variables within the same line
        System.out.printf("%s name starts with the letter %c he is %f inches tall", name, firstLetter, height);
*/
      // PRECISION STATEMENTS

/*      double price1 = 9.99;
        double price2 = 100.15;
        double price3 = 54.01;

        System.out.printf("%.2f\n", price1); //. this is the precision you can use it to display the amount of digits you want to appear after the decimal
        System.out.printf("%.2f\n", price2); // N.B the . comes in between % and f
        System.out.printf("%.2f\n", price3);
*/
        // FLAGS STATEMENTS

        // + = output a plus sign
        // , = comma grouping separator
        // ( = negative numbers are encloses in ()
        // space = display a minus if negative, space if positive

/*      double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);
*/
        // WIDTH STATEMENTS: This is used to align numbers in the output

        // 0 = zero padding N>B when using this follow the place-holder with 0 e.g 04
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1); //N.B when using this follow the place-holder with 0 then the amount of digits with zero padding e.g 4 as in 04
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
