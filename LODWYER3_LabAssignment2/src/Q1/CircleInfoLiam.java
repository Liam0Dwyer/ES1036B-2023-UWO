package Q1;
import java.util.Scanner; //Imports the scanner class

public class CircleInfoLiam { // driver class declaration
    public static void main(String[] args) // main method header
    {
        myHeader(1,1,"This program takes user input for the radius of a circle, then calculates and returns various values of the circle"); //calls myHeader() function with appropriate arguments
        Scanner userIn = new Scanner(System.in); // creating scanner object named userIn
        Circle myCircle = new Circle(); // creating circle object named myCircle
        System.out.printf("Please enter a radius value:"); // prints message
        double radius = userIn.nextDouble(); // declares and initializes radius to the next double input
        myCircle.setRadius(radius); // calls the setRadius() function from within the myCircle object
        System.out.printf("\nCircle info:\nRadius: %.3f units\nArea: %.3f units squared\nDiameter: %.3f units\nCircumference: %.3f units\n", myCircle.getRadius(),myCircle.getArea(),myCircle.getDiameter(),myCircle.getCircumference());
        // Above line prints a string of text, then makes method calls to determine various values of the circle
        myFooter(1); // Calls myFooter() function
    }
    public static void myHeader(int labNum, int questionNum, String description) // defines myHeader method, which takes two ints and a string as input
    {
        System.out.printf("************************%nFull Name: Liam O'Dwyer%nLab Number: %d, Question: %d %nProgram Description: %s%n************************%n", labNum, questionNum, description);
        //above line prints a message to the console which includes the values it was passed
    }

    public static void myFooter(int questionNum) //defines myFooter method, which takes an int as input
    {
        System.out.printf("%n********** Signing off from question %d -Liam **********", questionNum); //prints a message with the passed value
    }
}
