/*
Liam O'Dwyer
251324178
Jan 30 2023
This program takes user input for the height and radius of a cone, then calculates the volume of the cone based on the input
*/
package Q2;
import java.util.Scanner; // imports scanner class

public class ConeVolumeCalc { //declaration of driver class
    public static void main(String[] args) { // declaration of driver method - main()
        Scanner userInput = new Scanner(System.in); //Creates a scanner object to take user input
        System.out.printf("************************%nLiam O'Dwyer%n251324178%nJan 30 2023%nThis program takes user input for the height and radius of a cone, then calculates the volume of the cone based on the input%n************************%n");
        System.out.printf("Please enter the height of the cone: %n"); // Prints a string to the console
        double height = userInput.nextDouble(); // declares the height variable and assigns it to the next double value inputted by the user
        System.out.printf("Please enter the radius of the cone: %n"); // Prints a string to the console
        double radius = userInput.nextDouble(); // declares radius and assigns to the user input
        System.out.printf("The volume of a cone %.2f units in height, and with a radius of %.2f units has a volume of %.2f units cubed", height, radius, (Math.PI * Math.pow(radius, 2) * height / 3));
        // the above line prints the string and inserts floating point values sequentially from left to right
    }
}
