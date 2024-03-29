/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
        System.out.print("\nEnter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your grade: ");
        int grade = in.nextInt();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Enter your hometown: ");
        String hometown = in.nextLine();

        System.out.println("\nNAME     : " + firstName + " " + lastName);
        System.out.println("GRADE    : " + grade);
        System.out.println("AGE      : " + age);
        System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

        System.out.print("\nEnter a dollar amount: ");
        double amount = in.nextDouble();

        amount = amount*100;
        final double DOLLAR = 100;
        final double QUARTER = 25;
        final double DIME = 10;
        final double NICKEL = 5;
        final double PENNY = 1;

        double dollars = Math.floor(amount/DOLLAR);
        double remaining = amount % DOLLAR;
        double quarters = Math.floor(remaining/QUARTER);
        remaining =  remaining % QUARTER;
        double dimes = Math.floor(remaining/DIME);
        remaining = remaining % DIME;
        double nickles = Math.floor(remaining/NICKEL);
        remaining =  remaining % NICKEL;
        double pennies = Math.floor(remaining/PENNY);
        remaining =  remaining % PENNY;

        System.out.printf("\nDOLLARS  : %.0f\n", dollars);
        System.out.printf("QUARTERS : %.0f\n", quarters);
        System.out.printf("DIMES    : %.0f\n", dimes);
        System.out.printf("NICKELS  : %.0f\n", nickles);
        System.out.printf("PENNIES  : %.0f\n", pennies);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();

         dollarAmount = dollarAmount*100;
         final double FIVE_BILL = 500;
         final double TEN_BILL = 1000;
         double tens = Math.floor(dollarAmount/TEN_BILL);
         double remaining2 = dollarAmount % TEN_BILL;
         double fives = Math.floor(remaining2/FIVE_BILL);
         remaining2 = remaining2 % FIVE_BILL;
         double dollars2 = Math.floor(remaining2/DOLLAR);
         remaining2 = remaining2 % DOLLAR;
         double quarters2 = Math.floor(remaining2/QUARTER);
         remaining2 =  remaining2 % QUARTER;
         double dimes2 = Math.floor(remaining2/DIME);
         remaining2 = remaining2 % DIME;
         double nickels2 = Math.floor(remaining2/NICKEL);
         remaining2 =  remaining2 % NICKEL;
         double pennies2 = Math.floor(remaining2/PENNY);
         remaining2 =  remaining2 % PENNY;

         double coins = pennies2 + nickels2 + dimes2 + quarters2;
         double bills = dollars2 + fives + tens;

         System.out.printf("\nBILLS : %.0f\n", bills);
         System.out.printf("COINS : %.0f\n", coins);




        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
         System.out.print("\nEnter a number of inches: ");
         double totalInches = in.nextDouble();

         final double MILE = 63360;
         final double YARD = 36;
         final double FOOT = 12;
         final double INCH = 1;

         double miles = Math.floor(totalInches/MILE);
         double inchesLeft = totalInches % MILE;
         double yards = Math.floor(inchesLeft/YARD);
         inchesLeft = inchesLeft % YARD;
         double feet = Math.floor(inchesLeft/FOOT);
         inchesLeft = inchesLeft % FOOT;
         double inches = Math.floor(inchesLeft/INCH);
         inchesLeft =  inchesLeft % INCH;

         System.out.printf("\nMILES  : %.0f\n", miles);
         System.out.printf("YARDS  : %.0f\n", yards);
         System.out.printf("FEET   : %.0f\n", feet);
         System.out.printf("INCHES : %.0f\n", inches);



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
         System.out.print("\nEnter a number of centimeters: ");
         double totalCentimeters = in.nextDouble();

         final double KILOMETER = 100000;
         final double METER = 100;
         final double CENTIMETER = 1;

         double kilometers = Math.floor(totalCentimeters/KILOMETER);
         double centimetersLeft = totalCentimeters % KILOMETER;
         double meters = Math.floor(centimetersLeft/METER);
         centimetersLeft = centimetersLeft % METER;
         double centimeters = Math.floor(centimetersLeft/CENTIMETER);
         centimetersLeft = centimetersLeft % CENTIMETER;

         System.out.printf("\nKILOMETERS  : %.0f\n", kilometers);
         System.out.printf("METERS      : %.0f\n", meters);
         System.out.printf("CENTIMETERS : %.0f\n", centimeters);


        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         double radius = diameter/2;

         double area = Math.PI*(radius*radius);
         double circumference = (2*Math.PI)*radius;

         System.out.printf("\nAREA          : %.2f\n", area);
         System.out.printf("CIRCUMFERENCE : %.2f\n", circumference);


        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
         System.out.print("\nEnter a length: ");
         double length = in.nextDouble();
         System.out.print("Enter a width: ");
         double width = in.nextDouble();

         double rectangleArea = length * width;
         double perimeter = (length*2)+(width*2);
         double diagonal = Math.hypot(length, width);

         System.out.printf("\nAREA      : %.2f\n", rectangleArea);
         System.out.printf("PERIMETER : %.2f\n", perimeter);
         System.out.printf("DIAGONAL  : %.2f\n", diagonal);


        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
         System.out.print("\nEnter a side length: ");
         double sideLength = in.nextDouble();

         double hexagonArea = ((3*Math.sqrt(3))/2)*(sideLength*sideLength);
         double hexagonPerimeter = sideLength*6;

         System.out.printf("\nAREA      : %.2f\n", hexagonArea);
         System.out.printf("PERIMETER : %.2f\n", hexagonPerimeter);


        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */
         System.out.print("\nEnter a String: ");
         String input = in.next();

         int stringLength = (input.length()/2);
         String secondHalf = input.substring(stringLength);
         String firstHalf = input.substring(0,stringLength);
         String reverseString = secondHalf+firstHalf;

         System.out.println("\n" + reverseString);


        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */
         System.out.print("\nEnter your first name: ");
         String firstName2 = in.next();
         System.out.print("Enter your middle name: ");
         String middleName2 = in.next();
         System.out.print("Enter your last name: ");
         String lastName2 = in.next();

         String firstLetterOfFirst = firstName2.substring(0,1);
         String firstLetterOfMiddle = middleName2.substring(0,1);
         String firstLetterOfLast = lastName2.substring(0,1);

         System.out.println("\n" + firstLetterOfFirst + firstLetterOfMiddle + firstLetterOfLast);


        in.close();
    }
}
