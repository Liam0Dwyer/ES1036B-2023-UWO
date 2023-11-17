package Q3;
import Q1.MethodDemo; //imports the MethodDemo class from package Q1
import java.util.Scanner; //imports the scanner class from package java.util

public class SumCity { //declaration of driver class
    public static String sumValues(String str1, String str2) //defines the sumValues function that takes two strings and adds them together
    {
        return str1+str2;//returns the string one plus string two
    }
    public static double sumValues(double num1, double num2)//defines sumValues that takes DOUBLE values and returns the sum
    {
        return num1+num2; //returns the sum of the two numbers
    }
    public static int sumValues(char char1, char char2) //defines the sumValue function that takes two CHARACTERS as input and returns an INTEGER
    {
        return (char1+char2); // Returns the INTEGER value of char1+char2
    }
    public static void main(String[] args) { //driver method header
        MethodDemo.myHeader(1,3,"This program takes user input then adds said input together, this is done in three different ways with different data types"); //myHeader() call
        Scanner userInput = new Scanner(System.in); // create new scanner object
        System.out.printf("Please input a real number:"); // prints message to console
        double num1 = userInput.nextDouble(); // declares num1 and sets it equal to the next double input
        System.out.printf("Please input a second real number:"); //prints message to console
        double num2 = userInput.nextDouble(); //declares num2 and sets it to next double input
        System.out.printf("The sum of %.2f and %.2f is %.2f\n\nPlease enter a character:", num1, num2, sumValues(num1,num2)); //prints message to console and inserts num1, num2 and calls the sumValues function and prints the resu;t
        char char1 = userInput.next().charAt(0); //declares char1 and sets it equal to the next character input
        System.out.printf("Please input a second character:"); //prints message to console
        char char2 = userInput.next().charAt(0); //declares char2 and sets it equal to the next character input
        System.out.printf("The sum of %c and %c is %c, which has an integer value of %d\n\nPlease enter your name:", char1, char2, (char)sumValues(char1,char2), (sumValues(char1,char2)));
        //The line above is a simple print statement however I would like to mention that because the sumValues() method-
        //-Returns an integer when given two characters, you need to cast the int to a char to display the value in unicode format
        userInput.nextLine(); //dummy call, clears \n in buffer
        String userName = userInput.nextLine(); // sets the string 'userName' equal to the next line of text entered
        System.out.print(sumValues("My name is ", userName)); //prints the result of the sumValues function
        MethodDemo.myFooter(3); //calls the myFooter method from the MethodDemo class

    }
}
