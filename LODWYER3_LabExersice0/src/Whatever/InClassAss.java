package Whatever;
import java.util.Scanner;

public class InClassAss {

    // Some Random in class thing assignment
public class InClassCodes {
    static void twoDigSeparator() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input a two digit integer number");
        int userIn = myScanner.nextInt();
        int tens = userIn / 10;
        int ones = userIn % 10;
        System.out.println(userIn + " is made up of " + tens + " tens " + ones + " ones");
    }
    static void circleAreaCalculator(){
        Scanner input = new Scanner(System.in);
        double r = 0;
        System.out.println("enter radius");
        r = input.nextDouble();
        System.out.println("The area of a " + r + "unit radius circle is: " + (4 * Math.PI * Math.pow(r, 2)) + " units squared%n");
    }
    static double numberAverage() {
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Please input the first number%n");
        double x = userInput.nextDouble();
        System.out.printf("Please input the second number%n");
        double y = userInput.nextDouble();
        System.out.printf("Please input the third number%n");
        double z = userInput.nextDouble();
        double avg = (x+y+z)/3.0;
        System.out.printf("The average of your three numbers is: %.2f%n", avg);
        return avg;

    }
    static void coinCalculator(){
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Please input a two digit decimal number between 0 and 1%n");
        double totalValue = userInput.nextDouble();
        int numberOfQuarters = (int)(totalValue/0.25);
        double newValue = totalValue%0.25;
        int numberOfDimes = (int)(newValue/0.1);
        newValue = newValue%0.1;
        int numberOfNickels = (int)(newValue/0.05);
        newValue = newValue%0.05;
        int pennies = (int)Math.round(newValue/0.01);
        System.out.printf("The amount %.2f can be made out of %d quarters, %d dimes, %d nickels, and %d pennies", totalValue, numberOfQuarters, numberOfDimes, numberOfNickels, pennies);

    }
}
    public static void main(String[] args)
    {
    InClassCodes.twoDigSeparator();
    InClassCodes.circleAreaCalculator();
    InClassCodes.numberAverage();
    InClassCodes.coinCalculator();

        System.out.printf("%d", -5 % -10);
    }
}
