package LAB3Q;

import java.util.Scanner;

public class DemoMyMethodsLiam {//class header declaration
    public static Scanner input = new Scanner(System.in); // new scanner object "input"

    public static void main(String[] args) {//main method header
        MyMethod.myHeader(3,1,"Menu program with 4 options"); // myHeader call
        char choice; // new char choice
        while(true) // infinite loop
        {
            // Print messages:
            System.out.printf("\n======MENU======\na: Power Function\nb: Factorial Function\nc: Sine Function\nd: Cosine Function\ne: exit");
            System.out.println("\nPlease enter your choice: ");
            choice = input.nextLine().charAt(0); // take user input
            if (choice >= 65 && choice <= 69) // filters uppercase characters
            {
                choice = MyMethod.myCharToLowercase(choice); // converts uppercase characters to lowercase character based on method defined in MyMethod Class
            }
            switch(choice) // switch statement with parameter choice
            {
                case('a'): // when choice = a, execute the following:
                    //prints messages
                    System.out.printf("\nPOWER FUNCTION: Calculating x to the power of y");
                    System.out.printf("\nEnter double x:");
                    double x = input.nextDouble(); // takes user input for x value
                    System.out.printf("Enter int y:"); // prints message
                    int y = input.nextInt(); // takes user input for y value
                    input.nextLine(); // clears input buffer
                    //prints message and calls myPow from MyMethod class and passes x and y
                    System.out.printf("\n%.2f^%d=%.2f\n", x, y, MyMethod.myPow(x,y));
                    break; // breaks switch statement
                case('b'): // if choice = b, execute the following:
                    System.out.printf("\nFACTORIAL FUNCTION: Calculating x!");
                   while (true) // infinite loop, broken upon successful completion
                   {
                       System.out.printf("\nEnter int x:"); // prints message
                       y = input.nextInt(); // takes user input for y
                       input.nextLine(); // clears buffer
                       if (y > 0) { // if valid character is inputted do the following:
                           System.out.printf("\n%d! = %.2e\n", y, MyMethod.factorial(y));
                           // print message and call factorial from MyMethod Class
                           // SUPER IMPORTANT THAT THE VALUE IS STORED IN A DOUBLE, OTHERWISE YOU'LL GET AN INTEGER OVERFLOW
                           break; // LOOP break statement
                       } else { // if invalid character is inputted, do the following:
                           System.out.printf("Please enter a number >= 0");
                       } // loop repeats so user can enter a valid character
                   }
                   break; // SWITCH break statement
                case('c'):
                    // Print messages:
                    System.out.printf("\nSINE FUNCTION: Calculating sin(x)");
                    System.out.printf("\nEnter double x in degrees:");
                    x = input.nextDouble(); // takes user input for value of x
                    input.nextLine(); // clears buffer
                    // prints message with some fancy character formatting and calls mySin and myDegreeToRadian functions from MyMethod Class
                    System.out.printf("\nsin(%.2f%c) = %.2f\n", x, (176), MyMethod.mySin(MyMethod.myDegreeToRadian(x)));
                    break; // switch break statement
                case('d'): // if choice = d do the following:
                    // print messages
                    System.out.printf("\nCOSINE FUNCTION: Calculating cos(x)");
                    System.out.printf("\nEnter double x in degrees:");
                    x = input.nextDouble(); // take user input for x
                    input.nextLine(); // clear buffer
                    System.out.printf("\ncos(%.2f%c) = %.2f\n", x, (176), MyMethod.myCos(MyMethod.myDegreeToRadian(x)));
                    // prints message with some fancy character formatting and calls myCos and myDegreeToRadian functions from MyMethod Class
                    break; // switch break statement
                case('e'):
                    break; // loop break statement
                default: // if none of the above conditions are met, this code is run instead:
                    System.out.println("Please enter a valid character (A-E or a-e)"); // prints message
            }
            if (choice=='e') //if the last choice was e, execute the following code:
            {
                break; // while(true) loop break statement
            }
        }
        MyMethod.myFooter(1); // prints footer using myFooter method
    }
}
