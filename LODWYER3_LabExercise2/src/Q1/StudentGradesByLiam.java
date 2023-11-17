package Q1;
import java.util.Scanner;

public class StudentGradesByLiam { //driver class declaration
    public static void main(String[] args) //main method header
    {
        myHeader(1,1,"This program takes user input and uses classes to compare grades of two students");
        // Calls myHeader() method defined below
        Student s1 = new Student(); // Creates new student object s1 defined by the student class
        s1.printInfo(); // Calls the printInfo() method from inside the student class from instance object s1
        Student s2 = new Student(); // Creates new student object s2 defined by the student class
        System.out.println("\n-Student 1-"); // prints message to standard output
        dataEntry(s1); // Calls the dataEntry() method and passes the s1 student object
        System.out.println("\n-Student 2"); // prints message to standard output
        dataEntry(s2); // Calls the dataEntry() method and passes the s2 student object
        System.out.println("\nStudent Info:\n================================================================"); // Prints message to console
        s1.printInfo(); // Calls the printInfo() method from inside the student class from instance object s1
        s2.printInfo();// Calls the printInfo() method from inside the student class from instance object s2
        System.out.println("================================================================\n"); // Prints message to console
        if (compareGrades(s1,s2) == 1) // if statement that calls the compareGrades() method, which returns either -1, 0, 1 depending on what student object has the higher assignment grade
        {
            System.out.printf("Note: %s scored higher than %s", s1.getName(), s2.getName()); // Prints a message to console if the output of compareGrades is equal to 1
        }
        else if (compareGrades(s1,s2) == 0) // else if statement
        {
            System.out.printf("Note: both %s and %s scored the same!", s1.getName(), s2.getName()); // Prints a message to console if the output of compareGrades() is equal to 0
        }
        else // else statement, meaning that if the prior two statements were not satisfied, to do the following:
        {
            System.out.printf("Note: %s scored higher than %s", s2.getName(), s1.getName()); // prints a message to console
        }
    }

    public static Scanner input = new Scanner(System.in); // Creates a new public scanner object under the name input
    public static int instanceCounter = 0; // Creates a new int called instanceCounter
    public static void dataEntry(Student s) // Definition of dataEntry() method
    {
        System.out.printf("Please enter student number: "); // Prints message to standard output
        int num = input.nextInt(); // sets the int num equal to the next integer input
        s.setStudentNumber(num); // calls the setStudentNumber() function from the student object and passes it the num int
        System.out.printf("Please enter student name: "); // Prints message to standard output
        input.nextLine(); // Buffer line dummy call
        String nam = input.nextLine(); // sets the string nam equal to the next string input
        s.setName(nam); // calls the setStudentName() function from the student object and passes it the num int
        System.out.printf("Please enter integer score value: "); // Prints message to standard output
        int sco = input.nextInt(); // sets the int sco equal to the next integer input
        s.setScore(sco); // calls the setScore() function from the student object and passes it the sco int
        ++instanceCounter; // increments the instanceCounter int by 1
    }
    public static int compareGrades(Student s1, Student s2)
    { //Comparegrades returns 1 if first student has a higher grade, 0 if they are equal, and -1 if the second student is higher
        if (s1.getScore() > s2.getScore())
        {
            return 1;
        }
        else if (s1.getScore() == s2.getScore())
        {
            return 0;
        }
        else
        {
            return -1;
        }
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

